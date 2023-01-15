package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.SellerDTO;
import com.netshop.ecommerce.domain.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/all")
    ResponseEntity<List<SellerDTO>> getAll(){
        return new ResponseEntity<>(sellerService.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    ResponseEntity<SellerDTO> getById(@PathVariable("id") Integer id){
        return ResponseEntity.of(sellerService.getById(id));
    }

    @PostMapping("/save")
    ResponseEntity<SellerDTO> save(@RequestBody SellerDTO seller){
        return new ResponseEntity<>(sellerService.save(seller), HttpStatus.CREATED);
    }
}