package com.ashokagricart.productservice.service;

import com.ashokagricart.productservice.dto.DistrictResponse;

import java.util.List;
import java.util.UUID;

public interface DistrictService {
    List<DistrictResponse> getDistrictByState(UUID stateId);
}
