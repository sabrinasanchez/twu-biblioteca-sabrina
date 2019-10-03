package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;
/*Manages the list of biblioteca items and displays it*/
public class Librarian {
    private Map<String,BibItem> bibItemsList = new HashMap<String, BibItem>();

    public Map getBibItemList(){ // Returns list of items
        return bibItemsList;
    }

    public String checkInCustomerItem(BibItem checkedInItem){ // Returns message to notify customer of successful/unsuccessful check in
       try{
           this.bibItemsList.put(checkedInItem.getItemName(),checkedInItem);
           return "Thank you for returning the book.";
       }catch (Exception e){
           return "That is not a valid book return.";
       }
    }

    public String checkOutCustomerItem(String checkedOutItem){ // Returns message to notify customer of successful/unsuccessful check out
        if(this.bibItemsList.containsKey(checkedOutItem)){
            this.bibItemsList.remove(checkedOutItem);
            return "Thank you! Enjoy the book.";
        }
        return "Sorry, that book is not available.";
    }

    public void populateBibItemList(){
        // Populate list with books
        Book b1 = new Book("The Shining","Stephen King","1977");
        Book b2 = new Book("The Outsiders","S.E. Hinton","1967");
        Book b3 = new Book("Rebecca","Daphne du Maurier","1938");

        this.checkInCustomerItem(b1);
        this.checkInCustomerItem(b2);
        this.checkInCustomerItem(b3);
    }


    public String displayList(){
        String list = "";
        for(String title : bibItemsList.keySet()){
            list+=bibItemsList.get(title).toString()+"\n";
        }
        return list;
    }
}
