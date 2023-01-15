package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.ShopDTO;
import com.netshop.ecommerce.domain.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping("/save")
    public ResponseEntity<ShopDTO> save(@RequestBody ShopDTO shop){
        return new ResponseEntity<>(shopService.save(shop), HttpStatus.CREATED);
    }

    @RequestMapping("{id}")
    public ResponseEntity<ShopDTO> getById(@PathVariable("id") Integer id){
        return ResponseEntity.of(shopService.getById(id));
    }
}