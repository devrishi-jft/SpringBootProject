package com.devrishijft.books.services;

import com.devrishijft.books.model.Books;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BooksServices {
    private static List<Books> list= new ArrayList<>();
    static{
        list.add(new Books(12,"java","Abc"));
        list.add(new Books(13,"pythn","Def"));
        list.add(new Books(14,"C++","Ghi"));
    }
    //get all books
    public List<Books> getAllBooks(){
        return list;
    }
    //get single book by id
    public Books getBookById(int id){
        Books books=null;
        books=list.stream().filter(e->e.getId()==id).findFirst().get();
        return books;
    }
}
