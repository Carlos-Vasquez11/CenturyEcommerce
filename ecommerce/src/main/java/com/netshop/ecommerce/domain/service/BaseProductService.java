package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.BaseProductDTO;
import com.netshop.ecommerce.domain.repository.BaseProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BaseProductService {

    @Autowired
    private BaseProductRepository baseProductRepository;

    public BaseProductDTO save(BaseProductDTO baseProduct){
        return baseProductRepository.save(baseProduct);
    }

    public List<BaseProductDTO> getAll(){
        return baseProductRepository.getAll();
    }

    public Optional<BaseProductDTO> getById(Integer id){
        return baseProductRepository.getById(id);
    }
}
