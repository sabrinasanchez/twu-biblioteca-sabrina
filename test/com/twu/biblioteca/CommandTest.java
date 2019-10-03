package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandTest {

    @Test
    public void shouldSuccessfullyCheckInItem() {
        Librarian librarian = new Librarian();
        Book book = new Book("Test", "Sabrina Sanchez", "2019");

        CheckIn checkIn = new CheckIn(librarian, book);
        checkIn.execute();

        assertEquals("Test by Sabrina Sanchez , 2019\n", librarian.displayList());
    }

    @Test
    public void shouldSuccessfullyCheckOutItem() {
        Librarian librarian = new Librarian();
        Book book = new Book("Test", "Sabrina Sanchez", "2019");

        CheckIn checkIn = new CheckIn(librarian, book);
        checkIn.execute();

        CheckOut checkOut = new CheckOut(librarian, book);
        checkOut.execute();

        assertEquals("", librarian.displayList());
    }
}