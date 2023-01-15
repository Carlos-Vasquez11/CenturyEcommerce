package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.SellerDTO;

import java.util.List;
import java.util.Optional;

public interface SellerRepository {

    List<SellerDTO> getAll();

    Optional<SellerDTO> getById(Integer id);

    SellerDTO save(SellerDTO seller);
}
