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
/*
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
            assertEquals(menu.toString()+
                    "Psycho directed by Alfred Hitchcock , 1960 | 10/10\n" +
                    "The Outsiders by S.E. Hinton , 1967\n" +
                    "Rebecca by Daphne du Maurier , 1938\n"+
                    "The Nightmare Before Christmas directed by Tim Burton , 1993 | 10/10\n", os);
        }

    }
/*
    @Test
    public void shouldSuccessfullyPromptForCheckOutOptionforBook() throws IOException {
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
                    "Thank you! Enjoy the item.\n", os);
        }

    }

    @Test
    public void shouldSuccessfullyPromptForCheckOutOptionforMovie() throws IOException {
        // Set up input stream
        ByteArrayInputStream input = new ByteArrayInputStream("O\nThe Nightmare Before Christmas\n".getBytes());
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
                    "Thank you! Enjoy the item.\n", os);
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
                    "Sorry, that item is not available.\n", os);
        }

    }

    @Test
    public void shouldSuccessfullyPromptForCheckInOptionforBook() throws IOException {
        // Set up input stream
        ByteArrayInputStream input = new ByteArrayInputStream("I\nbook".getBytes());
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
            assertEquals(menu.toString() + "Enter item type (e.g. movie, book, etc.): \n" +
                    "Please enter title: \n" +
                    "Please enter author: \n" +
                    "Please enter year of publication: \n" +
                    "Thank you for returning the item.\n", os);
        }

    }

    @Test
    public void shouldSuccessfullyPromptForCheckInOptionforMovie() throws IOException {
        // Set up input stream
        ByteArrayInputStream input = new ByteArrayInputStream("I\nmovie".getBytes());
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
            assertEquals(menu.toString() + "Enter item type (e.g. movie, book, etc.): \n" +
                    "Please enter name: \n" +
                    "Please enter director: \n" +
                    "Please enter year of release: \n" +
                    "Please enter rating: \n" +
                    "Thank you for returning the item.\n", os);
        }

    }*/
}