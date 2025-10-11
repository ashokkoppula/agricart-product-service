package com.ashokagricart.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    // 1. Define a simple DTO (Data Transfer Object) or Record for the product data
    record ProductResponse(String id, String name, String description, int quantity) {}

    // 2. Map HTTP GET requests to the root path of the controller (/products)
    @GetMapping
    public List<ProductResponse> getAllProducts() {

        // 3. Create and return a List of ProductResponse objects.
        // Spring Boot automatically converts this List into JSON format.
        return List.of(
                new ProductResponse("p101", "pest", "cures diseases", 10 )
        );
}
}
