// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: token.proto

// Protobuf Java Version: 3.25.1
package com.railway.grpc;

public final class TokenServiceProto {
  private TokenServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TokenResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013token.proto\"\"\n\014TokenRequest\022\022\n\ncounter" +
      "_id\030\001 \001(\005\"!\n\rTokenResponse\022\020\n\010token_id\030\001" +
      " \001(\t2>\n\014TokenService\022.\n\rgenerateToken\022\r." +
      "TokenRequest\032\016.TokenResponseB\'\n\020com.rail" +
      "way.grpcB\021TokenServiceProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TokenRequest_descriptor,
        new java.lang.String[] { "CounterId", });
    internal_static_TokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TokenResponse_descriptor,
        new java.lang.String[] { "TokenId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
