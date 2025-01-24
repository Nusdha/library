package com.example.library.Service;

import java.util.List;

import com.example.library.Model.Book;

public interface BookService {

    Book saveBook(Book book);

    List<Book> getAllBook();

    Book getBookById(String id);

    Book updateBook(Book book);

    void deleteBook(String id);

}
