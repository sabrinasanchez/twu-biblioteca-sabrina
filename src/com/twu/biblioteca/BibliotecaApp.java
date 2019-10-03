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
        String choice = "";

        menu.displayMenu();

        // Begin app
        while(!choice.equals("Q")){
            choice = reader.readLine();
            if(choice.equals("L")){
                System.out.print(librarian.displayList());
            }
            else if(choice.equals("O")){ // User selects to check-out
                System.out.println("Please enter title: ");
                String title = reader.readLine();
                System.out.println(librarian.checkOutCustomerItem(title));
            }
            else if(choice.equals("I")){ // User selects to check-in
                System.out.println("Please enter title: ");
                String title = reader.readLine();

                System.out.println("Please enter author: ");
                String author = reader.readLine();

                System.out.println("Please enter year of publication: ");
                String yob = reader.readLine();

                Book book = new Book(title,author,yob);
                System.out.println(librarian.checkInCustomerItem(book));
            }
            else{ // User selects invalid option
                System.out.println("Please select a valid option!");
                menu.displayMenu();
            }
        }
    }
}
