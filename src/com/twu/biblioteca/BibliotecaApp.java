package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BibliotecaApp {

    // Driver method
    public static void main(String[] args) throws IOException {
        // Instantiations
        Librarian librarian = new Librarian();
        Menu menu = new Menu();

        // Populate list with books
        Book b1 = new Book("The Shining","Stephen King","1977");
        Book b2 = new Book("The Outsiders","S.E. Hinton","1967");
        Book b3 = new Book("Rebecca","Daphne du Maurier","1938");

        librarian.checkInCustomerItem(b1);
        librarian.checkInCustomerItem(b2);
        librarian.checkInCustomerItem(b3);

        // Reading user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputHandler inputHandler = new InputHandler(reader);
        String choice = "";

        menu.displayMenu();
        inputHandler.beginReading();

    }
}
