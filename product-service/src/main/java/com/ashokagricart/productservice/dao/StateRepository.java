package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface StateJpaRepository extends JpaRepository<State, Long> {
    List<State> findAllByOrderByName();

}
