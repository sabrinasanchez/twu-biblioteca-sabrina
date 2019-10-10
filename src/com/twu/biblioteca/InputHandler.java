package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;

public class InputHandler {
    BufferedReader bufferedReader;
    Librarian librarian;

    // Constructor
    InputHandler(BufferedReader bufferedReader, Librarian librarian){
        this.bufferedReader = bufferedReader;
        this.librarian = librarian;
    }

    public void beginReading() throws IOException {
        String choice = "";

        while(!choice.equals("Q")){
            choice = bufferedReader.readLine();

            if(choice.equals("L")){
                System.out.print(librarian.displayList());
            }

            else if(choice.equals("O")){ // User selects to check-out
                System.out.println("Please enter title: ");
                String title = bufferedReader.readLine();
                System.out.println(librarian.checkOutCustomerItem(title));
            }

            else if(choice.equals("I")){ // User selects to check-in
                System.out.println("Enter item type (e.g. movie, book, etc.): ");
                String typeOfItem = bufferedReader.readLine();

                if(typeOfItem.equalsIgnoreCase("book")){ // returning a book
                    System.out.println("Please enter title: ");
                    String title = bufferedReader.readLine();

                    System.out.println("Please enter author: ");
                    String author = bufferedReader.readLine();

                    System.out.println("Please enter year of publication: ");
                    String yob = bufferedReader.readLine();

                    Book book = new Book(title,author,yob);
                    System.out.println(librarian.checkInCustomerItem(book));
                }

                else if(typeOfItem.equalsIgnoreCase("movie")) { // returning a movie
                    System.out.println("Please enter name: ");
                    String title = bufferedReader.readLine();

                    System.out.println("Please enter director: ");
                    String director = bufferedReader.readLine();

                    System.out.println("Please enter year of release: ");
                    String yor = bufferedReader.readLine();

                    System.out.println("Please enter rating: ");
                    String rating = bufferedReader.readLine();

                    Movie movie = new Movie(title, director, yor, rating);
                    System.out.println(librarian.checkInCustomerItem(movie));
                }
            }

            else if(!choice.equals("Q")){ // User selects invalid option
                System.out.println("Please select a valid option!");
            }
        }
    }
}
