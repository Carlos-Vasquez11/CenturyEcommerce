package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.SellerDTO;
import com.netshop.ecommerce.persistence.entity.Vendedor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ShopMapper.class, PaymentMethodMapper.class})
public interface SellerMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "tiendaId", target = "shopId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "mediosPago", target = "paymentMethods"),
            @Mapping(source = "tienda", target = "shop")
    })
    SellerDTO toSeller(Vendedor vendedor);
    List<SellerDTO> toSellers(List<Vendedor> vendedores);

    @InheritInverseConfiguration
    Vendedor toVendedor(SellerDTO seller);
}
