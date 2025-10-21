package com.ashokagricart.productservice.daoImpl;

import com.ashokagricart.productservice.dao.ShopDAO;
import com.ashokagricart.productservice.dao.ShopJpaRepository;
import com.ashokagricart.productservice.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ShopDAOImpl implements ShopDAO {

    private final ShopJpaRepository shopJpaRepository;

    @Autowired
    public ShopDAOImpl(ShopJpaRepository shopJpaRepository){
        this.shopJpaRepository = shopJpaRepository;
    }

    @Override
    public List<Shop> findByCityIdAndShopType(UUID cityId, String shopType){
        return shopJpaRepository.findByCityIdAndShopType(cityId, shopType);
    }

    @Override
    public Optional<Shop> findById(UUID id){
        return shopJpaRepository.findById(id);
    }

}
