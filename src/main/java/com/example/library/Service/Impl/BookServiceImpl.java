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
        return (bookRepository.save(book));
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(String id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @Override
    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book updateBook(Book book, String id) {
        Book existingBook = getBookById(id);
        existingBook.setBookTittle(book.getBookTittle());
        existingBook.setISBN(book.getISBN());
        existingBook.setPublicationDate(book.getPublicationDate());
        existingBook.setSubject(book.getSubject());
        existingBook.setStatus(book.getStatus());
        existingBook.setUser(book.getUser());
        existingBook.setUserID(book.getUserID());
        existingBook.setAdmin(book.getAdmin());
        existingBook.setAdminId(book.getAdminId());
        return bookRepository.save(existingBook);
    }

}
