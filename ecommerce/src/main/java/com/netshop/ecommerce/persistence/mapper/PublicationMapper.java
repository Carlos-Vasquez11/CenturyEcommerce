package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.PublicationDTO;
import com.netshop.ecommerce.persistence.entity.Publicacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PublicationMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "tiendaId", target = "shopId"),
            @Mapping(source = "productoId", target = "productId"),
            @Mapping(source = "activa", target = "active"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "producto", target = "product")
    })
    PublicationDTO toPublication(Publicacion publicacion);
    List<PublicationDTO> toPublications(List<Publicacion> publicaciones);

    @InheritInverseConfiguration
    Publicacion toPublicacion(PublicationDTO publication);
}
