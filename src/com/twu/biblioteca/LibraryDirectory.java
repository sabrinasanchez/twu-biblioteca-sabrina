package com.twu.biblioteca;

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
        bookList.put("Harry Potter and the Chamber of Secrets", new Book("Harry Potter and the Chamber of Secrets","JK Rowling","1999"));
        bookList.put("HeadFirst Design Patterns", new Book("HeadFirst Design Patterns","John Smith","1980"));
        bookList.put("Robots", new Book("Robots","Steve Hawkinson","2018"));
        bookList.put("The River", new Book("The River","Chicago Jones","1990"));

        movieList.put("The Nightmare Before Christmas", new Movie("The Nightmare Before Christmas","Tim Burton","1993","10"));
        movieList.put("Psycho", new Movie("Psycho","Alfred Hitchcock","1960","10"));
        movieList.put("The Birds", new Movie("The Birds","Alfred Hitchcock","1962","7"));
        movieList.put("Halloween", new Movie("Halloween","John Carpenter","1978","10"));
        movieList.put("Avatar", new Movie("Avatar","James Cameron","2005","10"));
        movieList.put("Kill Bill Vol.1", new Movie("Kill Bill Vol.1","Quentin Tarantino","2000","10"));
        movieList.put("Kill Bill Vol.2", new Movie("Kill Bill Vol.2","Quentin Tarantino","2002","10"));
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
