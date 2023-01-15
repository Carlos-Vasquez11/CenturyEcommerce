package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.ShopDTO;

import java.util.Optional;

public interface ShopRepository {

    Optional<ShopDTO> getById(Integer id);

    ShopDTO save(ShopDTO shop);
}
