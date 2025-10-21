package com.ashokagricart.productservice.controller;

import com.ashokagricart.productservice.dto.DistrictResponse;
import com.ashokagricart.productservice.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products/v1/states/{stateId}/districts")
@RequiredArgsConstructor
public class DistrictController {
    private final DistrictService districtService;

    @GetMapping
    public ResponseEntity<List<DistrictResponse>> getDistrictsByState(@PathVariable UUID stateId){
        return ResponseEntity.ok(districtService.getDistrictByState(stateId));
    }

}
