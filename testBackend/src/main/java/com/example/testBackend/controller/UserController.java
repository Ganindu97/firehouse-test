package com.example.testBackend.controller;

import com.example.testBackend.entity.User;
import com.example.testBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser/{username}")
    public Optional<User> getUser(@PathVariable(value="username") String username){
        return userService.getUser(username);
    }
}
