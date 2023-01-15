package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.PublicationDTO;

import java.util.List;
import java.util.Optional;

public interface PublicationRepository {

    PublicationDTO save(PublicationDTO publicationDTO);

    PublicationDTO updateQuantity(int quantity, Integer publicationId);

    List<PublicationDTO> getByShopId(Integer id);

    Optional<PublicationDTO> getById(Integer id);

    List<PublicationDTO> getAll();
}
