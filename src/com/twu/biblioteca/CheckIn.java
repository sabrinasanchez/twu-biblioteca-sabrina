package com.twu.biblioteca;

public class CheckIn implements Command {
    Librarian librarian;

    public CheckIn(Librarian librarian){
        this.librarian = librarian;
    }

    @Override
    public void execute() {

    }
}
