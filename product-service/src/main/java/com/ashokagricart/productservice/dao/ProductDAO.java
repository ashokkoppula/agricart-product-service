package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductDAO {
    List<Product> findByShopId(UUID id);
    Optional<Product> findById(UUID id);
}
