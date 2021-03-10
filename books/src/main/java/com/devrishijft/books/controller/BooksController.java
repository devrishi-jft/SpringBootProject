package com.devrishijft.books.controller;

import com.devrishijft.books.model.Books;
import com.devrishijft.books.services.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BooksController {
    @Autowired
    private BooksServices booksServices;
    //get all book handler
    @GetMapping("/books")
    public List<Books> getBooks(){
        return this.booksServices.getAllBooks();
    }

    //get single book handler
    @GetMapping("/books/{id}")
    public Books getBook(@PathVariable("id") int id){
        return booksServices.getBookById(id);
    }

    //new book handler
    @PostMapping("/books")
    public Books addBook(@RequestBody Books books){
       Books b=this.booksServices.addBook(books);
        return b;
    }

    //delete book handler
    @DeleteMapping("/books/delete/{bookId}")
    public void deletebook(@PathVariable("bookId") int bookId){
        this.booksServices.deleteBook(bookId);
        System.out.println("bookId = " + bookId);
    }

    //update book handler
    @PutMapping("/books/update/{bookId}")
    public Books updatebook(@RequestBody Books books,@PathVariable("bookId") int bookId){
        this.booksServices.updateBook(books,bookId);
        return books;
    }

}
