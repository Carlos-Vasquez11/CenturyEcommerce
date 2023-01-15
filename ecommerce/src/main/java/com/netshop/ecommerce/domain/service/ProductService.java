package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.ProductDTO;
import com.netshop.ecommerce.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductDTO save(ProductDTO product){
        return productRepository.save(product);
    }

    public Optional<ProductDTO> getById(Integer id){
        return productRepository.getById(id);
    }

    public Optional<List<ProductDTO>> getAll() { return productRepository.getAll(); }
}
