package com.ashokagricart.productservice.controller;

import com.ashokagricart.productservice.dto.CityResponse;
import com.ashokagricart.productservice.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products/v1/districts/{districtId}/cities")
@RequiredArgsConstructor
public class CityController {

    private CityService cityService;

    @GetMapping
    public ResponseEntity<List<CityResponse>> getCitiesByDistrict(@PathVariable Long districtId){
        return ResponseEntity.ok(cityService.getCitiesByDistrict(districtId));
    }


}
