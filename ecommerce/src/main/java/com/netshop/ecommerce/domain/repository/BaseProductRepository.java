package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.BaseProductDTO;

import java.util.List;
import java.util.Optional;

public interface BaseProductRepository {

    //Create
    BaseProductDTO save(BaseProductDTO baseProduct);

    //Read
    List<BaseProductDTO> getAll();

    Optional<BaseProductDTO> getById(Integer id);
}
