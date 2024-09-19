package com.example.example1.service;

import com.example.example1.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testAddUser() {
        User user = new User("1", "John Doe", 30);
        User result = userService.addUser(user);
        assertEquals(user, result);
    }

    @Test
    public void testGetUser() {
        User user = new User("1", "John Doe", 30);
        userService.addUser(user);
        User result = userService.getUser("1");
        assertEquals(user, result);
    }

    @Test
    public void testAddExistingUser() {
        User user = new User("1", "John Doe", 30);
        userService.addUser(user);
        assertThrows(IllegalArgumentException.class, () -> userService.addUser(user));
    }
}
