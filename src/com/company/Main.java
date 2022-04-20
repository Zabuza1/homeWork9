package com.company;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Ulya" , "Sazonov");
        System.out.println("Author name - " + author.getFirstName() + " " + author.getMiddleName());
        Book book = new Book("Java", 2020, author);
        book.setPublishDate(2021);
        System.out.print("Book name - " + book.getName() + " ," + "publish date is ");
        System.out.print(book.getPublishDate() + ", " + "author of the book " + book.getBookAuthor()); //сделал в 2 строки чтоб не залезать за полосочку.
        System.out.println();

        Author author1 = new Author("Alexander", "Macedonian");
        Author author2 = new Author("Gojo", "Satoru");
        Book book1 = new Book("Python", 2015, author1);
        book1.setPublishDate(2016);
        Book book2 = new Book("C++", 2016, author2);
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }
}
