package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String printServerStatus() {
        return "Server Started";
    }

    @GetMapping("users")
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping("current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }
}
