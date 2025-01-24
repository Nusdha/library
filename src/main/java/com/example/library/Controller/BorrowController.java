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

import com.example.library.Model.Borrow;
import com.example.library.Service.BorrowService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/borrow")
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    public BorrowController() {

    }

    //http://localhost:8081/api/borrow/save(POST)
    @PostMapping
    public ResponseEntity<Borrow> saveBorrow(@RequestBody Borrow borrow){
        return new ResponseEntity<>(borrowService.saveBorrow(borrow), HttpStatus.CREATED);
    }

    //http://localhost:8081/api/borrow/getAllBorrow(GET)
    @GetMapping
    public List<Borrow> getAllBorrow(){
        return borrowService.getAllBorrow();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Borrow> getBorrowById(@PathVariable String id){
        return new ResponseEntity<>(borrowService.getBorrowById(id),HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Borrow> updateBorrow(@PathVariable String id, @RequestBody Borrow borrow){
       return new ResponseEntity<>(borrowService.updateBorrow(borrow, id),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBorrow(@PathVariable String id){
        borrowService.deleteBorrow(id);
        return new ResponseEntity<>("Borrow deleted successfully",HttpStatus.OK);
     }

}
