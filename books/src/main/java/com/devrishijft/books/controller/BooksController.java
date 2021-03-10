package com.devrishijft.books.controller;

import com.devrishijft.books.model.Books;
import com.devrishijft.books.services.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BooksController {
    @Autowired
    private BooksServices booksServices;
    @GetMapping("/books")
    public List<Books> getBooks(){
        return this.booksServices.getAllBooks();
    }
    @GetMapping("/books/{id}")
    public Books getBook(@PathVariable("id") int id){
        return booksServices.getBookById(id);
    }
}
