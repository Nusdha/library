package com.example.library.Service;

import java.util.List;

import com.example.library.Model.User;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUserById(String userID);

    User updateUser(String userID ,User user);

    void deleteUser(String userID);

    User getUserByEmail(String email);
}
