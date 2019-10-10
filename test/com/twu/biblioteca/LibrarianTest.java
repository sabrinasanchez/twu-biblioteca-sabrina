package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibrarianTest {
    Librarian librarian = new Librarian();

    @Test
    public void shouldSuccessfullyCheckInBook(){
        String result = librarian.checkInCustomerItem(new Book("The Shining","Stephen King","1977"));

        assertEquals("Thank you for returning the item.",result);
    }

    @Test
    public void shouldUnsuccessfullyCheckInBook(){
        String result = librarian.checkInCustomerItem(null);

        assertEquals("That is not a valid item return.",result);
    }

    @Test
    public void shouldSuccessfullyCheckOutBook(){
        Book testBook = new Book("The Shining","Stephen King","1977");
        librarian.checkInCustomerItem(testBook);
        String result = librarian.checkOutCustomerItem("The Shining");

        assertEquals("Thank you! Enjoy the item.",result);
    }

    @Test
    public void shouldUnsuccessfullyCheckOutBook(){
        String result = librarian.checkOutCustomerItem("The Haunting of Hill House");

        assertEquals("Sorry, that item is not available.",result);
    }

    /*@Test
    public void shouldReturntheListOfItems(){
        String result = librarian.displayList();

        assertEquals("The Outsiders by S.E. Hinton , 1967\nRebecca by Daphne du Maurier , 1938\n", result);
    }*/
}