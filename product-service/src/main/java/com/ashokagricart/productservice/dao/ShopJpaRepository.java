package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopJpaRepository extends JpaRepository<Shop, Long> {
    List<Shop> findCityIdAndShopType(Long cityId, String shopType);
}
