package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface StateJpaRepository extends JpaRepository<State, UUID> {
    List<State> findAllByOrderByNameAsc();

}
