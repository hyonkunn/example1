package com.example.example1.service;

import com.example.example1.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private final Map<String, User> userMap = new HashMap<>();

    public User addUser(User user) {
        if (userMap.containsKey(user.getId())) {
            throw new IllegalArgumentException("User already exists");
        }
        userMap.put(user.getId(), user);
        return user;
    }

    public User getUser(String id) {
        return userMap.get(id);
    }
}
