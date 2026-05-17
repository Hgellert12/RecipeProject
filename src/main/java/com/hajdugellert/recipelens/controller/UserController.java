package com.hajdugellert.recipelens.controller;

import com.hajdugellert.recipelens.entity.User;
import com.hajdugellert.recipelens.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;


    public UserController(UserService userservice) {
        this.userService = userservice;
    }
    @PostMapping
    public User createUser(@Valid @RequestBody User newUser)
    {
        return userService.createUser(newUser);
    }
    @GetMapping("/search")
    public List<User> getByName(@RequestParam String username)
    {
        return userService.getByUsername(username);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id)
    {
        return userService.getById(id);
    }
    @GetMapping
    public List<User> getAllUsers()
    {
        return userService.getAllUser();
    }
}
