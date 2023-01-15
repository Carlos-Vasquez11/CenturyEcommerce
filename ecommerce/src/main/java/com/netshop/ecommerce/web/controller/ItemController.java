package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.ItemDTO;
import com.netshop.ecommerce.domain.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/purchase/{id}")
    public ResponseEntity<List<ItemDTO>> getByPurchaseId(@PathVariable("id") Integer id){
        return new ResponseEntity<>(itemService.getByPurchaseId(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ItemDTO> save(@RequestBody ItemDTO item){
        return new ResponseEntity<>(itemService.save(item), HttpStatus.CREATED);
    }
}