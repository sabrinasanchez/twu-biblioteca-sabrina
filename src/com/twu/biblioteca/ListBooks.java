package com.twu.biblioteca;

public class ListBooks implements Command{
    Librarian librarian;

    public ListBooks(Librarian librarian){
        this.librarian = librarian;
    }

    @Override
    public void execute() {
        librarian.displayList();
    }

    @Override
    public void displayUserOptions() {
        System.out.println("(L) List of Books");
    }
}
