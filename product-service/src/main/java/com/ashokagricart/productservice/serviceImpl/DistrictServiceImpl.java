package com.ashokagricart.productservice.serviceImpl;

import com.ashokagricart.productservice.dao.DistrictDAO;
import com.ashokagricart.productservice.dao.StateDAO;
import com.ashokagricart.productservice.dto.DistrictResponse;
import com.ashokagricart.productservice.exception.ResourceNotFoundException;
import com.ashokagricart.productservice.service.DistrictService;
import com.ashokagricart.productservice.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class DistrictServiceImpl implements DistrictService {

    private DistrictDAO districtDao;
    private StateDAO stateDao;
    private MapperUtil mapper;

    @Autowired
    public DistrictServiceImpl(DistrictDAO districtDao, StateDAO stateDao, MapperUtil mapper){
        this.districtDao = districtDao;
        this.stateDao = stateDao;
        this.mapper = mapper;
    }

    @Override
    public List<DistrictResponse> getDistrictByState(UUID stateId){
        stateDao.findById(stateId).orElseThrow(
                () -> new ResourceNotFoundException("State not found with ID: "+stateId));
        return districtDao.findByStateId(stateId).stream()
                .map(mapper::mapToDistrictResponse)
                .collect(Collectors.toList());
    }



}
