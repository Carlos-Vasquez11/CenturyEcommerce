package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.PersonalizationAreaDTO;
import com.netshop.ecommerce.domain.repository.PersonalizationAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalizationAreaService {

    @Autowired
    private PersonalizationAreaRepository personalizationAreaRepository;

    public PersonalizationAreaDTO save(PersonalizationAreaDTO personalizationArea) {
        return personalizationAreaRepository.save(personalizationArea);
    }

    public Optional<List<PersonalizationAreaDTO>> getByBaseProductId(Integer id) {
        return personalizationAreaRepository.getByBaseProductId(id);
    }
}
