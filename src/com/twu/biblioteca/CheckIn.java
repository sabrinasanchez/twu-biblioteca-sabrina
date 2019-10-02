package com.twu.biblioteca;

public class CheckIn implements Command {
    Librarian librarian;
    BibItem bibItem;

    public CheckIn(Librarian librarian, BibItem bibItem){
        this.librarian = librarian;
        this.bibItem = bibItem;
    }

    @Override
    public void execute() {
        librarian.checkInCustomerItem(bibItem);
    }
}
