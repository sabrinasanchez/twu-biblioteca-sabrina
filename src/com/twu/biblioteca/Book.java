package com.twu.biblioteca;

import java.util.ArrayList;

/*Used to create instances of books*/
public class Book {
    // Fields
    private String title;
    private String author;
    private String yearOfPublication;
   /* private final boolean IN = true;
    private final boolean OUT = false;
    private boolean status = IN;*/

    // Constructor
    Book(String title, String author, String yearOfPublication){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    // Setters
   /* public void checkIn(){
        this.status = IN;
    }

    public void checkOut(){
        this.status = OUT;
    }

    // Getter
    public boolean checkStatus(){
        return this.status;
    }*/

    // Return book description method
    public void display(){
        String description = this.title + " by " + this.author + " , " + this.yearOfPublication;

        System.out.println(description);
    }

}
