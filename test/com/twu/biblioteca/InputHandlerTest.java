package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.*;
import java.lang.System;
import static org.junit.Assert.*;
/*
* NOTE: Call to main driver method is surrounded in a try/catch because NullPointerException was being returned
* by InputHandler.beginReading() (line 22). The catch method is always triggered.
*
* */
public class InputHandlerTest {
    Menu menu = new Menu();

    @Test
    public void shouldSuccessfullyListMenuOptions() throws IOException {
        // Set up input stream
        ByteArrayInputStream input = new ByteArrayInputStream("L\n".getBytes());
        System.setIn(input);

        // Initialize for output stream read
        ByteArrayOutputStream output = null;

        try {
            // Set up output stream
            output = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(output);
            System.setOut(ps);

            // Run app
            BibliotecaApp.main(null);

        } catch (NullPointerException ne){
            // Assert
            String os = output.toString("UTF8");
            assertEquals(menu.toString()+"The Outsiders by S.E. Hinton , 1967\n" +
                    "Rebecca by Daphne du Maurier , 1938\n", os);
        }

    }

    @Test
    public void shouldSuccessfullyPromptForCheckOutOption() throws IOException {
        // Set up input stream
        ByteArrayInputStream input = new ByteArrayInputStream("O\nThe Outsiders\n".getBytes());
        System.setIn(input);

        // Initialize for output stream read
        ByteArrayOutputStream output = null;

        try {
            // Set up output stream
            output = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(output);
            System.setOut(ps);

            // Run app
            BibliotecaApp.main(null);

        } catch (NullPointerException ne){
            // Assert
            String os = output.toString("UTF8");
            assertEquals(menu.toString()+"Please enter title: \n" +
                    "Thank you! Enjoy the book.\n", os);
        }

    }

    @Test
    public void shouldSuccessfullyPromptForCheckOutOptionAndReturnError() throws IOException {
        // Set up input stream
        ByteArrayInputStream input = new ByteArrayInputStream("O\nThe Haunting of Hill House\n".getBytes());
        System.setIn(input);

        // Initialize for output stream read
        ByteArrayOutputStream output = null;

        try {
            // Set up output stream
            output = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(output);
            System.setOut(ps);

            // Run app
            BibliotecaApp.main(null);

        } catch (NullPointerException ne){
            // Assert
            String os = output.toString("UTF8");
            assertEquals(menu.toString()+"Please enter title: \n" +
                    "Sorry, that book is not available.\n", os);
        }

    }

    @Test
    public void shouldSuccessfullyPromptForCheckInOption() throws IOException {
        // Set up input stream
        ByteArrayInputStream input = new ByteArrayInputStream("I\n".getBytes());
        System.setIn(input);

        // Initialize for output stream read
        ByteArrayOutputStream output = null;

        try {
            // Set up output stream
            output = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(output);
            System.setOut(ps);

            // Run app
            BibliotecaApp.main(null);

        } catch (NullPointerException ne){
            // Assert
            String os = output.toString("UTF8");
            assertEquals(menu.toString()+"Please enter title: \n" +
                    "Please enter author: \n" +
                    "Please enter year of publication: \n" +
                    "Thank you for returning the book.\n", os);
        }

    }
}