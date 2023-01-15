package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.PaymentMethodDTO;
import com.netshop.ecommerce.domain.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paymentmethod")
public class PaymnetMethodController {

    @Autowired
    private PaymentMethodService paymentMethodService;

    @PostMapping("/save")
    public ResponseEntity<PaymentMethodDTO> save(@RequestBody PaymentMethodDTO paymentMethod){
        return new ResponseEntity<>(paymentMethodService.save(paymentMethod), HttpStatus.CREATED);
    }

    @RequestMapping("{id}")
    public ResponseEntity<List<PaymentMethodDTO>> getBySellerId(@PathVariable("id") Integer id){
        return ResponseEntity.of(paymentMethodService.getBySellerId(id));
    }
}
