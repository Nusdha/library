package com.example.library.Service;

import java.util.List;

import com.example.library.Model.User;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUserById(String id);

    User updateUser(String id ,User user);

    void deleteUser(String id);

    User getUserByEmail(String email);
}
