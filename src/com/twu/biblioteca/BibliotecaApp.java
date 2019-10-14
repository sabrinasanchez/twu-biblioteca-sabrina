package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BibliotecaApp {

    // Driver method
    public static void main(String[] args) throws IOException {
        // Instantiations
        LibraryDirectory libraryDirectory = null;
        Librarian librarian = new Librarian(libraryDirectory);
        Menu menu = new Menu();

        // Reading user input instantiations
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputHandler inputHandler = new InputHandler(reader,librarian);
        Login login = new Login(reader);

        // Launch app
        if(login.loginApp()){
            menu.displayMenu();
            inputHandler.beginReading();
        }

    }
}
