package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.PurchaseDTO;
import com.netshop.ecommerce.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<PurchaseDTO> getByUser(Integer id){
        return purchaseRepository.getByUser(id);
    }

    public PurchaseDTO save(PurchaseDTO purchaseDTO){
        return purchaseRepository.save(purchaseDTO);
    }
}
