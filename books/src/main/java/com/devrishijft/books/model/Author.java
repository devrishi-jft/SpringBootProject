package com.devrishijft.books.model;

import javax.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    private String name;
    private String address;

    public Author() {
    }

    public Author(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Author(int authorId, String name, String address) {
        this.authorId = authorId;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
