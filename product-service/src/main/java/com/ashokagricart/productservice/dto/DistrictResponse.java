package com.ashokagricart.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.util.UUID;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class DistrictResponse {
    private UUID id;
    private String name;
            
}
