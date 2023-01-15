package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.ItemDTO;
import com.netshop.ecommerce.domain.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemDTO> getByPurchaseId(Integer id){
        return itemRepository.getByPurchaseId(id);
    }

    public ItemDTO save(ItemDTO item){
        return itemRepository.save(item);
    }
}
