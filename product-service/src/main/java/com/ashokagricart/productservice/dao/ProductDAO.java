package com.ashokagricart.productservice.dao;

import com.ashokagricart.productservice.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDAO {
    List<Product> findByShopId(Long id);
    Optional<Product> findById(Long id);
}
