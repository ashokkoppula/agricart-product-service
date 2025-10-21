package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductJpaRepository extends JpaRepository<Product, UUID> {
    List<Product> findByShopId(UUID shopId);
}
