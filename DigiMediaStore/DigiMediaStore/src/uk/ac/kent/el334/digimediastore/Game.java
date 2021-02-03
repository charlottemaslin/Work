package uk.ac.kent.el334.digimediastore;

import java.util.ArrayList;

public class Game extends Medialtem{
    // Instance variables

    private String developer;



    public Game(String title, String developer) {
        super(title);
        this.developer = developer;
    }



    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }


    public void printDetails() {
        System.out.print("[Game] ");
        System.out.print("Title: " + title);
        System.out.print(", Developer: " + developer);
        System.out.format(", Rating: %.1f/5", getAvgRating());
        System.out.format(" (price £%.2f)", price);
        System.out.println();

    }
}
