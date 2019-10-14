package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User {
    // Fields
    private String libraryNumber;
    private String name;
    private String email;
    private String phoneNumber;
    private Map<String, Book> checkedOutBooks = new HashMap<String, Book>();
    private Map<String, Movie> checkedOutMovies = new HashMap<String, Movie>();

    // Constructor
    User(String libraryNumber, String name, String email, String phoneNumber){
        this.libraryNumber = libraryNumber;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Map<String, Book> getCheckedOutBooks(){
        return checkedOutBooks;
    }

    public Map<String, Movie> getCheckedOutMovies(){ return checkedOutMovies; }

    // Display user profile
    public void displayProfile(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName() + "\n");
        sb.append(this.getEmail() + "\n");
        sb.append(this.getPhoneNumber());

        System.out.println(sb.toString());
    }
}
