package com.twu.biblioteca;

import java.util.ArrayList;

/*Displays menu of options and welcome message*/
public class Menu {
    // Fields
    private ArrayList<String> menuOptions = new ArrayList<String>();
    private String header = "---------------------------------------------------------------------------------\n" +
        "| Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore! |\n" +
        "---------------------------------------------------------------------------------";

    // Constructor
    Menu(){
        this.menuOptions.add("(L) List of Books");
        this.menuOptions.add("(O) Check-out");
        this.menuOptions.add("(I) Check-in");
        this.menuOptions.add("(Q) Quit");
    }

    // Getter for header -- used in login
    public String getHeader(){
        return header;
    }

    // Print menu of options
    public void displayMenu(){
        System.out.println(header);
        for(String s : menuOptions){
            System.out.println(s);
        }
    }

    // Returns string of menu -- useful for testing
    public String toString(){
        StringBuilder sb = new StringBuilder(header+"\n");
        for(String s : menuOptions){
            sb.append(s+"\n");
        }

        return sb.toString();
    }

}
