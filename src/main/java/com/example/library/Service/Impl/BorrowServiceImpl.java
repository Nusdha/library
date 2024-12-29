package com.example.library.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.Model.Borrow;
import com.example.library.Repository.BorrowRepository;
import com.example.library.Service.BorrowService;

@Service
public class BorrowServiceImpl implements BorrowService{

    @Autowired
    private BorrowRepository borrowRepository;

    @Override
    public Borrow saveBorrow(Borrow borrow) {
        return (borrowRepository.save(borrow));
    }

    @Override
    public List<Borrow> getAllBorrow() {
        return borrowRepository.findAll();
    }

    @Override
    public Borrow getBorrowById(String id) {
        Optional<Borrow> borrow = borrowRepository.findById(id);
        return borrow.orElseThrow(() -> new RuntimeException("Borrow not found"));
    }

    @Override
    public Borrow updateBorrow(Borrow borrow, String id) {
        Borrow existingBorrow = getBorrowById(id);
            existingBorrow.setBook(borrow.getBook());
            existingBorrow.setBookID(borrow.getBookID());
            existingBorrow.setUser(borrow.getUser());
            existingBorrow.setUserID(borrow.getUserID());
            existingBorrow.setBorrowDate(borrow.getBorrowDate());
            existingBorrow.setReturnDate(borrow.getReturnDate());
            return borrowRepository.save(existingBorrow);
    }

    @Override
    public void deleteBorrow(String id) {
        borrowRepository.deleteById(id);
    }

}
