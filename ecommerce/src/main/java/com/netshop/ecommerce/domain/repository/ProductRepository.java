package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.ProductDTO;
import com.netshop.ecommerce.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository{

    ProductDTO save(ProductDTO product);

    Optional<ProductDTO> getById(Integer id);

    Optional<List<ProductDTO>> getAll();
}
