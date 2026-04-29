package com.hajdugellert.recipeproject.controller;

import com.hajdugellert.recipeproject.entity.User;
import com.hajdugellert.recipeproject.service.UserService;
import com.hajdugellert.recipeproject.service.recipeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;


    public UserController(UserService userservice) {
        this.userService = userservice;
    }
    public User createUser(@Valid @RequestBody User newUser)
    {
        return userService.createUser(newUser);
    }
}
