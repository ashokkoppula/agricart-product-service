package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.City;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CityDAO {
    List<City> findByDistrictId(UUID districtId);
    Optional<City> findById(UUID id);
}
