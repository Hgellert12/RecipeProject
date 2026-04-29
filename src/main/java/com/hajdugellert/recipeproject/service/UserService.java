package com.hajdugellert.recipeproject.service;

import com.hajdugellert.recipeproject.entity.User;
import com.hajdugellert.recipeproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(User user)
    {
        return userRepository.save(user);
    }
    public List<User> getByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }
    public User getById(Long Id)
    {
        return userRepository.findById(Id).orElseThrow(() -> new RuntimeException("User not found"));
    }
    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
}
