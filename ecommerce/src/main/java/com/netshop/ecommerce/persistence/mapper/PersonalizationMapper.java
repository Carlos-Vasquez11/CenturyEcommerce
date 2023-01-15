package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.PersonalizationDTO;
import com.netshop.ecommerce.persistence.entity.Personalizacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonalizationMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "productoId",target = "productId"),
            @Mapping(source = "areaPersonalizacionId",target = "personalizationAreaId"),
            @Mapping(source = "texto",target = "text"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "precio",target = "price")
    })
    PersonalizationDTO toPersonalizationDTO (Personalizacion personalizacion);
    List<PersonalizationDTO> toPersonalizationsDTO (List<Personalizacion> personalizaciones);

    @InheritInverseConfiguration
    Personalizacion toPersonalizacion(PersonalizationDTO personalizationDTO);
}
