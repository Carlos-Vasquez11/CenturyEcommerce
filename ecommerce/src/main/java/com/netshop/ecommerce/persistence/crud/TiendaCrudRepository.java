package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TiendaCrudRepository extends JpaRepository<Tienda,Integer> {

}
