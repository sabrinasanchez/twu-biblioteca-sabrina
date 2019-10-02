package com.twu.biblioteca;

public class CheckOut implements Command {
    Librarian librarian;
    BibItem bibItem;

    public CheckOut(Librarian librarian, BibItem bibItem){
        this.librarian = librarian;
        this.bibItem = bibItem;
    }

    @Override
    public void execute() {
        librarian.checkOutCustomerItem(bibItem);
    }
}
