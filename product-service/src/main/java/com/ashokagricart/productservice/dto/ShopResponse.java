package com.ashokagricart.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ShopResponse {
    private Long id;
    private String name;
    private String area;
    private String shopType;
}
