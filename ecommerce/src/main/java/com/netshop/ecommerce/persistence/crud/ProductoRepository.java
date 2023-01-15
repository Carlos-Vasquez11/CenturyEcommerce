package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.ProductDTO;
import com.netshop.ecommerce.domain.repository.ProductRepository;
import com.netshop.ecommerce.persistence.entity.Producto;
import com.netshop.ecommerce.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public ProductDTO save(ProductDTO product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public Optional<ProductDTO> getById(Integer id) {
        Optional<Producto> producto = productoCrudRepository.findById(id);
        return producto.map(unProducto -> mapper.toProduct(unProducto));
    }

    @Override
    public Optional<List<ProductDTO>> getAll() {
        return Optional.of(mapper.toProducts((List<Producto>) productoCrudRepository.findAll()));
    }
}
