package com.example.library.Service;

import java.util.List;

import com.example.library.Model.Book;

public interface BookService {

    Book saveBook(Book book);

    List<Book> getAllBook();

    Book getBookById(String id);

    void deleteBook(String id);

    Book updateBook(String id, Book book);

}
