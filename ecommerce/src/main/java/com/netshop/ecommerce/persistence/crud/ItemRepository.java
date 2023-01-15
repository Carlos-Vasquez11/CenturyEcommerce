package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.ItemDTO;
import com.netshop.ecommerce.persistence.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepository implements com.netshop.ecommerce.domain.repository.ItemRepository {

    @Autowired
    private ItemCrudRepository itemCrudRepository;

    @Autowired
    private ItemMapper mapper;

    @Override
    public List<ItemDTO> getByPurchaseId(Integer id) {
        return mapper.ItemsDTO(itemCrudRepository.findByCompraId(id));
    }

    @Override
    public ItemDTO save(ItemDTO ItemDTO) {
        return mapper.toItemDTO(itemCrudRepository.save(mapper.toItem(ItemDTO)));
    }
}
