package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.BaseProductDTO;
import com.netshop.ecommerce.domain.service.BaseProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/baseproduct")
public class BaseProductController {

    @Autowired
    private BaseProductService baseProductService;

    @PostMapping("/save")
    public ResponseEntity<BaseProductDTO> save(@RequestBody BaseProductDTO baseProduct){
        return new ResponseEntity<>(baseProductService.save(baseProduct), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<BaseProductDTO>> getAll(){
        return new ResponseEntity<>(baseProductService.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<BaseProductDTO> getById(@PathVariable("id") Integer id){
        return ResponseEntity.of(baseProductService.getById(id));
    }
}