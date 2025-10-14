package com.ashokagricart.productservice.util;

import com.ashokagricart.productservice.dto.*;
import com.ashokagricart.productservice.model.*;
import org.springframework.stereotype.Component;

@Component
public class MapperUtil {
    public StateResponse mapToStateResponse(State state){
        return StateResponse.builder()
                .id(state.getId())
                .name(state.getName())
                .build();
    }

    public DistrictResponse mapToDistrictResponse(District district){
        return DistrictResponse.builder()
                .id(district.getId())
                .name(district.getName())
                .build();
    }

    public CityResponse mapToCityResponse(City city){
        return CityResponse.builder()
                .id(city.getId())
                .name(city.getName())
                .build();
    }
    public ShopResponse mapToShopResponse(Shop shop) {
        return ShopResponse.builder()
                .id(shop.getId())
                .name(shop.getName())
                .area(shop.getArea())
                .shopType(shop.getShopType())
                .build();
    }
    public ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .pesticideType(product.getPesticideType())
                .build();
    }
}
