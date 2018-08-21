// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: echo.proto

package com.tencent.dolphin.proto;

public final class EchoProto {
  private EchoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EchoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EchoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 uin = 1;</code>
     *
     * <pre>
     *uin
     * </pre>
     */
    boolean hasUin();
    /**
     * <code>optional uint64 uin = 1;</code>
     *
     * <pre>
     *uin
     * </pre>
     */
    long getUin();

    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    boolean hasEchoMsg();
    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    String getEchoMsg();
    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    com.google.protobuf.ByteString
        getEchoMsgBytes();
  }
  /**
   * Protobuf type {@code EchoReq}
   *
   * <pre>
   *CMD=0
   *给echo
   * </pre>
   */
  public static final class EchoReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:EchoReq)
      EchoReqOrBuilder {
    // Use EchoReq.newBuilder() to construct.
    private EchoReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private EchoReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final EchoReq defaultInstance;
    public static EchoReq getDefaultInstance() {
      return defaultInstance;
    }

    public EchoReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private EchoReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              uin_ = input.readUInt64();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              echoMsg_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EchoProto.internal_static_EchoReq_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EchoProto.internal_static_EchoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EchoReq.class, Builder.class);
    }

    public static com.google.protobuf.Parser<EchoReq> PARSER =
        new com.google.protobuf.AbstractParser<EchoReq>() {
      public EchoReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EchoReq(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<EchoReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int UIN_FIELD_NUMBER = 1;
    private long uin_;
    /**
     * <code>optional uint64 uin = 1;</code>
     *
     * <pre>
     *uin
     * </pre>
     */
    public boolean hasUin() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 uin = 1;</code>
     *
     * <pre>
     *uin
     * </pre>
     */
    public long getUin() {
      return uin_;
    }

    public static final int ECHO_MSG_FIELD_NUMBER = 2;
    private Object echoMsg_;
    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    public boolean hasEchoMsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    public String getEchoMsg() {
      Object ref = echoMsg_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          echoMsg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    public com.google.protobuf.ByteString
        getEchoMsgBytes() {
      Object ref = echoMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        echoMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      uin_ = 0L;
      echoMsg_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, uin_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getEchoMsgBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, uin_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getEchoMsgBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static EchoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EchoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EchoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EchoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EchoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static EchoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static EchoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static EchoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static EchoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static EchoReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(EchoReq prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code EchoReq}
     *
     * <pre>
     *CMD=0
     *给echo
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EchoReq)
        EchoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EchoProto.internal_static_EchoReq_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EchoProto.internal_static_EchoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EchoReq.class, Builder.class);
      }

      // Construct using com.tencent.dolphin.proto.EchoProto.EchoReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        uin_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        echoMsg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EchoProto.internal_static_EchoReq_descriptor;
      }

      public EchoReq getDefaultInstanceForType() {
        return EchoReq.getDefaultInstance();
      }

      public EchoReq build() {
        EchoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public EchoReq buildPartial() {
        EchoReq result = new EchoReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uin_ = uin_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.echoMsg_ = echoMsg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof EchoReq) {
          return mergeFrom((EchoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EchoReq other) {
        if (other == EchoReq.getDefaultInstance()) return this;
        if (other.hasUin()) {
          setUin(other.getUin());
        }
        if (other.hasEchoMsg()) {
          bitField0_ |= 0x00000002;
          echoMsg_ = other.echoMsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        EchoReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EchoReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long uin_ ;
      /**
       * <code>optional uint64 uin = 1;</code>
       *
       * <pre>
       *uin
       * </pre>
       */
      public boolean hasUin() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 uin = 1;</code>
       *
       * <pre>
       *uin
       * </pre>
       */
      public long getUin() {
        return uin_;
      }
      /**
       * <code>optional uint64 uin = 1;</code>
       *
       * <pre>
       *uin
       * </pre>
       */
      public Builder setUin(long value) {
        bitField0_ |= 0x00000001;
        uin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 uin = 1;</code>
       *
       * <pre>
       *uin
       * </pre>
       */
      public Builder clearUin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uin_ = 0L;
        onChanged();
        return this;
      }

      private Object echoMsg_ = "";
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public boolean hasEchoMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public String getEchoMsg() {
        Object ref = echoMsg_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            echoMsg_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public com.google.protobuf.ByteString
          getEchoMsgBytes() {
        Object ref = echoMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          echoMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public Builder setEchoMsg(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        echoMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public Builder clearEchoMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        echoMsg_ = getDefaultInstance().getEchoMsg();
        onChanged();
        return this;
      }
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public Builder setEchoMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        echoMsg_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:EchoReq)
    }

    static {
      defaultInstance = new EchoReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:EchoReq)
  }

  public interface EchoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EchoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 uin = 1;</code>
     *
     * <pre>
     *uin
     * </pre>
     */
    boolean hasUin();
    /**
     * <code>optional uint64 uin = 1;</code>
     *
     * <pre>
     *uin
     * </pre>
     */
    long getUin();

    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    boolean hasEchoMsg();
    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    String getEchoMsg();
    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    com.google.protobuf.ByteString
        getEchoMsgBytes();
  }
  /**
   * Protobuf type {@code EchoRsp}
   */
  public static final class EchoRsp extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:EchoRsp)
      EchoRspOrBuilder {
    // Use EchoRsp.newBuilder() to construct.
    private EchoRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private EchoRsp(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final EchoRsp defaultInstance;
    public static EchoRsp getDefaultInstance() {
      return defaultInstance;
    }

    public EchoRsp getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private EchoRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              uin_ = input.readUInt64();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              echoMsg_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EchoProto.internal_static_EchoRsp_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EchoProto.internal_static_EchoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EchoRsp.class, Builder.class);
    }

    public static com.google.protobuf.Parser<EchoRsp> PARSER =
        new com.google.protobuf.AbstractParser<EchoRsp>() {
      public EchoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EchoRsp(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<EchoRsp> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int UIN_FIELD_NUMBER = 1;
    private long uin_;
    /**
     * <code>optional uint64 uin = 1;</code>
     *
     * <pre>
     *uin
     * </pre>
     */
    public boolean hasUin() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 uin = 1;</code>
     *
     * <pre>
     *uin
     * </pre>
     */
    public long getUin() {
      return uin_;
    }

    public static final int ECHO_MSG_FIELD_NUMBER = 2;
    private Object echoMsg_;
    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    public boolean hasEchoMsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    public String getEchoMsg() {
      Object ref = echoMsg_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          echoMsg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string echo_msg = 2;</code>
     *
     * <pre>
     *echo msg
     * </pre>
     */
    public com.google.protobuf.ByteString
        getEchoMsgBytes() {
      Object ref = echoMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        echoMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      uin_ = 0L;
      echoMsg_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, uin_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getEchoMsgBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, uin_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getEchoMsgBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static EchoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EchoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EchoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EchoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EchoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static EchoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static EchoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static EchoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static EchoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static EchoRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(EchoRsp prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code EchoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EchoRsp)
        EchoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EchoProto.internal_static_EchoRsp_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EchoProto.internal_static_EchoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EchoRsp.class, Builder.class);
      }

      // Construct using com.tencent.dolphin.proto.EchoProto.EchoRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        uin_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        echoMsg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EchoProto.internal_static_EchoRsp_descriptor;
      }

      public EchoRsp getDefaultInstanceForType() {
        return EchoRsp.getDefaultInstance();
      }

      public EchoRsp build() {
        EchoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public EchoRsp buildPartial() {
        EchoRsp result = new EchoRsp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uin_ = uin_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.echoMsg_ = echoMsg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof EchoRsp) {
          return mergeFrom((EchoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EchoRsp other) {
        if (other == EchoRsp.getDefaultInstance()) return this;
        if (other.hasUin()) {
          setUin(other.getUin());
        }
        if (other.hasEchoMsg()) {
          bitField0_ |= 0x00000002;
          echoMsg_ = other.echoMsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        EchoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EchoRsp) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long uin_ ;
      /**
       * <code>optional uint64 uin = 1;</code>
       *
       * <pre>
       *uin
       * </pre>
       */
      public boolean hasUin() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 uin = 1;</code>
       *
       * <pre>
       *uin
       * </pre>
       */
      public long getUin() {
        return uin_;
      }
      /**
       * <code>optional uint64 uin = 1;</code>
       *
       * <pre>
       *uin
       * </pre>
       */
      public Builder setUin(long value) {
        bitField0_ |= 0x00000001;
        uin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 uin = 1;</code>
       *
       * <pre>
       *uin
       * </pre>
       */
      public Builder clearUin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uin_ = 0L;
        onChanged();
        return this;
      }

      private Object echoMsg_ = "";
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public boolean hasEchoMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public String getEchoMsg() {
        Object ref = echoMsg_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            echoMsg_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public com.google.protobuf.ByteString
          getEchoMsgBytes() {
        Object ref = echoMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          echoMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public Builder setEchoMsg(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        echoMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public Builder clearEchoMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        echoMsg_ = getDefaultInstance().getEchoMsg();
        onChanged();
        return this;
      }
      /**
       * <code>optional string echo_msg = 2;</code>
       *
       * <pre>
       *echo msg
       * </pre>
       */
      public Builder setEchoMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        echoMsg_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:EchoRsp)
    }

    static {
      defaultInstance = new EchoRsp(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:EchoRsp)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EchoReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_EchoReq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EchoRsp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_EchoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\necho.proto\"(\n\007EchoReq\022\013\n\003uin\030\001 \001(\004\022\020\n\010" +
      "echo_msg\030\002 \001(\t\"(\n\007EchoRsp\022\013\n\003uin\030\001 \001(\004\022\020" +
      "\n\010echo_msg\030\002 \001(\tB%\n\030com.tencent.dolphin.p" +
      "rotoB\tEchoProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_EchoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EchoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_EchoReq_descriptor,
        new String[] { "Uin", "EchoMsg", });
    internal_static_EchoRsp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_EchoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_EchoRsp_descriptor,
        new String[] { "Uin", "EchoMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}