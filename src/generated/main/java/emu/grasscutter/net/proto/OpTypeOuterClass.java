// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpType.proto

package emu.grasscutter.net.proto;

public final class OpTypeOuterClass {
  private OpTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code OpType}
   */
  public enum OpType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OP_TYPE_NONE = 0;</code>
     */
    OP_TYPE_NONE(0),
    /**
     * <code>OP_TYPE_ACTIVATE = 1;</code>
     */
    OP_TYPE_ACTIVATE(1),
    /**
     * <code>OP_TYPE_DEACTIVATE = 2;</code>
     */
    OP_TYPE_DEACTIVATE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OP_TYPE_NONE = 0;</code>
     */
    public static final int OP_TYPE_NONE_VALUE = 0;
    /**
     * <code>OP_TYPE_ACTIVATE = 1;</code>
     */
    public static final int OP_TYPE_ACTIVATE_VALUE = 1;
    /**
     * <code>OP_TYPE_DEACTIVATE = 2;</code>
     */
    public static final int OP_TYPE_DEACTIVATE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OpType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OpType forNumber(int value) {
      switch (value) {
        case 0: return OP_TYPE_NONE;
        case 1: return OP_TYPE_ACTIVATE;
        case 2: return OP_TYPE_DEACTIVATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OpType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OpType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OpType>() {
            public OpType findValueByNumber(int number) {
              return OpType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OpTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final OpType[] VALUES = values();

    public static OpType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OpType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:OpType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014OpType.proto*H\n\006OpType\022\020\n\014OP_TYPE_NONE" +
      "\020\000\022\024\n\020OP_TYPE_ACTIVATE\020\001\022\026\n\022OP_TYPE_DEAC" +
      "TIVATE\020\002B!\n\031emu.grasscutter.net.protoZ\004/" +
      "genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
