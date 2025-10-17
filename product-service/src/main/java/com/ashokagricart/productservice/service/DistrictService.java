package com.ashokagricart.productservice.service;

import com.ashokagricart.productservice.dto.DistrictResponse;

import java.util.List;

public interface DistrictService {
    List<DistrictResponse> getDistrictByState(Long stateId);
}
