package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.PersonalizationAreaDTO;
import com.netshop.ecommerce.domain.repository.PersonalizationAreaRepository;
import com.netshop.ecommerce.persistence.mapper.PersonalizationAreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AreaPersonalizacionRepository implements PersonalizationAreaRepository {

    @Autowired
    private AreaPersonalizacionCrudRepository areaPersonalizacionCrudRepository;

    @Autowired
    private PersonalizationAreaMapper mapper;

    @Override
    public PersonalizationAreaDTO save(PersonalizationAreaDTO personalizationArea) {
        return mapper.toPersonalizationAreaDTO(areaPersonalizacionCrudRepository.save(mapper.toAreaPersonalizacion(personalizationArea)));
    }

    @Override
    public Optional<List<PersonalizationAreaDTO>> getByBaseProductId(Integer id) {
        return Optional.of(mapper.toPersonalizationAreasDTO(areaPersonalizacionCrudRepository.findByProductoBaseId(id)));
    }
}
