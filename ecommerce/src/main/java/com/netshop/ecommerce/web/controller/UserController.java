package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.UserDTO;
import com.netshop.ecommerce.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    ResponseEntity<UserDTO> getById(@PathVariable("id") Integer id){
        return ResponseEntity.of(userService.getById(id));
    }

    @PostMapping("/save")
    ResponseEntity<UserDTO> save(@RequestBody UserDTO user){
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }
}