package com.example.library.Service;

import java.util.List;

import com.example.library.Model.Borrow;

public interface BorrowService {

    Borrow saveBorrow(Borrow borrow);

    List<Borrow> getAllBorrow();

    Borrow getBorrowById(String id);

    Borrow updateBorrow(Borrow borrow, String id);

    void deleteBorrow(String id);

}
