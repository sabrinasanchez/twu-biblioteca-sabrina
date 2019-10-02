package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListBooksTest {

    @Test
    public void shouldDisplayTheBibItems() {
        Librarian lib = new Librarian();
        ListBooks lb = new ListBooks(lib);
        lb.execute();

        Book testBook = new Book("The Shining","Stephen King","1977");
        lib.checkInCustomerItem(testBook);

        //assertEquals("",);-- TODO test the display
    }
}