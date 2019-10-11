package com.twu.biblioteca;

import java.util.ArrayList;

/*Used to create instances of books*/
public class Book implements BibItem{
    // Fields
    private String title;
    private String author;
    private String yearOfPublication;
    private final boolean IN = true;
    private final boolean OUT = false;
    private boolean status = IN;

    // Constructor
    Book(String title, String author, String yearOfPublication){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    // Setters
    public void checkIn(){
        this.status = IN;
    }

    public void checkOut(){
        this.status = OUT;
    }

    // Getter
    public boolean checkStatus(){
        return this.status;
    }

    // Return book description method
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(this.title);
        sb.append(" by ");
        sb.append(this.author);
        sb.append(" , ");
        sb.append(this.yearOfPublication);

        return sb.toString();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String getItemName() {
        return this.title;
    }

}
