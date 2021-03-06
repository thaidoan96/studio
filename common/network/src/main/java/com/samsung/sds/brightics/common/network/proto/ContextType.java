/*
    Copyright 2019 Samsung SDS
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.samsung.sds.brightics.common.network.proto;

/**
 * Protobuf enum {@code com.samsung.sds.brightics.common.network.proto.ContextType}
 */
public enum ContextType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SCALA = 0;</code>
   */
  SCALA(0),
  /**
   * <code>PYTHON = 1;</code>
   */
  PYTHON(1),
  /**
   * <code>FILESYSTEM = 2;</code>
   */
  FILESYSTEM(2),
  /**
   * <code>REDIS = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  REDIS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>KV_STORE = 3;</code>
   */
  public static final ContextType KV_STORE = REDIS;
  /**
   * <code>SCALA = 0;</code>
   */
  public static final int SCALA_VALUE = 0;
  /**
   * <code>PYTHON = 1;</code>
   */
  public static final int PYTHON_VALUE = 1;
  /**
   * <code>FILESYSTEM = 2;</code>
   */
  public static final int FILESYSTEM_VALUE = 2;
  /**
   * <code>REDIS = 3 [deprecated = true];</code>
   */
  public static final int REDIS_VALUE = 3;
  /**
   * <code>KV_STORE = 3;</code>
   */
  public static final int KV_STORE_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ContextType valueOf(int value) {
    return forNumber(value);
  }

  public static ContextType forNumber(int value) {
    switch (value) {
      case 0: return SCALA;
      case 1: return PYTHON;
      case 2: return FILESYSTEM;
      case 3: return REDIS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ContextType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ContextType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ContextType>() {
          public ContextType findValueByNumber(int number) {
            return ContextType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.samsung.sds.brightics.common.network.proto.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ContextType[] VALUES = {
    SCALA, PYTHON, FILESYSTEM, REDIS, KV_STORE, 
  };

  public static ContextType valueOf(
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

  private ContextType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.samsung.sds.brightics.common.network.proto.ContextType)
}

