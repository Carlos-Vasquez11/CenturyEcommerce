package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.PersonalizationAreaDTO;
import com.netshop.ecommerce.domain.service.BaseProductService;
import com.netshop.ecommerce.domain.service.PersonalizationAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personalizationareas")
public class PersonalizationAreaController {

    @Autowired
    private PersonalizationAreaService personalizationAreaService;

    @GetMapping("/baseproduct/{id}")
    public ResponseEntity<List<PersonalizationAreaDTO>> getByBaseProductId(@PathVariable("id") Integer id){
        return ResponseEntity.of(personalizationAreaService.getByBaseProductId(id));
    }

    @PostMapping("/save")
    public ResponseEntity<PersonalizationAreaDTO> save(@RequestBody PersonalizationAreaDTO personalizationArea){
        return new ResponseEntity<>(personalizationAreaService.save(personalizationArea), HttpStatus.CREATED);
    }
}
