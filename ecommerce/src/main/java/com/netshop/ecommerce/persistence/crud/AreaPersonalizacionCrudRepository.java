package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.AreaPersonalizacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AreaPersonalizacionCrudRepository extends JpaRepository<AreaPersonalizacion,Integer> {

    List<AreaPersonalizacion> findByProductoBaseId(Integer id);
}
