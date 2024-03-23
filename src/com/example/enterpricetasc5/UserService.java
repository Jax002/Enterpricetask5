package com.example.enterpricetasc5;



import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<SecurityProperties.User> users = new ArrayList<>();
    private Long userIdCounter = 1L;

    public List<SecurityProperties.User> getAllUsers() {
        return users;
    }

    public SecurityProperties.User createUser(SecurityProperties.User user) {
        user.setName(String.valueOf(userIdCounter++));
        users.add(user);
        return user;
    }

    public void deleteUser(Long userId) {
        users.removeIf(user -> user.getName().equals(userId));
    }
}