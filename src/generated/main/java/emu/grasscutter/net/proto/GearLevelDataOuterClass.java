// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GearLevelData.proto

package emu.grasscutter.net.proto;

public final class GearLevelDataOuterClass {
  private GearLevelDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GearLevelDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GearLevelData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 open_time = 3;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>bool is_open = 6;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 APNDNCIJLKB = 8;</code>
     * @return The aPNDNCIJLKB.
     */
    int getAPNDNCIJLKB();

    /**
     * <code>uint32 HKLBAPAMEOK = 5;</code>
     * @return The hKLBAPAMEOK.
     */
    int getHKLBAPAMEOK();

    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_finished = 9;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();
  }
  /**
   * <pre>
   * Obf: HEGKNDKHNDF
   * </pre>
   *
   * Protobuf type {@code GearLevelData}
   */
  public static final class GearLevelData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GearLevelData)
      GearLevelDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GearLevelData.newBuilder() to construct.
    private GearLevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GearLevelData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GearLevelData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GearLevelData(
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

              openTime_ = input.readUInt32();
              break;
            }
            case 40: {

              hKLBAPAMEOK_ = input.readUInt32();
              break;
            }
            case 48: {

              isOpen_ = input.readBool();
              break;
            }
            case 64: {

              aPNDNCIJLKB_ = input.readUInt32();
              break;
            }
            case 72: {

              isFinished_ = input.readBool();
              break;
            }
            case 96: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.class, emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.Builder.class);
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 3;
    private int openTime_;
    /**
     * <code>uint32 open_time = 3;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 6;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 6;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int APNDNCIJLKB_FIELD_NUMBER = 8;
    private int aPNDNCIJLKB_;
    /**
     * <code>uint32 APNDNCIJLKB = 8;</code>
     * @return The aPNDNCIJLKB.
     */
    @java.lang.Override
    public int getAPNDNCIJLKB() {
      return aPNDNCIJLKB_;
    }

    public static final int HKLBAPAMEOK_FIELD_NUMBER = 5;
    private int hKLBAPAMEOK_;
    /**
     * <code>uint32 HKLBAPAMEOK = 5;</code>
     * @return The hKLBAPAMEOK.
     */
    @java.lang.Override
    public int getHKLBAPAMEOK() {
      return hKLBAPAMEOK_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 12;
    private int levelId_;
    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 9;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 9;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
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
      if (openTime_ != 0) {
        output.writeUInt32(3, openTime_);
      }
      if (hKLBAPAMEOK_ != 0) {
        output.writeUInt32(5, hKLBAPAMEOK_);
      }
      if (isOpen_ != false) {
        output.writeBool(6, isOpen_);
      }
      if (aPNDNCIJLKB_ != 0) {
        output.writeUInt32(8, aPNDNCIJLKB_);
      }
      if (isFinished_ != false) {
        output.writeBool(9, isFinished_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(12, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, openTime_);
      }
      if (hKLBAPAMEOK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, hKLBAPAMEOK_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isOpen_);
      }
      if (aPNDNCIJLKB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, aPNDNCIJLKB_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isFinished_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData other = (emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData) obj;

      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getAPNDNCIJLKB()
          != other.getAPNDNCIJLKB()) return false;
      if (getHKLBAPAMEOK()
          != other.getHKLBAPAMEOK()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
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
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + APNDNCIJLKB_FIELD_NUMBER;
      hash = (53 * hash) + getAPNDNCIJLKB();
      hash = (37 * hash) + HKLBAPAMEOK_FIELD_NUMBER;
      hash = (53 * hash) + getHKLBAPAMEOK();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData prototype) {
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
     * Obf: HEGKNDKHNDF
     * </pre>
     *
     * Protobuf type {@code GearLevelData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GearLevelData)
        emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.class, emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.newBuilder()
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
        openTime_ = 0;

        isOpen_ = false;

        aPNDNCIJLKB_ = 0;

        hKLBAPAMEOK_ = 0;

        levelId_ = 0;

        isFinished_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData build() {
        emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData buildPartial() {
        emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData result = new emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData(this);
        result.openTime_ = openTime_;
        result.isOpen_ = isOpen_;
        result.aPNDNCIJLKB_ = aPNDNCIJLKB_;
        result.hKLBAPAMEOK_ = hKLBAPAMEOK_;
        result.levelId_ = levelId_;
        result.isFinished_ = isFinished_;
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
        if (other instanceof emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData) {
          return mergeFrom((emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData other) {
        if (other == emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData.getDefaultInstance()) return this;
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getAPNDNCIJLKB() != 0) {
          setAPNDNCIJLKB(other.getAPNDNCIJLKB());
        }
        if (other.getHKLBAPAMEOK() != 0) {
          setHKLBAPAMEOK(other.getHKLBAPAMEOK());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
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
        emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 3;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 3;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 6;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 6;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int aPNDNCIJLKB_ ;
      /**
       * <code>uint32 APNDNCIJLKB = 8;</code>
       * @return The aPNDNCIJLKB.
       */
      @java.lang.Override
      public int getAPNDNCIJLKB() {
        return aPNDNCIJLKB_;
      }
      /**
       * <code>uint32 APNDNCIJLKB = 8;</code>
       * @param value The aPNDNCIJLKB to set.
       * @return This builder for chaining.
       */
      public Builder setAPNDNCIJLKB(int value) {
        
        aPNDNCIJLKB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 APNDNCIJLKB = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAPNDNCIJLKB() {
        
        aPNDNCIJLKB_ = 0;
        onChanged();
        return this;
      }

      private int hKLBAPAMEOK_ ;
      /**
       * <code>uint32 HKLBAPAMEOK = 5;</code>
       * @return The hKLBAPAMEOK.
       */
      @java.lang.Override
      public int getHKLBAPAMEOK() {
        return hKLBAPAMEOK_;
      }
      /**
       * <code>uint32 HKLBAPAMEOK = 5;</code>
       * @param value The hKLBAPAMEOK to set.
       * @return This builder for chaining.
       */
      public Builder setHKLBAPAMEOK(int value) {
        
        hKLBAPAMEOK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HKLBAPAMEOK = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearHKLBAPAMEOK() {
        
        hKLBAPAMEOK_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 12;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 12;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 9;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 9;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
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


      // @@protoc_insertion_point(builder_scope:GearLevelData)
    }

    // @@protoc_insertion_point(class_scope:GearLevelData)
    private static final emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData();
    }

    public static emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GearLevelData>
        PARSER = new com.google.protobuf.AbstractParser<GearLevelData>() {
      @java.lang.Override
      public GearLevelData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GearLevelData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GearLevelData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GearLevelData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GearLevelDataOuterClass.GearLevelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GearLevelData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GearLevelData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GearLevelData.proto\"\204\001\n\rGearLevelData\022" +
      "\021\n\topen_time\030\003 \001(\r\022\017\n\007is_open\030\006 \001(\010\022\023\n\013A" +
      "PNDNCIJLKB\030\010 \001(\r\022\023\n\013HKLBAPAMEOK\030\005 \001(\r\022\020\n" +
      "\010level_id\030\014 \001(\r\022\023\n\013is_finished\030\t \001(\010B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GearLevelData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GearLevelData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GearLevelData_descriptor,
        new java.lang.String[] { "OpenTime", "IsOpen", "APNDNCIJLKB", "HKLBAPAMEOK", "LevelId", "IsFinished", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
