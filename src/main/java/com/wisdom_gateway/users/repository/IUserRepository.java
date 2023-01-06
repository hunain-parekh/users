package com.wisdom_gateway.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdom_gateway.users.model.User;

public interface IUserRepository extends JpaRepository<User,Long>{

    public User findByEmailAndPassword(String email,String password);
}
