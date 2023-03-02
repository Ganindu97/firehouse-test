package com.example.testBackend.service;

import com.example.testBackend.entity.User;
import com.example.testBackend.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public Optional<User> getUser(String username){
        return userRepo.findById(username);
    }
}
