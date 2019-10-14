package com.twu.biblioteca;

import java.util.ArrayList;

public class Movie {
    // Fields
    private String name;
    private String director;
    private String year;
    private String rating;
    //private final boolean IN = true;
    //private final boolean OUT = false;
    //private boolean status = IN;

    // Constructor
    Movie(String name, String director, String year, String rating){
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    // Setters
   /* public void checkIn(){
        this.status = IN;
    }

    public void checkOut(){
        this.status = OUT;
    }

    // Getter
    public boolean checkStatus(){
        return this.status;
    }*/

    // Return book description method
    public void dispay(){
        String description = this.name + " directed by " + this.director + " , " + this.year + " | " + this.rating + "/10";

        System.out.println(description);
    }

}
