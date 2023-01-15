package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.PurchaseDTO;
import com.netshop.ecommerce.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ItemMapper.class})
public interface PurchaseMapper {

        @Mappings({
                @Mapping(source = "id", target = "id"),
                @Mapping(source = "usuarioId", target = "userId"),
                @Mapping(source = "items", target = "items"),
        })
        PurchaseDTO toPurchase(Compra compra);
        List<PurchaseDTO> toPurchases(List<Compra> compras);

        @InheritInverseConfiguration
        Compra toCompra(PurchaseDTO purchase);
}