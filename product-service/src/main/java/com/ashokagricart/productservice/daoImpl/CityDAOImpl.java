package com.ashokagricart.productservice.daoImpl;

import com.ashokagricart.productservice.dao.CityDAO;
import com.ashokagricart.productservice.dao.CityJpaRepository;
import com.ashokagricart.productservice.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class CityDAOImpl implements CityDAO {

    private final CityJpaRepository cityJpaRepository;

    @Autowired
    public CityDAOImpl(CityJpaRepository cityJpaRepository){

        this.cityJpaRepository = cityJpaRepository;
    }

    @Override
    public List<City> findByDistrictId(UUID districtId){
        return cityJpaRepository.findByDistrictId(districtId);
    }

    @Override
    public Optional<City> findById(UUID id){
        return cityJpaRepository.findById(id);
    }

}
