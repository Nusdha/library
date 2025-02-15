package com.example.library.Repository;

import com.example.library.Model.Admin;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {

    Admin findByAdminEmail(String adminEmail);

}
