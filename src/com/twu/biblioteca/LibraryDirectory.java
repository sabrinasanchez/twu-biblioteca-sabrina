package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibraryDirectory {

    // Storage Structures
    private Map<String, Book> bookList = new HashMap<String, Book>();
    private Map<String, Movie> movieList = new HashMap<String, Movie>();
    private Map<String,String> checkoutLog = new HashMap<String, String>();

    // Constructor
    LibraryDirectory(){
        bookList.put("The Outsiders", new Book("The Outsiders","S.E. Hinton","1967"));
        bookList.put("Rebecca", new Book("Rebecca","Daphne du Maurier","1938"));

        movieList.put("The Nightmare Before Christmas", new Movie("The Nightmare Before Christmas","Tim Burton","1993","10"));
        movieList.put("Psycho", new Movie("Psycho","Alfred Hitchcock","1960","10"));
    }


    // Getters
    public Map<String, Book> getBookList() {
        return bookList;
    }

    public Map<String, Movie> getMovieList() {
        return movieList;
    }

    public Map<String, String> checkoutLog() {
        return checkoutLog;
    }

    // Printing lists to console
    public void printMyBookList(){
        for(String bookTitle : bookList.keySet()){
            bookList.get(bookTitle).display();
        }
    }

    public void printMovieList(){
        for(String movieTitle : movieList.keySet()){
            movieList.get(movieTitle).display();
        }
    }
}
