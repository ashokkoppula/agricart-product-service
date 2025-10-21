package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CityJpaRepository extends JpaRepository<City, UUID> {
        List<City> findByDistrictId(UUID districtId);
}
