package com.railway.dbservice.repo;

import com.railway.dbservice.model.TokenEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TokenRepository extends ReactiveCrudRepository<TokenEntity, Long> {}
