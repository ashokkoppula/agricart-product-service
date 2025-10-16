package com.ashokagricart.productservice.daoImpl;

import com.ashokagricart.productservice.dao.StateDAO;
import com.ashokagricart.productservice.dao.StateJpaRepository;
import com.ashokagricart.productservice.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StateDAOImpl implements StateDAO {

    private final StateJpaRepository stateJpaRepository;


    @Autowired
    public StateDAOImpl(StateJpaRepository stateJpaRepository) {
        this.stateJpaRepository = stateJpaRepository;
    }

    @Override
    public List<State> findAll() {
        return stateJpaRepository.findAllByOrderByNameAsc();
    }

    @Override
    public Optional<State> findById(Long id) {
        return stateJpaRepository.findById(id);
    }

}
