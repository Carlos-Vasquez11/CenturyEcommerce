package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.ProductDTO;
import com.netshop.ecommerce.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<ProductDTO> save(@RequestBody ProductDTO product){
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable("id") Integer id){
        return ResponseEntity.of(productService.getById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductDTO>> getAll(){
        return ResponseEntity.of(productService.getAll());
    }
}