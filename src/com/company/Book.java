package com.company;

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
}
