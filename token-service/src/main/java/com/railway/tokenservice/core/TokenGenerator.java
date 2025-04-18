package com.railway.tokenservice.core;

import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class TokenGenerator {

    private final ConcurrentHashMap<Integer, AtomicInteger> map = new ConcurrentHashMap<>();

    public String generate(int counterId) {
        map.putIfAbsent(counterId, new AtomicInteger(0));
        int tokenNum = map.get(counterId).incrementAndGet();
        return "C" + counterId + "-" + String.format("%03d", tokenNum);
    }
}
