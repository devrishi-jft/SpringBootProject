package com.devrishijft.books.model;

import javax.persistence.*;

@Entity

public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    @OneToOne(cascade = CascadeType.ALL)
    private Author author;

    public Books() {
    }

    public Books(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Books(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
