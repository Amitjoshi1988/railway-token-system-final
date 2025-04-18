package com.railway.validationservice.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ValidationServiceImpl extends SomeCustomGrpcValidatorGrpc.SomeCustomGrpcValidatorImplBase {

    @Override
    public void validate(SomeInput input, StreamObserver<ValidationResult> responseObserver) {
        boolean valid = input.getCounterId() > 0;
        ValidationResult result = ValidationResult.newBuilder().setValid(valid).build();
        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }
}
