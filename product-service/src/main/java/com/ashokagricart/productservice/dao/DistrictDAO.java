package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.District;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DistrictDAO {
    List<District>  findByStateId(UUID StateId);
    Optional<District> findById(UUID id);
}
