package com.twu.biblioteca;

public class ListBooks implements Command{
    public void execute() {
        Librarian librarian = new Librarian();

        librarian.displayList();
    }
}
