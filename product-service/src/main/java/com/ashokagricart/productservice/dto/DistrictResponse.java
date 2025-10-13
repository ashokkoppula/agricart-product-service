package com.ashokagricart.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class DistrictResponse {
    private Long id;
    private String name;
            
}
