package com.example.library.Model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection = "borrow")
@Data
@Builder
public class Borrow {

    @Id
    @Generated
    private String borrowId;

    private Book book;
    private String bookID;
    private User user;
    private long userID;

    private LocalDate borrowDate;
    private LocalDate returnDate;

    public String getBorrowId() {
        return borrowId;
    }

    public Book getBook() {
        return book;
    }

    public String getBookID() {
        return bookID;
    }

    public User getUser() {
        return user;
    }

    public long getUserID() {
        return userID;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
