package com.railway.uiservice.service;

import com.railway.grpc.TokenRequest;
import com.railway.grpc.TokenServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class UIGrpcClient {

    @GrpcClient("token-service")
    private TokenServiceGrpc.TokenServiceBlockingStub stub;

    public String getToken(int counterId) {
        return stub.generateToken(TokenRequest.newBuilder()
        		.setCounterId(counterId)
        		.build())
        		.getTokenId();
    }
}
