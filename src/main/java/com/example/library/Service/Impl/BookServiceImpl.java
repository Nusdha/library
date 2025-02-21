package com.example.library.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.Model.Book;
import com.example.library.Repository.BookRepository;
import com.example.library.Service.BookService;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(String bookID) {
        Optional<Book> book = bookRepository.findById(bookID);
        return book.orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @Override
    public void deleteBook(String bookID) {
        bookRepository.deleteById(bookID);
    }

    @Override
    public Book updateBook(String bookID,Book book) {
        Book existingBook = getBookById(bookID);
        existingBook.setBookTittle(book.getBookTittle());
        existingBook.setISBN(book.getISBN());
        existingBook.setPublicationDate(book.getPublicationDate());
        existingBook.setSubject(book.getSubject());
        existingBook.setStatus(book.getStatus());
        return bookRepository.save(existingBook);
    }

}
