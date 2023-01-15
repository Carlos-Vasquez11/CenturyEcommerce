package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.MedioPago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedioPagoCrudRepository extends JpaRepository<MedioPago,Integer> {

    List<MedioPago> findByVendedorId(Integer id);
}
