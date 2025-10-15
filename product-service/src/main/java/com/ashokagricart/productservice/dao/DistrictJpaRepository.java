package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictJpaRepository extends JpaRepository<District, Long> {
    List<District> findByStateId(Long stateId);
}
