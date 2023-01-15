package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.SellerDTO;
import com.netshop.ecommerce.domain.repository.SellerRepository;
import com.netshop.ecommerce.persistence.entity.Vendedor;
import com.netshop.ecommerce.persistence.mapper.SellerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VendedorRepository implements SellerRepository {

    @Autowired
    private VendedorCrudRepository vendedorCrudRepository;

    @Autowired
    private SellerMapper mapper;

    @Override
    public List<SellerDTO> getAll() {
        return mapper.toSellers( (List<Vendedor>) vendedorCrudRepository.findAll());
    }

    @Override
    public Optional<SellerDTO> getById(Integer id) {
        Optional<Vendedor> vendedor = vendedorCrudRepository.findById(id);
        return vendedor.map(unVendedor -> mapper.toSeller(unVendedor));
    }

    @Override
    public SellerDTO save(SellerDTO seller){
        return mapper.toSeller(vendedorCrudRepository.save(mapper.toVendedor(seller)));
    }
}
