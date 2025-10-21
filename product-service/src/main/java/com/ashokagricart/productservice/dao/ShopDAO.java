package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.Shop;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ShopDAO {
    List<Shop> findByCityIdAndShopType(UUID cityId, String shopType);
    Optional<Shop> findById(UUID id);
}
