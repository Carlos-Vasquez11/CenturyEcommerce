package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.PersonalizationAreaDTO;
import com.netshop.ecommerce.persistence.entity.AreaPersonalizacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonalizationAreaMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "productoBaseId",target = "baseProductId"),
            @Mapping(source = "lugar",target = "place")
    })
    PersonalizationAreaDTO toPersonalizationAreaDTO(AreaPersonalizacion areaPersonalizacion);
    List<PersonalizationAreaDTO> toPersonalizationAreasDTO(List<AreaPersonalizacion> areasPersonalizacion);

    @InheritInverseConfiguration
    AreaPersonalizacion toAreaPersonalizacion(PersonalizationAreaDTO personalizationAreaDTO);
}
