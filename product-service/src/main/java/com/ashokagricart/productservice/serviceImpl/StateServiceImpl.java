package com.ashokagricart.productservice.serviceImpl;

import com.ashokagricart.productservice.dao.StateDAO;
import com.ashokagricart.productservice.dto.StateResponse;
import com.ashokagricart.productservice.service.StateService;
import com.ashokagricart.productservice.util.MapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StateServiceImpl implements StateService {
    private final StateDAO stateDao;
    private final MapperUtil mapper;
    @Autowired
    public StateServiceImpl(StateDAO stateDao, MapperUtil mapper){
        this.stateDao = stateDao;
        this.mapper = mapper;
    }

    @Override
    public List<StateResponse> getAllStates(){
        return stateDao.findAll().stream()
                .map(mapper::mapToStateResponse)
                .collect(Collectors.toList());
    }




}
