package com.twu.biblioteca;
/*Used to create instances of books*/
public class Book implements BibItem{
    // Fields
    private String title;
    private String author;
    private String yearOfPublication;

    // Constructor
    Book(String title, String author, String yearOfPublication){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    // Return book description method
    public String toString(){
        String bookDescription = this.title + " by " + this.author + " , " + this.yearOfPublication;
        return bookDescription;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String getItemName() {
        return this.title;
    }
}
