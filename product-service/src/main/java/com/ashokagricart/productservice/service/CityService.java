package com.ashokagricart.productservice.service;

import com.ashokagricart.productservice.dto.CityResponse;

import java.util.List;

public interface CityService {
    List<CityResponse> getCitiesByDistrict(Long districtId);
}
