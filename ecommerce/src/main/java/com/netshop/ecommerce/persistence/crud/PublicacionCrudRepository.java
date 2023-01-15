package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublicacionCrudRepository extends JpaRepository<Publicacion,Integer> {

    List<Publicacion> findByTiendaIdAndActivaIsTrue(Integer id);

}
