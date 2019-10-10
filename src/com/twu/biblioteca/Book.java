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
        StringBuilder sb = new StringBuilder();

        sb.append(this.title);
        sb.append(" by ");
        sb.append(this.author);
        sb.append(" , ");
        sb.append(this.yearOfPublication);

        return sb.toString();
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
