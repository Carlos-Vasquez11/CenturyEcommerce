package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.ItemDTO;

import java.util.List;

public interface ItemRepository {

    List<ItemDTO> getByPurchaseId(Integer id);

    ItemDTO save(ItemDTO Item);

}
