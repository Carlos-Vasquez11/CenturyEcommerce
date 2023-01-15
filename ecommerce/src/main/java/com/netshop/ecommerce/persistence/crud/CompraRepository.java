package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.PurchaseDTO;
import com.netshop.ecommerce.domain.repository.PurchaseRepository;
import com.netshop.ecommerce.persistence.entity.Compra;
import com.netshop.ecommerce.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<PurchaseDTO> getByUser(Integer id) {
        List<Compra> compras = compraCrudRepository.findByUsuarioId(id);
        return mapper.toPurchases(compras);
    }

    @Override
    public PurchaseDTO save(PurchaseDTO purchase) {
        return mapper.toPurchase(compraCrudRepository.save(mapper.toCompra(purchase)));
    }
}
