package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.PublicationDTO;
import com.netshop.ecommerce.domain.repository.PublicationRepository;
import com.netshop.ecommerce.persistence.entity.Publicacion;
import com.netshop.ecommerce.persistence.mapper.PublicationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PublicacionRepository implements PublicationRepository {

    @Autowired
    private PublicacionCrudRepository publicacionCrudRepository;

    @Autowired
    private PublicationMapper mapper;

    @Override
    public PublicationDTO save(PublicationDTO publicationDTO) {
        return mapper.toPublication(publicacionCrudRepository.save(mapper.toPublicacion(publicationDTO)));
    }

    @Override
    public PublicationDTO updateQuantity(int quantity, Integer publicationId) {
        Publicacion publicacion = publicacionCrudRepository.findById(publicationId).get();
        publicacion.setCantidad(quantity);
        publicacionCrudRepository.save(publicacion);
        return mapper.toPublication(publicacion);
    }

    @Override
    public List<PublicationDTO> getByShopId(Integer id) {
        return mapper.toPublications(publicacionCrudRepository.findByTiendaIdAndActivaIsTrue(id));
    }

    @Override
    public Optional<PublicationDTO> getById(Integer id) {
        Optional<Publicacion> publicacion = publicacionCrudRepository.findById(id);
        return publicacion.map(unaPublicacion -> mapper.toPublication(unaPublicacion));
    }

    @Override
    public List<PublicationDTO> getAll() {
        return mapper.toPublications( (List<Publicacion>) publicacionCrudRepository.findAll());
    }
}
