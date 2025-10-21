package com.ashokagricart.productservice.serviceImpl;

import com.ashokagricart.productservice.dao.CityDAO;
import com.ashokagricart.productservice.dao.ProductDAO;
import com.ashokagricart.productservice.dao.ShopDAO;
import com.ashokagricart.productservice.dto.ProductResponse;
import com.ashokagricart.productservice.dto.ShopResponse;
import com.ashokagricart.productservice.exception.ResourceNotFoundException;
import com.ashokagricart.productservice.model.Product;
import com.ashokagricart.productservice.service.ShopService;
import com.ashokagricart.productservice.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShopDAO shopDao;
    private final ProductDAO productDao;
    private final CityDAO cityDao;
    private final MapperUtil mapper;

    @Autowired
    public ShopServiceImpl(ShopDAO shopDao, ProductDAO productDao, CityDAO cityDao, MapperUtil mapper){
        this.shopDao = shopDao;
        this.productDao = productDao;
        this.cityDao = cityDao;
        this.mapper = mapper;
    }

    @Override
    public List<ShopResponse> getShopsByCityAndType(UUID cityId, String shopType){

        cityDao.findById(cityId).orElseThrow(
                () -> new ResourceNotFoundException("City not found with ID "+cityId));

        return shopDao.findByCityIdAndShopType(cityId, shopType.toUpperCase()).stream()
                .map(mapper::mapToShopResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductResponse> getProductsByShop(UUID shopId){
        shopDao.findById(shopId).orElseThrow(
                () -> new ResourceNotFoundException("Shop not found with Id "+shopId));

        return productDao.findByShopId(shopId).stream()
                .map(mapper::mapToProductResponse)
                .collect(Collectors.toList());
    }

}
