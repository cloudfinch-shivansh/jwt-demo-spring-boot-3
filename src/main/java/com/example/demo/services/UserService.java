package com.example.demo.services;

import com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Dash", "dash@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "asd", "ash@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "sh", "sh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "h", "h@gmail.com"));
    }

    public List<User> getUsers() {
        return store;
    }
}
