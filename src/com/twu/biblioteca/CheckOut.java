package com.twu.biblioteca;

public class CheckOut implements Command {
    Librarian librarian;

    public CheckOut(Librarian librarian){
        this.librarian = librarian;
    }

    @Override
    public void execute() {

    }
}
