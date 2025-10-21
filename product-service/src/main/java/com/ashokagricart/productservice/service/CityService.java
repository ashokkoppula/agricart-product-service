package com.ashokagricart.productservice.service;

import com.ashokagricart.productservice.dto.CityResponse;

import java.util.List;
import java.util.UUID;

public interface CityService {
    List<CityResponse> getCitiesByDistrict(UUID districtId);
}
