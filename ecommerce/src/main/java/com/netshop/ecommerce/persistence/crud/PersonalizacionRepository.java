package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.PersonalizationDTO;
import com.netshop.ecommerce.domain.repository.PersonalizationRepository;
import com.netshop.ecommerce.persistence.mapper.PersonalizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonalizacionRepository implements PersonalizationRepository {

    @Autowired
    private PersonalizacionCrudRepository personalizacionCrudRepository;

    @Autowired
    private PersonalizationMapper mapper;

    @Override
    public PersonalizationDTO save(PersonalizationDTO personalization) {
        return mapper.toPersonalizationDTO(personalizacionCrudRepository.save(mapper.toPersonalizacion(personalization)));
    }

    @Override
    public Optional<List<PersonalizationDTO>> getByProductId(Integer id) {
        return Optional.of(mapper.toPersonalizationsDTO(personalizacionCrudRepository.findByProductoId(id)));
    }
}
