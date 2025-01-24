package com.example.library.Service;

import java.util.List;

import com.example.library.Model.User;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUserById(String id);

    User updateUser(User user, String id);

    void deleteUser(String id);

}
