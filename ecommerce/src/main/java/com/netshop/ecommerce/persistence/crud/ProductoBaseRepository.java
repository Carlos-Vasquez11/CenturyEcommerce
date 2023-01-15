package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.BaseProductDTO;
import com.netshop.ecommerce.domain.repository.BaseProductRepository;
import com.netshop.ecommerce.persistence.entity.ProductoBase;
import com.netshop.ecommerce.persistence.mapper.BaseProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoBaseRepository implements BaseProductRepository{
    @Autowired
    private ProductoBaseCrudRepository productoBaseCrudRepository;

    @Autowired
    private BaseProductMapper mapper;

    @Override
    public BaseProductDTO save(BaseProductDTO baseProduct) {
        return mapper.toBaseProduct(productoBaseCrudRepository.save(mapper.toProductoBase(baseProduct)));
    }

    @Override
    public List<BaseProductDTO> getAll() {
        List<ProductoBase> productosBase = (List<ProductoBase>) productoBaseCrudRepository.findAll();
        return mapper.toBaseProducts(productosBase);
    }

    @Override
    public Optional<BaseProductDTO> getById(Integer id) {
        Optional<ProductoBase> productoBase = productoBaseCrudRepository.findById(id);
        return productoBase.map(productoBase1 -> mapper.toBaseProduct(productoBase1));
    }
}
