package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.ProductDTO;
import com.netshop.ecommerce.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PersonalizationMapper.class, BaseProductMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "productoBaseId", target = "baseProductId"),
            @Mapping(source = "fotoUrl", target = "photoUrl"),
            @Mapping(source = "productoBase", target = "baseProduct"),
            @Mapping(source = "personalizaciones", target = "personalizations")
    })
    ProductDTO toProduct(Producto producto);
    List<ProductDTO> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    Producto toProducto(ProductDTO product);
}
