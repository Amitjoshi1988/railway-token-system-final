package com.railway.validationservice.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: validation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SomeCustomGrpcValidatorGrpc {

  private SomeCustomGrpcValidatorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SomeCustomGrpcValidator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.railway.validationservice.grpc.SomeInput,
      com.railway.validationservice.grpc.ValidationResult> getValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validate",
      requestType = com.railway.validationservice.grpc.SomeInput.class,
      responseType = com.railway.validationservice.grpc.ValidationResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.railway.validationservice.grpc.SomeInput,
      com.railway.validationservice.grpc.ValidationResult> getValidateMethod() {
    io.grpc.MethodDescriptor<com.railway.validationservice.grpc.SomeInput, com.railway.validationservice.grpc.ValidationResult> getValidateMethod;
    if ((getValidateMethod = SomeCustomGrpcValidatorGrpc.getValidateMethod) == null) {
      synchronized (SomeCustomGrpcValidatorGrpc.class) {
        if ((getValidateMethod = SomeCustomGrpcValidatorGrpc.getValidateMethod) == null) {
          SomeCustomGrpcValidatorGrpc.getValidateMethod = getValidateMethod =
              io.grpc.MethodDescriptor.<com.railway.validationservice.grpc.SomeInput, com.railway.validationservice.grpc.ValidationResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "validate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.railway.validationservice.grpc.SomeInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.railway.validationservice.grpc.ValidationResult.getDefaultInstance()))
              .setSchemaDescriptor(new SomeCustomGrpcValidatorMethodDescriptorSupplier("validate"))
              .build();
        }
      }
    }
    return getValidateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SomeCustomGrpcValidatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SomeCustomGrpcValidatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SomeCustomGrpcValidatorStub>() {
        @java.lang.Override
        public SomeCustomGrpcValidatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SomeCustomGrpcValidatorStub(channel, callOptions);
        }
      };
    return SomeCustomGrpcValidatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SomeCustomGrpcValidatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SomeCustomGrpcValidatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SomeCustomGrpcValidatorBlockingStub>() {
        @java.lang.Override
        public SomeCustomGrpcValidatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SomeCustomGrpcValidatorBlockingStub(channel, callOptions);
        }
      };
    return SomeCustomGrpcValidatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SomeCustomGrpcValidatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SomeCustomGrpcValidatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SomeCustomGrpcValidatorFutureStub>() {
        @java.lang.Override
        public SomeCustomGrpcValidatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SomeCustomGrpcValidatorFutureStub(channel, callOptions);
        }
      };
    return SomeCustomGrpcValidatorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void validate(com.railway.validationservice.grpc.SomeInput request,
        io.grpc.stub.StreamObserver<com.railway.validationservice.grpc.ValidationResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SomeCustomGrpcValidator.
   */
  public static abstract class SomeCustomGrpcValidatorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SomeCustomGrpcValidatorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SomeCustomGrpcValidator.
   */
  public static final class SomeCustomGrpcValidatorStub
      extends io.grpc.stub.AbstractAsyncStub<SomeCustomGrpcValidatorStub> {
    private SomeCustomGrpcValidatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SomeCustomGrpcValidatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SomeCustomGrpcValidatorStub(channel, callOptions);
    }

    /**
     */
    public void validate(com.railway.validationservice.grpc.SomeInput request,
        io.grpc.stub.StreamObserver<com.railway.validationservice.grpc.ValidationResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SomeCustomGrpcValidator.
   */
  public static final class SomeCustomGrpcValidatorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SomeCustomGrpcValidatorBlockingStub> {
    private SomeCustomGrpcValidatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SomeCustomGrpcValidatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SomeCustomGrpcValidatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.railway.validationservice.grpc.ValidationResult validate(com.railway.validationservice.grpc.SomeInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SomeCustomGrpcValidator.
   */
  public static final class SomeCustomGrpcValidatorFutureStub
      extends io.grpc.stub.AbstractFutureStub<SomeCustomGrpcValidatorFutureStub> {
    private SomeCustomGrpcValidatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SomeCustomGrpcValidatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SomeCustomGrpcValidatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.railway.validationservice.grpc.ValidationResult> validate(
        com.railway.validationservice.grpc.SomeInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE = 0;

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
        case METHODID_VALIDATE:
          serviceImpl.validate((com.railway.validationservice.grpc.SomeInput) request,
              (io.grpc.stub.StreamObserver<com.railway.validationservice.grpc.ValidationResult>) responseObserver);
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
          getValidateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.railway.validationservice.grpc.SomeInput,
              com.railway.validationservice.grpc.ValidationResult>(
                service, METHODID_VALIDATE)))
        .build();
  }

  private static abstract class SomeCustomGrpcValidatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SomeCustomGrpcValidatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.railway.validationservice.grpc.ValidationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SomeCustomGrpcValidator");
    }
  }

  private static final class SomeCustomGrpcValidatorFileDescriptorSupplier
      extends SomeCustomGrpcValidatorBaseDescriptorSupplier {
    SomeCustomGrpcValidatorFileDescriptorSupplier() {}
  }

  private static final class SomeCustomGrpcValidatorMethodDescriptorSupplier
      extends SomeCustomGrpcValidatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SomeCustomGrpcValidatorMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SomeCustomGrpcValidatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SomeCustomGrpcValidatorFileDescriptorSupplier())
              .addMethod(getValidateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
