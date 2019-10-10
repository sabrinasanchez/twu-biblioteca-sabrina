package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    Movie movie = new Movie("A Clockwork Orange","Stanley Kubrick","1971","7");

    @Test
    public void shouldPrintaBook() {
        String expected = "A Clockwork Orange directed by Stanley Kubrick , 1971 | 7/10";

        assertEquals(expected, movie.toString());
    }

}