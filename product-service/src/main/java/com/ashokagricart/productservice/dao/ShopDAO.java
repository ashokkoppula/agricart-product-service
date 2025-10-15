package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.Shop;

import java.util.List;
import java.util.Optional;

public interface ShopDAO {
    List<Shop> findByCityIdAndShopType(Long cityId, String shopType);
    Optional<Shop> findById(Long id);
}
