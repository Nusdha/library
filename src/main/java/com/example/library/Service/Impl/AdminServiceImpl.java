package com.example.library.Service.Impl;

import com.example.library.Model.Admin;
import com.example.library.Repository.AdminRepository;
import com.example.library.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
