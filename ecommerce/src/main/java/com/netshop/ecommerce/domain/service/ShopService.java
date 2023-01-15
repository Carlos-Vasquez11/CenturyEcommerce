package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.ShopDTO;
import com.netshop.ecommerce.domain.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public Optional<ShopDTO> getById(Integer id){
        return shopRepository.getById(id);
    }

    public ShopDTO save(ShopDTO shop){
        return shopRepository.save(shop);
    }
}
