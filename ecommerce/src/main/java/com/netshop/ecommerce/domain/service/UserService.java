package com.netshop.ecommerce.domain.service;

import com.netshop.ecommerce.domain.dto.UserDTO;
import com.netshop.ecommerce.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<UserDTO> getById(Integer id){
        return userRepository.getById(id);
    }

    public UserDTO save(UserDTO user){
        return userRepository.save(user);
    }

    public Optional<UserDTO> getByEmail(String email){
        return userRepository.getByEmail(email);
    }
}