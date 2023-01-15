package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.Personalizacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonalizacionCrudRepository extends JpaRepository<Personalizacion,Integer> {


    List<Personalizacion> findByProductoId (Integer id);
}
