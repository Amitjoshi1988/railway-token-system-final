package com.railway.tokenservice.grpc;

import com.railway.grpc.TokenServiceGrpc;
import com.railway.grpc.TokenRequest;
import com.railway.grpc.TokenResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TokenServiceImpl extends TokenServiceGrpc.TokenServiceImplBase {

    @Override
    public void generateToken(TokenRequest request, StreamObserver<TokenResponse> responseObserver) {
        int counterId = request.getCounterId(); // int, not String

        // Generate token string (for example)
        String token = "TKN-" + counterId + "-" + System.currentTimeMillis();

        TokenResponse response = TokenResponse.newBuilder()
                .setTokenId(token) // make sure proto has "token_id" as string
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
