package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.City;
import com.ashokagricart.productservice.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityJpaRepository extends JpaRepository<City, Long> {
        List<District> findByDistrictId(Long districtId);
}
