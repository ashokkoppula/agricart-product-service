package com.ashokagricart.productservice.service;

import com.ashokagricart.productservice.dto.ProductResponse;
import com.ashokagricart.productservice.dto.ShopResponse;

import java.util.List;
import java.util.UUID;

public interface ShopService {

    List<ShopResponse> getShopsByCityAndType(UUID cityId, String ShopType);
    List<ProductResponse> getProductsByShop(UUID shopId);

}
