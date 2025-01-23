package com.example.library.Service;

import java.util.List;

import com.example.library.Model.Book;

public interface BookService {

    Book saveBook(Book book);

    List<Book> getAllBook();

    Book getBookById(long id);

    Book updateBook(Book book, long id);

    void deleteBook(long id);

}
