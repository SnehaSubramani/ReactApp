package com.example.User_Service.controller;

import com.example.User_Service.Setvice.UserService;
import com.example.User_Service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("all")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

}
