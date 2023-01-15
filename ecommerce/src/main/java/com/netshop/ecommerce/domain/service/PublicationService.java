package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.PublicationDTO;
import com.netshop.ecommerce.domain.repository.PublicationRepository;
import com.netshop.ecommerce.persistence.entity.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicationService {

    @Autowired
    private PublicationRepository publicationRepository;

    public PublicationDTO save(PublicationDTO publicationDTO){
        return publicationRepository.save(publicationDTO);
    }

    public List<PublicationDTO> getByShopId(Integer id){
        return publicationRepository.getByShopId(id);
    }

    public Optional<PublicationDTO> getById(Integer id){
        return publicationRepository.getById(id);
    }

    public List<PublicationDTO> getAll() {
        return publicationRepository.getAll();
    }

    public PublicationDTO updateQuantity(int quantity, Integer publicationId){
        return publicationRepository.updateQuantity(quantity, publicationId);
    }

}
