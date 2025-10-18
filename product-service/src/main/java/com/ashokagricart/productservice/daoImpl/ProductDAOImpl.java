package com.ashokagricart.productservice.daoImpl;

import com.ashokagricart.productservice.dao.ProductDAO;
import com.ashokagricart.productservice.dao.ProductJpaRepository;
import com.ashokagricart.productservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductDAOImpl implements ProductDAO {

    private final ProductJpaRepository productJpaRepository;

    @Autowired
    public ProductDAOImpl(ProductJpaRepository productJpaRepository){
        this.productJpaRepository = productJpaRepository;
    }

    @Override
    public List<Product> findByShopId(Long shopId){
        return productJpaRepository.findByShopId(shopId);
    }

    @Override
    public Optional<Product> findById(Long id){
        return productJpaRepository.findById(id);
    }

}
