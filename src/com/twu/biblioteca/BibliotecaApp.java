package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {
    private int STATE = 1; // Default to running

    // Getter and Setter for app state
    public void setSTATE(int n) {
        this.STATE = n;
    }

    public int getSTATE(){
        return this.STATE;
    }

    // Book storage
    /*ArrayList<Book> bookList = new ArrayList<Book>();// MOVED TO LIBRARIAN
    ArrayList<String> menuOptions = new ArrayList<String>();*/

    // Returns the welcome message
    public String welcomeMessage(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    // Returns the listOfBooks
    /*private ArrayList getBookList(){
        return bookList;
    }

    // Display menu options
    public ArrayList menuOptions(){
        return menuOptions;
    }

    // Prints the list of books
    public void printBookList(ArrayList<Book> bookList){
        for(Book b : bookList){
            System.out.println(b.toString());
        }
    }*/

    public static void main(String[] args) {
        // Instantiations
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        Librarian librarian = new Librarian();
        
        // Create a scanner
        //Scanner scanner = new Scanner(System.in);

        // Populate list with books
        /*bib.bookList.add(new Book("The Shining","Stephen King","1977"));
        bib.bookList.add(new Book("The Outsiders","S.E. Hinton","1967"));
        bib.bookList.add(new Book("Rebecca","Daphne du Maurier","1938"));

        // Populate menu with options
        bib.menuOptions.add("List of Books");

        System.out.println(bib.welcomeMessage());
        System.out.println(bib.menuOptions().get(0));
        String choice = scanner.next();

        // Menu choice functionality
        while(!choice.equals("Q")){
            if(choice.equals("L")){
                bib.printBookList(bib.bookList);
            }
            choice = scanner.next();
        }*/
    }
}
