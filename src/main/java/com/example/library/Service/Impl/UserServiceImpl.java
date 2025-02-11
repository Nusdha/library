package com.example.library.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.Model.User;
import com.example.library.Repository.UserRepository;
import com.example.library.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User updateUser(User user, String id) {
        User existingUser = getUserById(id);
                existingUser.setUserFirstName(user.getUserFirstName());
                existingUser.setUserLastName(user.getUserLastName());
                existingUser.setEmail(user.getEmail());
                existingUser.setDepartment(user.getDepartment());
                existingUser.setCourse(user.getCourse());
                existingUser.setYearOfEnrollment(user.getYearOfEnrollment());
                existingUser.setUserPassword(user.getUserPassword());
                return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User loginUser(String email, String userPassword) {

        return userRepository.findByEmailAndUserPassword(email,userPassword);
    }

}
