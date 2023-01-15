package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.UserDTO;
import com.netshop.ecommerce.domain.repository.UserRepository;
import com.netshop.ecommerce.persistence.entity.Usuario;
import com.netshop.ecommerce.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UsuarioRepository implements UserRepository {

    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @Autowired
    private UserMapper mapper;


    @Override
    public Optional<UserDTO> getById(Integer id) {
        return usuarioCrudRepository.findById(id).map(unUsuario -> mapper.toUser(unUsuario));
    }

    @Override
    public UserDTO save(UserDTO user) {
        return mapper.toUser(usuarioCrudRepository.save(mapper.toUsuario(user)));
    }

    @Override
    public Optional<UserDTO> getByEmail(String email) {
        return usuarioCrudRepository.findByCorreo(email).map(unUsuario -> mapper.toUser(unUsuario));
    }
}
