package com.devrishijft.books.repository;

import com.devrishijft.books.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books , Integer > {
    public Books findById(int bookId);
}
