package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ShopJpaRepository extends JpaRepository<Shop, UUID> {
    List<Shop> findByCityIdAndShopType(UUID cityId, String shopType);
}
