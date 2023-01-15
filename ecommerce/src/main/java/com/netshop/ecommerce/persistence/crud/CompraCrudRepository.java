package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraCrudRepository extends JpaRepository<Compra, Integer> {

    List<Compra> findByUsuarioId(Integer id);

}
