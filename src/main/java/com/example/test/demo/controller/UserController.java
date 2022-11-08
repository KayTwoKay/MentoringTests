package com.example.test.demo.controller;

import com.example.test.demo.dto.UserDTO;
import com.example.test.demo.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add-user")
    public boolean addUser(@RequestBody UserDTO user) {
        return userService.addUser(user);
    }

    @GetMapping("/get-user")
    public UserDTO addUser(@RequestBody Long id) {
        return userService.getUser(id);
    }

    @DeleteMapping("/delete-user")
    public boolean deleteUser(@RequestBody Long id) {
        return userService.deleteUser(id);
    }
}
