package com.twu.biblioteca;

public class Movie implements BibItem{
    // Fields
    private String name;
    private String director;
    private String year;
    private String rating;

    // Constructor
    Movie(String name, String director, String year, String rating){
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }


    // Return book description method
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(this.name);
        sb.append(" directed by ");
        sb.append(this.director);
        sb.append(" , ");
        sb.append(this.year);
        sb.append(" | ");
        sb.append(this.rating + "/10");

        return sb.toString();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }


    @Override
    public String getItemName() {
        return this.name;
    }
}
