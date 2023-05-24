// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExpeditionChallengeInfo.proto

package emu.grasscutter.net.proto;

public final class ExpeditionChallengeInfoOuterClass {
  private ExpeditionChallengeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExpeditionChallengeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExpeditionChallengeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finished = 11;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 open_time = 5;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>uint32 id = 4;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * Obf: IPJPEPIILAJ
   * </pre>
   *
   * Protobuf type {@code ExpeditionChallengeInfo}
   */
  public static final class ExpeditionChallengeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExpeditionChallengeInfo)
      ExpeditionChallengeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExpeditionChallengeInfo.newBuilder() to construct.
    private ExpeditionChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExpeditionChallengeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExpeditionChallengeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExpeditionChallengeInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 32: {

              id_ = input.readUInt32();
              break;
            }
            case 40: {

              openTime_ = input.readUInt32();
              break;
            }
            case 88: {

              isFinished_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.internal_static_ExpeditionChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.internal_static_ExpeditionChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo.class, emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo.Builder.class);
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 11;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 11;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 5;
    private int openTime_;
    /**
     * <code>uint32 open_time = 5;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int ID_FIELD_NUMBER = 4;
    private int id_;
    /**
     * <code>uint32 id = 4;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeUInt32(4, id_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(5, openTime_);
      }
      if (isFinished_ != false) {
        output.writeBool(11, isFinished_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, id_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, openTime_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isFinished_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo other = (emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo) obj;

      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getId()
          != other.getId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: IPJPEPIILAJ
     * </pre>
     *
     * Protobuf type {@code ExpeditionChallengeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExpeditionChallengeInfo)
        emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.internal_static_ExpeditionChallengeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.internal_static_ExpeditionChallengeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo.class, emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isFinished_ = false;

        openTime_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.internal_static_ExpeditionChallengeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo build() {
        emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo buildPartial() {
        emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo result = new emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo(this);
        result.isFinished_ = isFinished_;
        result.openTime_ = openTime_;
        result.id_ = id_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo other) {
        if (other == emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo.getDefaultInstance()) return this;
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 11;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 11;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 5;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 5;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 4;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 4;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ExpeditionChallengeInfo)
    }

    // @@protoc_insertion_point(class_scope:ExpeditionChallengeInfo)
    private static final emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo();
    }

    public static emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExpeditionChallengeInfo>
        PARSER = new com.google.protobuf.AbstractParser<ExpeditionChallengeInfo>() {
      @java.lang.Override
      public ExpeditionChallengeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExpeditionChallengeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExpeditionChallengeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExpeditionChallengeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ExpeditionChallengeInfoOuterClass.ExpeditionChallengeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExpeditionChallengeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExpeditionChallengeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ExpeditionChallengeInfo.proto\"M\n\027Exped" +
      "itionChallengeInfo\022\023\n\013is_finished\030\013 \001(\010\022" +
      "\021\n\topen_time\030\005 \001(\r\022\n\n\002id\030\004 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExpeditionChallengeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExpeditionChallengeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExpeditionChallengeInfo_descriptor,
        new java.lang.String[] { "IsFinished", "OpenTime", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
