package com.ashokagricart.productservice.controller;

import com.ashokagricart.productservice.dto.ProductResponse;
import com.ashokagricart.productservice.dto.ShopResponse;
import com.ashokagricart.productservice.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("products/v1")
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;
    // GET /api/v1/cities/1/shops?type=pesticide
    @GetMapping("/cities/{cityId}/shops")
    public ResponseEntity<List<ShopResponse>> getShopsByCityAndType(
            @PathVariable UUID cityId,
            @RequestParam(name = "type", required = true) String shopType
    ){
        if(!"pesticide".equalsIgnoreCase(shopType)){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(shopService.getShopsByCityAndType(cityId, shopType));
    }
@GetMapping("/shops/{shopId}/products")
    public ResponseEntity<List<ProductResponse>> getProductsByShop(@PathVariable UUID shopId){
        return ResponseEntity.ok(shopService.getProductsByShop(shopId));
}

}
