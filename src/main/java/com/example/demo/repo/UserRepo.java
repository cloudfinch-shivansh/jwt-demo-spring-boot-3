package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;

public interface UserRepo extends JpaRepository<User, String> {

    public Optional<User> findByEmail(String email);
    
}
