package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {
    // Book storage
    ArrayList<Book> bookList = new ArrayList<Book>();

    // Returns the welcome message
    public String welcomeMessage(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    // Returns the listOfBooks
    private ArrayList getBookList(){
        return bookList;
    }

    // Prints the list of books
    public void printBookList(ArrayList<Book> bookList){
        for(Book b : bookList){
            System.out.println(b.toString());
        }
    }

    public static void main(String[] args) {
        // Create biblioteca instance
        BibliotecaApp bib = new BibliotecaApp();

        // Populate list with books
        bib.bookList.add(new Book("The Shining","Stephen King","1977"));
        bib.bookList.add(new Book("The Outsiders","S.E. Hinton","1967"));
        bib.bookList.add(new Book("Rebecca","Daphne du Maurier","1938"));

        System.out.println(bib.welcomeMessage());
        bib.printBookList(bib.getBookList());
    }
}
