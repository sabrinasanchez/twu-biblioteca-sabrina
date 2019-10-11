package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BibliotecaApp {

    // Driver method
    public static void main(String[] args) throws IOException {
        // Instantiations
        Librarian librarian = new Librarian();
        Menu menu = new Menu();

        // Reading user input instantiations
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler(reader,librarian);
        Login login = new Login(reader);

        // Launch app
        if(login.loginApp()){
            menu.displayMenu();
            inputHandler.beginReading();
        }

    }
}
