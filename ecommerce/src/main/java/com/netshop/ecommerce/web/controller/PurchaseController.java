package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.PurchaseDTO;
import com.netshop.ecommerce.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;


    @GetMapping("/user/{id}")
    public ResponseEntity<List<PurchaseDTO>> getByUser(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(purchaseService.getByUser(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<PurchaseDTO> save(@RequestBody PurchaseDTO purchase){
        return new ResponseEntity<>(purchaseService.save(purchase),HttpStatus.CREATED);
    }

}