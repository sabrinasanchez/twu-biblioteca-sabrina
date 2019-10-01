package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book book = new Book("The Shining","Stephen King","1977");

    @Test
    public void shouldPrintaBook() {
        String expected = "The Shining by Stephen King , 1977";
        assertEquals(expected, book.toString());
    }
}