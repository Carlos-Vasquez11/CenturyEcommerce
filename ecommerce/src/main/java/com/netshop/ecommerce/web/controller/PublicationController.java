package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.PublicationDTO;
import com.netshop.ecommerce.domain.service.PublicationService;
import com.netshop.ecommerce.web.Requests.Quantity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publication")
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    @PostMapping("/save")
    ResponseEntity<PublicationDTO> save(@RequestBody PublicationDTO publicationDTO){
        return new ResponseEntity<>(publicationService.save(publicationDTO), HttpStatus.CREATED);
    }

    @GetMapping("/shop/{id}")
    ResponseEntity<List<PublicationDTO>> getByShopId(@PathVariable("id") Integer id){
        return new ResponseEntity<>(publicationService.getByShopId(id), HttpStatus.OK);
    }

    @GetMapping("{id}")
    ResponseEntity<PublicationDTO> getById(@PathVariable("id") Integer id){
        return ResponseEntity.of(publicationService.getById(id));
    }

    @GetMapping("/shop/all")
    ResponseEntity<List<PublicationDTO>> getAll(Integer id){
        return new ResponseEntity<>(publicationService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/update/quantity/{id}")
    ResponseEntity<PublicationDTO> updateQuantity(@RequestBody Quantity quantity, @PathVariable("id") Integer publicationId){
        return new ResponseEntity<>(publicationService.updateQuantity(quantity.getQuantity(), publicationId), HttpStatus.OK);
    }
}
