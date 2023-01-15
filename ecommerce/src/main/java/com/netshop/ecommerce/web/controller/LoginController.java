package com.netshop.ecommerce.web.controller;

import com.netshop.ecommerce.domain.dto.UserDTO;
import com.netshop.ecommerce.domain.service.UserService;
import com.netshop.ecommerce.web.Requests.LoginRequest;
import com.netshop.ecommerce.web.Requests.UserId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;


    @PostMapping("/user")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        Optional<UserDTO> user = userService.getByEmail(loginRequest.getEmail());
        if (user.isPresent() && user.get().getPassword().equals(loginRequest.getPassword())) {
            // Si el usuario existe y la contraseña es correcta, devuelve un código de estado 200
            return ResponseEntity.ok().build();
        } else {
            // Si el usuario no existe o la contraseña es incorrecta, devuelve un código de estado 401
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @PostMapping("/getUserId")
    public ResponseEntity<UserId> getUserId(@RequestBody LoginRequest loginRequest) {
        Optional<UserDTO> user = userService.getByEmail(loginRequest.getEmail());
        if (user.isPresent() && user.get().getPassword().equals(loginRequest.getPassword())) {
            // Si el usuario existe y la contraseña es correcta, devuelve el obejct userId y un código de estado 200
            UserId userId = new UserId();
            userId.setUserId(user.get().getId());
            return ResponseEntity.ok(userId);
        } else {
            // Si el usuario no existe o la contraseña es incorrecta, devuelve un código de estado 401
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @GetMapping("{id}")
    ResponseEntity<UserDTO> getById(@PathVariable("id") Integer id){
        return ResponseEntity.of(userService.getById(id));
    }
}


