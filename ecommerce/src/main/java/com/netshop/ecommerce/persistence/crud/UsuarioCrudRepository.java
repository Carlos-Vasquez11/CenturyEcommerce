package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioCrudRepository extends JpaRepository<Usuario,Integer> {

    Optional<Usuario> findByCorreo(String correo);

}
