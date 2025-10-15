package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.District;

import java.util.List;
import java.util.Optional;

public interface DistrictDAO {
    List<District>  findByStateId(Long StateId);
    Optional<District> findById(Long id);
}
