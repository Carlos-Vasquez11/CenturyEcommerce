package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorCrudRepository extends JpaRepository<Vendedor,Integer> {

}
