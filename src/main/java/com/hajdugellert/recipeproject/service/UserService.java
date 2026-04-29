package com.hajdugellert.recipeproject.service;

import com.hajdugellert.recipeproject.entity.User;
import com.hajdugellert.recipeproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(User user)
    {
        return userRepository.save(user);
    }
}
