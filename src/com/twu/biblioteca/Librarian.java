package com.twu.biblioteca;

/*
*
* Manages the list of biblioteca items and displays it
*
* */
public class Librarian {
    // Fields
    private LibraryDirectory lb = new LibraryDirectory();

    // Constructor
    Librarian(LibraryDirectory ld){
        this.lb = lb;
    }

    public String checkInCustomerItem(String title){ // Returns message to notify customer of successful/unsuccessful check in
            if(lb.checkinUpdate(Login.customerLibraryNumber, title)){
                return "Thank you for returning the item.";
            }

            return "That is not a valid item return.";
    }

    public String checkOutCustomerItem(String title) { // Returns message to notify customer of successful/unsuccessful check out
            if(lb.checkoutUpdate(Login.customerLibraryNumber, title)){
                return "Thank you! Enjoy the item.";
            }

            return "Sorry, that item is not available.";
    }

    // Prints lists
    public void diplayBookList(){ lb.printBookList(); }

    public void displayMovieList(){ lb.printMovieList(); }

    // Get user profile
    public void displayUserProfile(){
        try{
            lb.getUsersLog().get(Login.customerLibraryNumber).displayProfile();

        } catch(Exception ex){
            System.out.println("No user info on file for this account");
        }

    }

}
