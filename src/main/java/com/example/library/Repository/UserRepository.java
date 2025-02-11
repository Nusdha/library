package com.example.library.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.library.Model.User;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmailAndUserPassword(String email, String userPassword);

}
