package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.PaymentMethodDTO;
import com.netshop.ecommerce.domain.repository.PaymnetMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodService {

    @Autowired
    private PaymnetMethodRepository paymnetMethodRepository;

    public PaymentMethodDTO save(PaymentMethodDTO paymentMethod){
        return paymnetMethodRepository.save(paymentMethod);
    }

    public Optional<List<PaymentMethodDTO>> getBySellerId(Integer id){
        return paymnetMethodRepository.getBySellerId(id);
    }
}
