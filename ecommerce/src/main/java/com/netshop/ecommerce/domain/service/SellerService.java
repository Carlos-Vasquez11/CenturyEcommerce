package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.SellerDTO;
import com.netshop.ecommerce.domain.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> getAll(){
        return sellerRepository.getAll();
    }

    public Optional<SellerDTO> getById(Integer id){
        return sellerRepository.getById(id);
    }

    public SellerDTO save(SellerDTO seller){
        return sellerRepository.save(seller);
    }
}