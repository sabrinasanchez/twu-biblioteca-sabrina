package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;


public class InputHandler {
    BufferedReader reader;
    Librarian librarian;

    // Constructor
    InputHandler(BufferedReader reader, Librarian librarian){
        this.reader = reader;
        this.librarian = librarian;
    }

    public void beginReading() throws IOException {
        String choice = "";

        while(!choice.equals("Q")){

            choice = reader.readLine();

            if(choice.equals("LB")){
                librarian.diplayBookList();
            }

            else if(choice.equals("LM")){
                librarian.displayMovieList();
            }

            else if(choice.equals("P")){
                librarian.displayUserProfile();
            }

            else if(choice.equals("O")){ // User selects to check-out
                System.out.println("Please enter title: ");
                String title = reader.readLine();

                System.out.println(librarian.checkOutCustomerItem(title));
            }

            else if(choice.equals("I")){ // User selects to check-in
                System.out.println("Please enter title: ");
                String title = reader.readLine();

                System.out.println(librarian.checkInCustomerItem(title));
            }

            else if(!choice.equals("Q")){ // User selects invalid option
                System.out.println("Please select a valid option!");
            }
        }
    }
}
