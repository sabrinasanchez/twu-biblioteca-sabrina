package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*Manages the list of biblioteca items and displays it*/
public class Librarian {
    private Map<String,BibItem> bibItemsList = new HashMap<String, BibItem>();
    private Map<String,String> checkoutLog = new HashMap<String, String>();

    // Constructor
    Librarian(){
        // Populate list with books
        Book b1 = new Book("The Outsiders","S.E. Hinton","1967");
        Book b2 = new Book("Rebecca","Daphne du Maurier","1938");
        Movie m1 = new Movie("The Nightmare Before Christmas","Tim Burton","1993","10");
        Movie m2 = new Movie("Psycho","Alfred Hitchcock","1960","10");

        this.checkInCustomerItem(b1);
        this.checkInCustomerItem(b2);
        this.checkInCustomerItem(m1);
        this.checkInCustomerItem(m2);
    }

    public String checkInCustomerItem(BibItem checkedInItem){ // Returns message to notify customer of successful/unsuccessful check in
       try{
           this.bibItemsList.put(checkedInItem.getItemName(),checkedInItem);

           return "Thank you for returning the item.";
       }catch (Exception e){
           return "That is not a valid item return.";
       }
    }

    public String checkOutCustomerItem(String checkedOutItem){ // Returns message to notify customer of successful/unsuccessful check out
        if(this.bibItemsList.containsKey(checkedOutItem)){
            String s = Login.customerLibraryNumber;

            this.bibItemsList.remove(checkedOutItem);

            checkoutLog.put(s,checkedOutItem);

            return "Thank you! Enjoy the item.";
        }
        return "Sorry, that item is not available.";
    }


    public String displayList(){
        StringBuilder list = new StringBuilder();

        for(String title : bibItemsList.keySet()){
            list.append(bibItemsList.get(title));
            list.append("\n");
        }

        return list.toString();
    }
}
