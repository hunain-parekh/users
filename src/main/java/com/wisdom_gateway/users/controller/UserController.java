package com.wisdom_gateway.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdom_gateway.users.model.User;
import com.wisdom_gateway.users.repository.IUserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepo;

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id){
        return this.userRepo.findById(id).orElse(null);
    }
}
