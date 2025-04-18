package com.railway.dbservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("tokens")
public record TokenEntity(@Id Long id, int counterId, String token) {}
