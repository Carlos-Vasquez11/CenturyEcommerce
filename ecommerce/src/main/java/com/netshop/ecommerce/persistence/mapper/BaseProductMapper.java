package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.BaseProductDTO;
import com.netshop.ecommerce.persistence.entity.ProductoBase;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PersonalizationAreaMapper.class})
public interface BaseProductMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "descripcion",target = "description"),
            @Mapping(source = "precio",target = "price"),
            @Mapping(source = "tiempoFabricacion",target = "manufacturingTime"),
            @Mapping(source = "areasPersonalizacion",target = "personalizationAreas")
    })
    BaseProductDTO toBaseProduct(ProductoBase productoBase);
    List<BaseProductDTO> toBaseProducts(List<ProductoBase> productosBase);

    @InheritInverseConfiguration
    ProductoBase toProductoBase(BaseProductDTO baseProductDTO);
}