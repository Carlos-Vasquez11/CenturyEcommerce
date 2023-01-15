package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.UserDTO;
import org.apache.catalina.User;

import java.util.Optional;

public interface UserRepository {

    Optional<UserDTO> getById(Integer id);

    UserDTO save(UserDTO user);

    Optional<UserDTO> getByEmail(String email);
}
