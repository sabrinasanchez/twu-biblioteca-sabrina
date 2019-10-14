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
                System.out.println("John Smith");
                System.out.println("thisisatest@gmail.com");
                System.out.println("1233457676");
            }

            else if(choice.equals("O")){ // User selects to check-out
                System.out.println("Please enter title: ");
                String title = reader.readLine();
                System.out.println("Enter item type (e.g. movie, book, etc.): ");
                String typeOfItem = reader.readLine();
                System.out.println(librarian.checkOutCustomerItem(title, typeOfItem));
            }

            else if(choice.equals("I")){ // User selects to check-in
                System.out.println("Enter item type (e.g. movie, book, etc.): ");
                String typeOfItem = reader.readLine();

                if(typeOfItem.equalsIgnoreCase("book")){ // returning a book
                    System.out.println("Please enter title: ");
                    String title = reader.readLine();

                    /*System.out.println("Please enter author: ");
                    String author = reader.readLine();

                    System.out.println("Please enter year of publication: ");
                    String yob = reader.readLine();

                    Book book = new Book(title,author,yob);*/
                    System.out.println(librarian.checkInCustomerItem(title,typeOfItem));
                }

                else if(typeOfItem.equalsIgnoreCase("movie")) { // returning a movie
                    System.out.println("Please enter title: ");
                    String title = reader.readLine();

                    /*System.out.println("Please enter director: ");
                    String director = reader.readLine();

                    System.out.println("Please enter year of release: ");
                    String yor = reader.readLine();

                    System.out.println("Please enter rating: ");
                    String rating = reader.readLine();

                    Movie movie = new Movie(title, director, yor, rating);*/
                    System.out.println(librarian.checkInCustomerItem(title,typeOfItem));
                }

                else{
                    System.out.println("Invalid Item! Try Again.");
                }
            }

            else if(!choice.equals("Q")){ // User selects invalid option
                System.out.println("Please select a valid option!");
            }
        }
    }
}
