package com.twu.biblioteca;

import sun.applet.resources.MsgAppletViewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibraryDirectory {

    // Storage Structures
    private Map<String, Book> availableBooks = new HashMap<String, Book>();
    private Map<String, Movie> availableMovies = new HashMap<String, Movie>();
    private Map<String,User> usersLog = new HashMap<String, User>();

    // Constructor
    LibraryDirectory(){
        this.availableBooks.put("The Outsiders", new Book("The Outsiders", "S.E. Hinton", "1967"));
        this.availableBooks.put("Rebecca", new Book("Rebecca", "Daphne du Maurier", "1938"));
        this.availableBooks.put("Harry Potter and the Chamber of Secrets", new Book("Harry Potter and the Chamber of Secrets", "JK Rowling", "1999"));
        this.availableBooks.put("HeadFirst Design Patterns", new Book("HeadFirst Design Patterns", "John Smith", "1980"));
        this.availableBooks.put("Robots", new Book("Robots", "Steve Hawkinson", "2018"));
        this.availableBooks.put("The River", new Book("The River", "Chicago Jones", "1990"));

        this.availableMovies.put("The Nightmare Before Christmas", new Movie("The Nightmare Before Christmas", "Tim Burton", "1993", "10"));
        this.availableMovies.put("Psycho", new Movie("Psycho", "Alfred Hitchcock", "1960", "10"));
        this.availableMovies.put("The Birds", new Movie("The Birds", "Alfred Hitchcock", "1962", "7"));
        this.availableMovies.put("Halloween", new Movie("Halloween", "John Carpenter", "1978", "10"));
        this.availableMovies.put("Avatar", new Movie("Avatar", "James Cameron", "2005", "10"));
        this.availableMovies.put("Kill Bill Vol.1", new Movie("Kill Bill Vol.1", "Quentin Tarantino", "2000", "10"));
        this.availableMovies.put("Kill Bill Vol.2", new Movie("Kill Bill Vol.2", "Quentin Tarantino", "2002", "10"));

        this.usersLog.put("123-4567", new User("123-4567", "Jon Snow", "mywatchhasended2@email.com", "999-2222"));
        this.usersLog.put("123-abcd", new User("123-4767", "John Winchester", "ghostsandstuff@email.com", "999-2666"));}

    // Updates
    public void checkoutUpdate(String libraryNumber, String title){

        if(availableBooks.containsKey(title)){
            // Get user checkout list and add book being checked out
            usersLog.get(libraryNumber).getCheckedOutBooks().put(title,availableBooks.get(title));

            // Remove book from availableBooks
            availableBooks.remove(title);
        }

        else if(availableMovies.containsKey(title)){
            // Get user checkout list and add movie being checked out
            usersLog.get(libraryNumber).getCheckedOutMovies().put(title,availableMovies.get(title));

            // Remove movie from availableMovies
            availableMovies.remove(title);
        }
    }

    public void checkinUpdate(String libraryNumber, String title){
        if(usersLog.get(libraryNumber).getCheckedOutBooks().containsKey(title)){ // if a book is being returned
            // Get user checked in item
            Book returnedBook = usersLog.get(libraryNumber).getCheckedOutBooks().get(title);

            // Get user checkout list and remove checked in book
            usersLog.get(libraryNumber).getCheckedOutBooks().remove(title);

            // Add to availableBooks
            availableBooks.put(title, returnedBook);
        }

        else if(usersLog.get(libraryNumber).getCheckedOutMovies().containsKey(title)){ // if a movie is being returned
            // Get user checked in item
            Movie returnedMovie = usersLog.get(libraryNumber).getCheckedOutMovies().get(title);

            // Get user checkout list and remove checked in book
            usersLog.get(libraryNumber).getCheckedOutMovies().remove(title);

            // Add to availableBooks
            availableMovies.put(title, returnedMovie);
        }
    }

    // Getters
    public Map<String, Book> getBookList() {
        return availableBooks;
    }

    public Map<String, Movie> getMovieList() {
        return availableMovies;
    }

    public Map<String, User> getUsersLog() {
        return usersLog;
    }

    // Printing lists to console
    public void printBookList(){
        for(String bookTitle : availableBooks.keySet()){
            availableBooks.get(bookTitle).display();
        }
    }

    public void printMovieList(){
        for(String movieTitle : availableMovies.keySet()){
            availableMovies.get(movieTitle).dispay();
        }
    }
}
