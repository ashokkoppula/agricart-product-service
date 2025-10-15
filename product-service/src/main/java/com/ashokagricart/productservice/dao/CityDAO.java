package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.City;

import java.util.List;
import java.util.Optional;

public interface CityDAO {
    List<City> findByDistrictId(Long districtId);
    Optional<City> findById(Long id);
}
