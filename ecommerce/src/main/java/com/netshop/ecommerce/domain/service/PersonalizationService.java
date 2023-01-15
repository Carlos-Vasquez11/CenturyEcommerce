package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.PersonalizationDTO;
import com.netshop.ecommerce.domain.repository.PersonalizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalizationService {

    @Autowired
    private PersonalizationRepository personalizationRepository;


    public PersonalizationDTO save(PersonalizationDTO personalization) {
        return personalizationRepository.save(personalization);
    }


    public Optional<List<PersonalizationDTO>> getByProductId(Integer id) {
        return personalizationRepository.getByProductId(id);
    }
}
