package com.jr.cloud.controller;

import com.jr.cloud.entity.User;
import com.jr.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public Optional<User> findById(@PathVariable long id){
        return this.userRepository.findById(id);
    }
}
