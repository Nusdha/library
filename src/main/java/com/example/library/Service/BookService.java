package com.example.library.Service;

import java.util.List;

import com.example.library.Model.Book;

public interface BookService {

    Book saveBook(Book book);

    List<Book> getAllBook();

    Book getBookById(String bookID);

    void deleteBook(String bookID);

    Book updateBook(String bookID, Book book);

}
