package com.ashokagricart.productservice.controller;

import com.ashokagricart.productservice.dto.StateResponse;
import com.ashokagricart.productservice.service.StateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/products/v1")
@RequiredArgsConstructor
public class StateController {

    private final StateService stateService;

    @GetMapping("/states")
    public ResponseEntity<List<StateResponse>> getAllStates(){
        return ResponseEntity.ok(stateService.getAllStates());
    }

}
