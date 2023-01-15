package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoCrudRepository extends JpaRepository<Producto, Integer> {
}
