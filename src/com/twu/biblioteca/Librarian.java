package com.twu.biblioteca;

import com.sun.xml.internal.ws.util.UtilException;

/* Manages the list of biblioteca items and displays it */
public class Librarian {
    // Fields
    private LibraryDirectory lb = new LibraryDirectory();

    // Constructor
    Librarian(LibraryDirectory ld){
        this.lb = lb;
    }

    public String checkInCustomerItem(String title, String type){ // Returns message to notify customer of successful/unsuccessful check in
        if(type.equalsIgnoreCase("book") && !lb.getBookList().get(title).checkStatus()){
            lb.getBookList().get(title).checkIn();
            return "Thank you for returning the item.";
        }
        else if(type.equalsIgnoreCase("movie") && !lb.getMovieList().get(title).checkStatus()){
            lb.getMovieList().get(title).checkIn();
            return "Thank you for returning the item.";
        }
        else{
            return "That is not a valid item return.";
        }
       /* try{
            lb.getBookList().put(title,checkedInItem);

            return "Thank you for returning the item.";
         }catch (Exception e){
            return "That is not a valid item return.";
         }*/
    }

    public String checkOutCustomerItem(String title, String type) { // Returns message to notify customer of successful/unsuccessful check out
        if (type.equalsIgnoreCase("book") && lb.getBookList().get(title).checkStatus()) {
            lb.getBookList().get(title).checkOut();
            return "Thank you for returning the item.";
        }
        else if (type.equalsIgnoreCase("movie") && lb.getMovieList().get(title).checkStatus()) {
            lb.getBookList().get(title).checkOut();
            return "Thank you for returning the item.";
        }
        else {
            return "That is not a valid item return.";
        }
    }

    public void diplayBookList(){
        lb.printMyBookList();
    }

    public void displayMovieList(){
        lb.printMovieList();
    }
 /*       if(lb.getBookList().containsKey(checkedOutItem)){
            String s = Login.customerLibraryNumber;

            lb.getBookList().remove(checkedOutItem);

            lb.checkoutLog().put(s,checkedOutItem);

            return "Thank you! Enjoy the item.";
        }
        return "Sorry, that item is not available.";
    }
*/
}
