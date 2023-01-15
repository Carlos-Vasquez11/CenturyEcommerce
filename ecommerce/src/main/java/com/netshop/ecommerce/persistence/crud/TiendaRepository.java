package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.ShopDTO;
import com.netshop.ecommerce.domain.repository.ShopRepository;
import com.netshop.ecommerce.persistence.entity.Tienda;
import com.netshop.ecommerce.persistence.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TiendaRepository implements ShopRepository {

    @Autowired
    private TiendaCrudRepository tiendaCrudRepository;

    @Autowired
    private ShopMapper mapper;

    @Override
    public Optional<ShopDTO> getById(Integer id) {
        Optional<Tienda> tienda = tiendaCrudRepository.findById(id);
        return tienda.map(unaTienda -> mapper.toShop(unaTienda));
    }

    @Override
    public ShopDTO save(ShopDTO shop) {
        return mapper.toShop(tiendaCrudRepository.save(mapper.toTienda(shop)));
    }
}
