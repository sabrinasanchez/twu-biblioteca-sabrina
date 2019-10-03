package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {



    // Driver method
    public static void main(String[] args) {
        // Instantiations
        Librarian librarian = new Librarian();

        // Populate list with books
        Book b1 = new Book("The Shining","Stephen King","1977");
        Book b2 = new Book("The Outsiders","S.E. Hinton","1967");
        Book b3 = new Book("Rebecca","Daphne du Maurier","1938");

        librarian.checkInCustomerItem(b1);
        librarian.checkInCustomerItem(b2);
        librarian.checkInCustomerItem(b3);

        // Create a scanner
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        Menu menu = new Menu();
        menu.displayMenu();
        while(!choice.equals("Q")){
            choice = scanner.next();
            if(choice.equals("L")){

            }
            else if(choice.equals("O")){

            }
            else if(choice.equals("I")){
                System.out.println("Please enter title: ");
                String title = scanner.nextLine();

                System.out.println("Please enter author: ");
                String author = scanner.nextLine();

                System.out.println("Please enter year of publication: ");
                String yob = scanner.nextLine();

                Book book = new Book(title,author,yob);
                librarian.checkInCustomerItem(book);
            }

        }
    }
}
