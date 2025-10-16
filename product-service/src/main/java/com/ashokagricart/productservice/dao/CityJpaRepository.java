package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityJpaRepository extends JpaRepository<City, Long> {
        List<City> findByDistrictId(Long districtId);
}
