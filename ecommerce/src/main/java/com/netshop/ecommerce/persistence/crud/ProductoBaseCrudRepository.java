package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.ProductoBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoBaseCrudRepository extends JpaRepository<ProductoBase,Integer> {
}
