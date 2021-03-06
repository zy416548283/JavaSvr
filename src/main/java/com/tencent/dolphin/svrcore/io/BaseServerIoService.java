package com.tencent.dolphin.svrcore.io;

import com.google.inject.Injector;
import com.tencent.dolphin.svrcore.packet.CodecService;
import com.tencent.dolphin.svrcore.packet.IoPacket;
import com.tencent.dolphin.svrcore.ps.Processor;
import com.tencent.dolphin.svrcore.ps.ProcessorService;
import com.tencent.dolphin.svrcore.utils.MonitorUtils;
import com.tencent.dolphin.svrcore.utils.NicUtil;
import com.tencent.dolphin.svrcore.ws.WorkerService;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.commons.configuration.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public abstract class BaseServerIoService 
		extends SimpleChannelInboundHandler<IoPacket>
		implements ServerIoService {
	static final Logger log = LoggerFactory.getLogger(BaseServerIoService.class);
	
	protected SocketAddress bindAddr = null;
	protected CodecService codec = null;
	protected WorkerService worker = null;
	protected ProcessorService mapper = null;
	
	protected final Injector injector;
	
	public BaseServerIoService(Injector injector) {
		this.injector = injector;
		Configuration config = injector.getInstance(Configuration.class);
		int bindPort = config.getInt("server.bind.port", 0);
		if (bindPort != 0)
			setBindNic(config.getString("server.bind.nic", "eth1"), bindPort);
	}

	@Override
	public ServerIoService setBindNic(String nic, int port) {
		String ip = NicUtil.resolveNicAddr(nic);
		this.bindAddr = new InetSocketAddress(ip, port);
		return this;
	}

	@Override
	public ServerIoService setBindAddr(SocketAddress addr) {
		this.bindAddr = addr;
		return this;
	}

	@Override
	public ServerIoService setBindIpPort(String ip, int port) {
		this.bindAddr = new InetSocketAddress(ip, port);
		return this;
	}

	@Override
	public ServerIoService setCodecService(CodecService codec) {
		this.codec = codec;
		return this;
	}
	
	@Override
	public ServerIoService setWorkerService(WorkerService worker) {
		this.worker = worker;
		return this;
	}
	
	@Override
	public ServerIoService setProcessorService(ProcessorService mapper) {
		this.mapper = mapper;
		return this;
	}
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, IoPacket msg)
			throws Exception {
		log.info("iocmd:{}", msg.getIoCmd());;
		Processor<IoPacket, IoPacket> processor = mapper.map(ctx.channel(), msg);
		if (processor == null){
			log.error(ctx.channel().remoteAddress() + " NO processor for " + msg.getIoCmd());
			return;
		}
		log.info("processor:{}", processor);
		
		worker.dispatch(ctx.channel(), msg, processor);
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		MonitorUtils.monitor(2018810); // server通道异常
		log.error("error in channel " + ctx.channel().remoteAddress(), cause);
	}
}
