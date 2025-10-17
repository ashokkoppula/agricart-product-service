package com.ashokagricart.productservice.service;

import com.ashokagricart.productservice.dto.ProductResponse;
import com.ashokagricart.productservice.dto.ShopResponse;

import java.util.List;

public interface ShopService {

    List<ShopResponse> getShopsByCityAndType(Long cityId, String ShopType);
    List<ProductResponse> getProductsByShop(Long shopId);

}
