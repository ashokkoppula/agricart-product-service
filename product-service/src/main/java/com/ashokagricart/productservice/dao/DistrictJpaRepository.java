package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DistrictJpaRepository extends JpaRepository<District, UUID> {
    List<District> findByStateId(UUID stateId);
}
