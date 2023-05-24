// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetUgcReq.proto

package emu.grasscutter.net.proto;

public final class GetUgcReqOuterClass {
  private GetUgcReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetUgcReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetUgcReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.UgcType ugc_type = 6;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    int getUgcTypeValue();
    /**
     * <code>.UgcType ugc_type = 6;</code>
     * @return The ugcType.
     */
    emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType getUgcType();

    /**
     * <code>uint64 ugc_guid = 11;</code>
     * @return The ugcGuid.
     */
    long getUgcGuid();

    /**
     * <code>.RecordUsage ugc_record_usage = 12;</code>
     * @return The enum numeric value on the wire for ugcRecordUsage.
     */
    int getUgcRecordUsageValue();
    /**
     * <code>.RecordUsage ugc_record_usage = 12;</code>
     * @return The ugcRecordUsage.
     */
    emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage getUgcRecordUsage();

    /**
     * <code>.GetUgcType get_ugc_type = 3;</code>
     * @return The enum numeric value on the wire for getUgcType.
     */
    int getGetUgcTypeValue();
    /**
     * <code>.GetUgcType get_ugc_type = 3;</code>
     * @return The getUgcType.
     */
    emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType getGetUgcType();

    /**
     * <code>bool is_require_brief = 10;</code>
     * @return The isRequireBrief.
     */
    boolean getIsRequireBrief();

    /**
     * <code>uint32 schedule_id = 14;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * CmdId: 6328
   * Obf: AFLHDFGBBED
   * </pre>
   *
   * Protobuf type {@code GetUgcReq}
   */
  public static final class GetUgcReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetUgcReq)
      GetUgcReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetUgcReq.newBuilder() to construct.
    private GetUgcReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetUgcReq() {
      ugcType_ = 0;
      ugcRecordUsage_ = 0;
      getUgcType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetUgcReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetUgcReq(
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
            case 24: {
              int rawValue = input.readEnum();

              getUgcType_ = rawValue;
              break;
            }
            case 48: {
              int rawValue = input.readEnum();

              ugcType_ = rawValue;
              break;
            }
            case 80: {

              isRequireBrief_ = input.readBool();
              break;
            }
            case 88: {

              ugcGuid_ = input.readUInt64();
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              ugcRecordUsage_ = rawValue;
              break;
            }
            case 112: {

              scheduleId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GetUgcReqOuterClass.internal_static_GetUgcReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetUgcReqOuterClass.internal_static_GetUgcReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq.class, emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq.Builder.class);
    }

    public static final int UGC_TYPE_FIELD_NUMBER = 6;
    private int ugcType_;
    /**
     * <code>.UgcType ugc_type = 6;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    @java.lang.Override public int getUgcTypeValue() {
      return ugcType_;
    }
    /**
     * <code>.UgcType ugc_type = 6;</code>
     * @return The ugcType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType getUgcType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType result = emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
      return result == null ? emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
    }

    public static final int UGC_GUID_FIELD_NUMBER = 11;
    private long ugcGuid_;
    /**
     * <code>uint64 ugc_guid = 11;</code>
     * @return The ugcGuid.
     */
    @java.lang.Override
    public long getUgcGuid() {
      return ugcGuid_;
    }

    public static final int UGC_RECORD_USAGE_FIELD_NUMBER = 12;
    private int ugcRecordUsage_;
    /**
     * <code>.RecordUsage ugc_record_usage = 12;</code>
     * @return The enum numeric value on the wire for ugcRecordUsage.
     */
    @java.lang.Override public int getUgcRecordUsageValue() {
      return ugcRecordUsage_;
    }
    /**
     * <code>.RecordUsage ugc_record_usage = 12;</code>
     * @return The ugcRecordUsage.
     */
    @java.lang.Override public emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage getUgcRecordUsage() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage result = emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage.valueOf(ugcRecordUsage_);
      return result == null ? emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage.UNRECOGNIZED : result;
    }

    public static final int GET_UGC_TYPE_FIELD_NUMBER = 3;
    private int getUgcType_;
    /**
     * <code>.GetUgcType get_ugc_type = 3;</code>
     * @return The enum numeric value on the wire for getUgcType.
     */
    @java.lang.Override public int getGetUgcTypeValue() {
      return getUgcType_;
    }
    /**
     * <code>.GetUgcType get_ugc_type = 3;</code>
     * @return The getUgcType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType getGetUgcType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType result = emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType.valueOf(getUgcType_);
      return result == null ? emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType.UNRECOGNIZED : result;
    }

    public static final int IS_REQUIRE_BRIEF_FIELD_NUMBER = 10;
    private boolean isRequireBrief_;
    /**
     * <code>bool is_require_brief = 10;</code>
     * @return The isRequireBrief.
     */
    @java.lang.Override
    public boolean getIsRequireBrief() {
      return isRequireBrief_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 14;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 14;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (getUgcType_ != emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType.GET_UGC_NONE.getNumber()) {
        output.writeEnum(3, getUgcType_);
      }
      if (ugcType_ != emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        output.writeEnum(6, ugcType_);
      }
      if (isRequireBrief_ != false) {
        output.writeBool(10, isRequireBrief_);
      }
      if (ugcGuid_ != 0L) {
        output.writeUInt64(11, ugcGuid_);
      }
      if (ugcRecordUsage_ != emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage.UGC_RECORD_USAGE_NONE.getNumber()) {
        output.writeEnum(12, ugcRecordUsage_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(14, scheduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (getUgcType_ != emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType.GET_UGC_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, getUgcType_);
      }
      if (ugcType_ != emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, ugcType_);
      }
      if (isRequireBrief_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isRequireBrief_);
      }
      if (ugcGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(11, ugcGuid_);
      }
      if (ugcRecordUsage_ != emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage.UGC_RECORD_USAGE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, ugcRecordUsage_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, scheduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq other = (emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq) obj;

      if (ugcType_ != other.ugcType_) return false;
      if (getUgcGuid()
          != other.getUgcGuid()) return false;
      if (ugcRecordUsage_ != other.ugcRecordUsage_) return false;
      if (getUgcType_ != other.getUgcType_) return false;
      if (getIsRequireBrief()
          != other.getIsRequireBrief()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      hash = (37 * hash) + UGC_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + ugcType_;
      hash = (37 * hash) + UGC_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUgcGuid());
      hash = (37 * hash) + UGC_RECORD_USAGE_FIELD_NUMBER;
      hash = (53 * hash) + ugcRecordUsage_;
      hash = (37 * hash) + GET_UGC_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getUgcType_;
      hash = (37 * hash) + IS_REQUIRE_BRIEF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRequireBrief());
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq prototype) {
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
     * CmdId: 6328
     * Obf: AFLHDFGBBED
     * </pre>
     *
     * Protobuf type {@code GetUgcReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetUgcReq)
        emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetUgcReqOuterClass.internal_static_GetUgcReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetUgcReqOuterClass.internal_static_GetUgcReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq.class, emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq.newBuilder()
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
        ugcType_ = 0;

        ugcGuid_ = 0L;

        ugcRecordUsage_ = 0;

        getUgcType_ = 0;

        isRequireBrief_ = false;

        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetUgcReqOuterClass.internal_static_GetUgcReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq build() {
        emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq buildPartial() {
        emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq result = new emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq(this);
        result.ugcType_ = ugcType_;
        result.ugcGuid_ = ugcGuid_;
        result.ugcRecordUsage_ = ugcRecordUsage_;
        result.getUgcType_ = getUgcType_;
        result.isRequireBrief_ = isRequireBrief_;
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq other) {
        if (other == emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq.getDefaultInstance()) return this;
        if (other.ugcType_ != 0) {
          setUgcTypeValue(other.getUgcTypeValue());
        }
        if (other.getUgcGuid() != 0L) {
          setUgcGuid(other.getUgcGuid());
        }
        if (other.ugcRecordUsage_ != 0) {
          setUgcRecordUsageValue(other.getUgcRecordUsageValue());
        }
        if (other.getUgcType_ != 0) {
          setGetUgcTypeValue(other.getGetUgcTypeValue());
        }
        if (other.getIsRequireBrief() != false) {
          setIsRequireBrief(other.getIsRequireBrief());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
        emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int ugcType_ = 0;
      /**
       * <code>.UgcType ugc_type = 6;</code>
       * @return The enum numeric value on the wire for ugcType.
       */
      @java.lang.Override public int getUgcTypeValue() {
        return ugcType_;
      }
      /**
       * <code>.UgcType ugc_type = 6;</code>
       * @param value The enum numeric value on the wire for ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcTypeValue(int value) {
        
        ugcType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 6;</code>
       * @return The ugcType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType getUgcType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType result = emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
        return result == null ? emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
      }
      /**
       * <code>.UgcType ugc_type = 6;</code>
       * @param value The ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcType(emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        ugcType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcType() {
        
        ugcType_ = 0;
        onChanged();
        return this;
      }

      private long ugcGuid_ ;
      /**
       * <code>uint64 ugc_guid = 11;</code>
       * @return The ugcGuid.
       */
      @java.lang.Override
      public long getUgcGuid() {
        return ugcGuid_;
      }
      /**
       * <code>uint64 ugc_guid = 11;</code>
       * @param value The ugcGuid to set.
       * @return This builder for chaining.
       */
      public Builder setUgcGuid(long value) {
        
        ugcGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 ugc_guid = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcGuid() {
        
        ugcGuid_ = 0L;
        onChanged();
        return this;
      }

      private int ugcRecordUsage_ = 0;
      /**
       * <code>.RecordUsage ugc_record_usage = 12;</code>
       * @return The enum numeric value on the wire for ugcRecordUsage.
       */
      @java.lang.Override public int getUgcRecordUsageValue() {
        return ugcRecordUsage_;
      }
      /**
       * <code>.RecordUsage ugc_record_usage = 12;</code>
       * @param value The enum numeric value on the wire for ugcRecordUsage to set.
       * @return This builder for chaining.
       */
      public Builder setUgcRecordUsageValue(int value) {
        
        ugcRecordUsage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.RecordUsage ugc_record_usage = 12;</code>
       * @return The ugcRecordUsage.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage getUgcRecordUsage() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage result = emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage.valueOf(ugcRecordUsage_);
        return result == null ? emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage.UNRECOGNIZED : result;
      }
      /**
       * <code>.RecordUsage ugc_record_usage = 12;</code>
       * @param value The ugcRecordUsage to set.
       * @return This builder for chaining.
       */
      public Builder setUgcRecordUsage(emu.grasscutter.net.proto.RecordUsageOuterClass.RecordUsage value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        ugcRecordUsage_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RecordUsage ugc_record_usage = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcRecordUsage() {
        
        ugcRecordUsage_ = 0;
        onChanged();
        return this;
      }

      private int getUgcType_ = 0;
      /**
       * <code>.GetUgcType get_ugc_type = 3;</code>
       * @return The enum numeric value on the wire for getUgcType.
       */
      @java.lang.Override public int getGetUgcTypeValue() {
        return getUgcType_;
      }
      /**
       * <code>.GetUgcType get_ugc_type = 3;</code>
       * @param value The enum numeric value on the wire for getUgcType to set.
       * @return This builder for chaining.
       */
      public Builder setGetUgcTypeValue(int value) {
        
        getUgcType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GetUgcType get_ugc_type = 3;</code>
       * @return The getUgcType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType getGetUgcType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType result = emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType.valueOf(getUgcType_);
        return result == null ? emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GetUgcType get_ugc_type = 3;</code>
       * @param value The getUgcType to set.
       * @return This builder for chaining.
       */
      public Builder setGetUgcType(emu.grasscutter.net.proto.GetUgcTypeOuterClass.GetUgcType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        getUgcType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GetUgcType get_ugc_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGetUgcType() {
        
        getUgcType_ = 0;
        onChanged();
        return this;
      }

      private boolean isRequireBrief_ ;
      /**
       * <code>bool is_require_brief = 10;</code>
       * @return The isRequireBrief.
       */
      @java.lang.Override
      public boolean getIsRequireBrief() {
        return isRequireBrief_;
      }
      /**
       * <code>bool is_require_brief = 10;</code>
       * @param value The isRequireBrief to set.
       * @return This builder for chaining.
       */
      public Builder setIsRequireBrief(boolean value) {
        
        isRequireBrief_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_require_brief = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRequireBrief() {
        
        isRequireBrief_ = false;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 14;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 14;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetUgcReq)
    }

    // @@protoc_insertion_point(class_scope:GetUgcReq)
    private static final emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq();
    }

    public static emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetUgcReq>
        PARSER = new com.google.protobuf.AbstractParser<GetUgcReq>() {
      @java.lang.Override
      public GetUgcReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetUgcReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetUgcReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetUgcReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetUgcReqOuterClass.GetUgcReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUgcReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUgcReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017GetUgcReq.proto\032\rUgcType.proto\032\021Record" +
      "Usage.proto\032\020GetUgcType.proto\"\263\001\n\tGetUgc" +
      "Req\022\032\n\010ugc_type\030\006 \001(\0162\010.UgcType\022\020\n\010ugc_g" +
      "uid\030\013 \001(\004\022&\n\020ugc_record_usage\030\014 \001(\0162\014.Re" +
      "cordUsage\022!\n\014get_ugc_type\030\003 \001(\0162\013.GetUgc" +
      "Type\022\030\n\020is_require_brief\030\n \001(\010\022\023\n\013schedu" +
      "le_id\030\016 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.UgcTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.RecordUsageOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.GetUgcTypeOuterClass.getDescriptor(),
        });
    internal_static_GetUgcReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetUgcReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUgcReq_descriptor,
        new java.lang.String[] { "UgcType", "UgcGuid", "UgcRecordUsage", "GetUgcType", "IsRequireBrief", "ScheduleId", });
    emu.grasscutter.net.proto.UgcTypeOuterClass.getDescriptor();
    emu.grasscutter.net.proto.RecordUsageOuterClass.getDescriptor();
    emu.grasscutter.net.proto.GetUgcTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
