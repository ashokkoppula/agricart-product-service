package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.State;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StateDAO {
    List<State> findAll();
    Optional<State> findById(UUID id);
}
