package com.twu.biblioteca;

public class Book {
    // Fields
    private String title;
    private String author;
    private String yearOfPublication;

    // Constructor
    Book(String title, String author, String yearOfPublication){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    // Print book description method
    public String toString(){
        String bookDescription = this.title + " by " + this.author + " , " + this.yearOfPublication;
        return bookDescription;
    }

}
