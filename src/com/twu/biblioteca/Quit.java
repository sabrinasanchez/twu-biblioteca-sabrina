package com.twu.biblioteca;

public class Quit implements Command{
    BibliotecaApp ba;

    public Quit(BibliotecaApp ba){
        this.ba = ba;
    }

    @Override
    public void execute() {
        ba.setSTATE(0);
    }
}
