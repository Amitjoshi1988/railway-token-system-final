package com.railway.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: token.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TokenServiceGrpc {

  private TokenServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "TokenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.railway.grpc.TokenRequest,
      com.railway.grpc.TokenResponse> getGenerateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateToken",
      requestType = com.railway.grpc.TokenRequest.class,
      responseType = com.railway.grpc.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.railway.grpc.TokenRequest,
      com.railway.grpc.TokenResponse> getGenerateTokenMethod() {
    io.grpc.MethodDescriptor<com.railway.grpc.TokenRequest, com.railway.grpc.TokenResponse> getGenerateTokenMethod;
    if ((getGenerateTokenMethod = TokenServiceGrpc.getGenerateTokenMethod) == null) {
      synchronized (TokenServiceGrpc.class) {
        if ((getGenerateTokenMethod = TokenServiceGrpc.getGenerateTokenMethod) == null) {
          TokenServiceGrpc.getGenerateTokenMethod = getGenerateTokenMethod =
              io.grpc.MethodDescriptor.<com.railway.grpc.TokenRequest, com.railway.grpc.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "generateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.railway.grpc.TokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.railway.grpc.TokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TokenServiceMethodDescriptorSupplier("generateToken"))
              .build();
        }
      }
    }
    return getGenerateTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TokenServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TokenServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TokenServiceStub>() {
        @java.lang.Override
        public TokenServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TokenServiceStub(channel, callOptions);
        }
      };
    return TokenServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TokenServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TokenServiceBlockingStub>() {
        @java.lang.Override
        public TokenServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TokenServiceBlockingStub(channel, callOptions);
        }
      };
    return TokenServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TokenServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TokenServiceFutureStub>() {
        @java.lang.Override
        public TokenServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TokenServiceFutureStub(channel, callOptions);
        }
      };
    return TokenServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void generateToken(com.railway.grpc.TokenRequest request,
        io.grpc.stub.StreamObserver<com.railway.grpc.TokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TokenService.
   */
  public static abstract class TokenServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TokenServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TokenService.
   */
  public static final class TokenServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TokenServiceStub> {
    private TokenServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TokenServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TokenServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateToken(com.railway.grpc.TokenRequest request,
        io.grpc.stub.StreamObserver<com.railway.grpc.TokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TokenService.
   */
  public static final class TokenServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TokenServiceBlockingStub> {
    private TokenServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TokenServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TokenServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.railway.grpc.TokenResponse generateToken(com.railway.grpc.TokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TokenService.
   */
  public static final class TokenServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TokenServiceFutureStub> {
    private TokenServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TokenServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TokenServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.railway.grpc.TokenResponse> generateToken(
        com.railway.grpc.TokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_TOKEN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_TOKEN:
          serviceImpl.generateToken((com.railway.grpc.TokenRequest) request,
              (io.grpc.stub.StreamObserver<com.railway.grpc.TokenResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGenerateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.railway.grpc.TokenRequest,
              com.railway.grpc.TokenResponse>(
                service, METHODID_GENERATE_TOKEN)))
        .build();
  }

  private static abstract class TokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.railway.grpc.TokenServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TokenService");
    }
  }

  private static final class TokenServiceFileDescriptorSupplier
      extends TokenServiceBaseDescriptorSupplier {
    TokenServiceFileDescriptorSupplier() {}
  }

  private static final class TokenServiceMethodDescriptorSupplier
      extends TokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TokenServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TokenServiceFileDescriptorSupplier())
              .addMethod(getGenerateTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
