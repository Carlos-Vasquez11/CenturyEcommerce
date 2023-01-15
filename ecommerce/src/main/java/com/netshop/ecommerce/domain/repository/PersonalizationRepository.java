package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.PersonalizationDTO;

import java.util.List;
import java.util.Optional;

public interface PersonalizationRepository {

    PersonalizationDTO save(PersonalizationDTO personalizationDTO);

    Optional<List<PersonalizationDTO>> getByProductId(Integer id);
}
