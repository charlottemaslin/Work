package uk.ac.kent.el334.digimediastore;

import java.util.ArrayList;

public class Medialtem {

    //variables
    protected String title;
    protected double price;
    protected ArrayList<Integer> ratings;

    public Medialtem(String title) {
        this.title = title;
        this.price = price;
        ratings = new ArrayList<Integer>();
    }

    //get title
    public String getTitle() {
        return title;
    }

    //set title
    public void setTitle(String title) {
        this.title = title;
    }

    //get price
    public double getPrice() {
        return price;
    }

    //set price
    public void setPrice(double price) {
        this.price = price;
    }

    //add ratings
    public void addRating(int rate) {
        ratings.add(rate);
    }

    //get the average ratings
    public float getAvgRating() {
        float sum = 0;

        for (int i=0; i < ratings.size(); i++) {
            sum += ratings.get(i);
        }
        float avgRating = sum / ratings.size();
        return avgRating;
    }


    //print details method
    public void printDetails() {

        System.out.print("Title: " + title);
        System.out.format(", Rating: %.1f/5", getAvgRating());
        System.out.format(" (price £%.2f)", price);


    }


}
