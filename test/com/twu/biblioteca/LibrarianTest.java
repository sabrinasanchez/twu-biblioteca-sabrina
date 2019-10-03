package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LibrarianTest {
    Librarian librarian = new Librarian();

   @Test
    public void shouldReturnBibList() {
        assertEquals(new HashMap<String, BibItem>(), librarian.getBibItemList());
    }

    @Test
    public void shouldSuccessfullyCheckInItem(){
        String result = librarian.checkInCustomerItem(new Book("The Shining","Stephen King","1977"));

        assertEquals("Thank you for returning the book.",result);
    }

    @Test
    public void shouldUnsuccessfullyCheckInItem(){
        String result = librarian.checkInCustomerItem(null);

        assertEquals("That is not a valid book return.",result);
    }

    @Test
    public void shouldSuccessfullyCheckOutItem(){
        Book testBook = new Book("The Shining","Stephen King","1977");
        librarian.checkInCustomerItem(testBook);
        String result = librarian.checkOutCustomerItem("The Shining");

        assertEquals("Thank you! Enjoy the book.",result);
    }

    @Test
    public void shouldUnsuccessfullyCheckOutItem(){
        String result = librarian.checkOutCustomerItem("The Haunting of Hill House");

        assertEquals("Sorry, that book is not available.",result);
    }

    @Test
    public void shouldReturnAllBibItems(){
        Book testBook = new Book("The Shining","Stephen King","1977");
        Book testBook2 = new Book("The Haunting of Hill House","Shirley Jackson","1959");

        librarian.checkInCustomerItem(testBook);
        librarian.checkInCustomerItem(testBook2);

        assertEquals("The Haunting of Hill House by Shirley Jackson , 1959\nThe Shining by Stephen King , 1977\n"
                ,librarian.displayList());
    }
}