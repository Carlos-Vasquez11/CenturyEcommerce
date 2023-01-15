package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.PersonalizationAreaDTO;

import java.util.List;
import java.util.Optional;

public interface PersonalizationAreaRepository {

    //Create
    PersonalizationAreaDTO save(PersonalizationAreaDTO personalizationArea);

    //Read
    Optional<List<PersonalizationAreaDTO>> getByBaseProductId(Integer id);
}
