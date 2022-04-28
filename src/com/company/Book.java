package com.company;

import java.util.Objects;

public class Book {
    String name;
    Author bookAuthor;
    int publishDate;

    public Book(String name, int publishDate, Author bookAuthor) {
    this.bookAuthor =bookAuthor;
    this.publishDate = publishDate;
    this.name = name;
    }
    public String getName () {
       return this.name;
    }

    public Author getBookAuthor() {
        return this.bookAuthor;
    }

    public int getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;

    }
    public String toString() {
        return "[" + this.name + ". " + this.bookAuthor.toString() + ". " + this.publishDate + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishDate == book.publishDate && name.equals(book.name)
                && bookAuthor.equals(book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bookAuthor, publishDate);
    }
}
