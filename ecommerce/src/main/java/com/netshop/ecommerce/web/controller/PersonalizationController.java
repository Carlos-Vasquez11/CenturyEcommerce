package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.PersonalizationDTO;
import com.netshop.ecommerce.domain.service.PersonalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personalization")
public class PersonalizationController {

    @Autowired
    private PersonalizationService personalizationService;

    @PostMapping("/save")
    public ResponseEntity<PersonalizationDTO> save(@RequestBody PersonalizationDTO personalization) {
        return new ResponseEntity<>(personalizationService.save(personalization), HttpStatus.CREATED);
    }

    @GetMapping("{productId}")
    public ResponseEntity<List<PersonalizationDTO>> getByProductId(@PathVariable("productId") Integer id) {
        return ResponseEntity.of(personalizationService.getByProductId(id));
    }
}
