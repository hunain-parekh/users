package com.wisdom_gateway.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdom_gateway.users.model.Auth;
import com.wisdom_gateway.users.model.User;
import com.wisdom_gateway.users.repository.IUserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private IUserRepository userRepo;

    @PostMapping("/login")
    public User user(@RequestBody Auth auth){
        User user = this.userRepo.findByEmailAndPassword(auth.getEmail(), auth.getPassword());
        return user;
    }

    @PostMapping("/register")
    public User user(@RequestBody User user){
        this.userRepo.save(user);
        return user;
    }
}
