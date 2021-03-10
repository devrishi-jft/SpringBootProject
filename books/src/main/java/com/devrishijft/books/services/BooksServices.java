package com.devrishijft.books.services;

import com.devrishijft.books.model.Books;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    //adding the book
    public Books addBook(Books b){
        list.add(b);
        return b;
    }

    //delete book
    public void deleteBook(int bookId) {
        System.out.println("bookId 2 = " + bookId);
       list= list.stream().filter(book->book.getId()!=bookId).
               collect(Collectors.toList());
        System.out.println("bookId 3= " + bookId);
    }
    //Update the book
    public void updateBook(Books books, int bookId) {
    list.stream().map(b->{
        if(b.getId()==bookId){
            b.setTitle(books.getTitle());
            b.setAuthor(books.getAuthor());

        }
        return b;
    }).collect(Collectors.toList());
    }
}
