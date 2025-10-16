package com.ashokagricart.productservice.daoImpl;

import com.ashokagricart.productservice.dao.DistrictDAO;
import com.ashokagricart.productservice.dao.DistrictJpaRepository;
import com.ashokagricart.productservice.model.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DistrictDAOImpl implements DistrictDAO {

    private final DistrictJpaRepository districtJpaRepository;

    @Autowired
    public DistrictDAOImpl(DistrictJpaRepository districtJpaRepository){
        this.districtJpaRepository = districtJpaRepository;
    }

    @Override
    public List<District> findByStateId(Long stateId){
        return districtJpaRepository.findByStateId(stateId);
    }

    @Override
    public Optional<District> findById(Long id){
        return districtJpaRepository.findById(id);
    }

}
