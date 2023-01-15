package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.ShopDTO;
import com.netshop.ecommerce.persistence.entity.Tienda;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {PublicationMapper.class})
public interface ShopMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "bannerUrl", target = "bannerUrl"),
            @Mapping(source = "publicaciones", target = "publications"),
    })
    ShopDTO toShop(Tienda tienda);

    @InheritInverseConfiguration
    Tienda toTienda(ShopDTO shop);
}
