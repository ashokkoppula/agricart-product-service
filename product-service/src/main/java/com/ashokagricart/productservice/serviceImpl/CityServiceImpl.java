package com.ashokagricart.productservice.serviceImpl;

import com.ashokagricart.productservice.dao.CityDAO;
import com.ashokagricart.productservice.dao.DistrictDAO;
import com.ashokagricart.productservice.dto.CityResponse;
import com.ashokagricart.productservice.exception.ResourceNotFoundException;
import com.ashokagricart.productservice.service.CityService;
import com.ashokagricart.productservice.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityServiceImpl implements CityService {
    private final CityDAO cityDao;
    private final DistrictDAO districtDao;
    private final MapperUtil mapper;

    @Autowired
    public CityServiceImpl(CityDAO cityDao, DistrictDAO districtDao, MapperUtil mapper){
        this.cityDao = cityDao;
        this.districtDao = districtDao;
        this.mapper = mapper;
    }

    @Override
    public List<CityResponse> getCitiesByDistrict(Long districtId){
        districtDao.findById(districtId).orElseThrow(
                () -> new ResourceNotFoundException("District not found with ID: "+ districtId));

        return cityDao.findByDistrictId(districtId).stream()
                .map(mapper::mapToCityResponse)
                .collect(Collectors.toList());
    }

}
