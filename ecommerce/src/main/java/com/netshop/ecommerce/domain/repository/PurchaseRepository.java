package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.PurchaseDTO;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<PurchaseDTO> getByUser(Integer id);

    PurchaseDTO save(PurchaseDTO purchase);
}
