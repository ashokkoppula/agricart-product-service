package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.State;

import java.util.List;
import java.util.Optional;

public interface StateDAO {
    List<State> findAll();
    Optional<State> findById(Long id);
}
