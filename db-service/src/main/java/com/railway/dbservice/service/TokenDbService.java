package com.railway.dbservice.service;

import com.railway.dbservice.model.TokenEntity;
import com.railway.dbservice.repo.TokenRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TokenDbService {

    private final TokenRepository repo;

    public TokenDbService(TokenRepository repo) {
        this.repo = repo;
    }

    public Mono<TokenEntity> saveToken(int counterId, String token) {
        return repo.save(new TokenEntity(null, counterId, token));
    }
}
