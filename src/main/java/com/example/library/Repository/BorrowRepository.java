package com.example.library.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.library.Model.Borrow;

public interface BorrowRepository extends MongoRepository<Borrow, Long>{

}
