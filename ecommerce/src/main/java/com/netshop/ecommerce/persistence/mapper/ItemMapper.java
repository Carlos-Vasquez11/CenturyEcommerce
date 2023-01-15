package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.ItemDTO;
import com.netshop.ecommerce.persistence.entity.Item;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface ItemMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "compraId", target = "purchaseId"),
            @Mapping(source = "productoId", target = "productId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "producto", target = "product")
    })
    ItemDTO toItemDTO(Item item);
    List<ItemDTO> ItemsDTO(List<Item> items);

    @InheritInverseConfiguration
    Item toItem(ItemDTO itemDTO);
}
