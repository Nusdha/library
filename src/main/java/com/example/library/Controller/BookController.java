package com.example.library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.Model.Book;
import com.example.library.Service.BookService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    public BookController() {

    }

    //http://localhost:8081/api/book/save(POST)
    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        Book saveBook = this.bookService.saveBook(book);
        return ResponseEntity.ok(saveBook);
    }

    //http://localhost:8081/api/book/getAllBook(GET)
    @GetMapping
    public ResponseEntity<List<Book>> getAllBook(){
        List<Book> book = this.bookService.getAllBook();
        return ResponseEntity.ok(book);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Book> getBookById(@PathVariable String id){
        Book book = this.bookService.getBookById(id);
        return book != null ?  ResponseEntity.ok(book) : ResponseEntity.notFound().build();
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Book> updateBook(@PathVariable String id, @RequestBody Book book){
       return new ResponseEntity<>(bookService.updateBook(id, book), HttpStatus.OK);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteBook(@PathVariable String id){
        this.bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
     }
}
