package uk.ac.kent.el334.digimediastore;

import java.util.ArrayList;

public class Book extends Medialtem {
    // Instance variables

    private String author;
    private int pages;


    public Book(String title, String author) {
        super(title);
        this.author = author;
        this.pages = 0;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }



    public void printDetails() {
        System.out.print("[Book] ");
        System.out.print("Title: " + title);
        System.out.print(", Author: " + author);
        System.out.print(", Pages: " + pages);
        System.out.format(", Rating: %.1f/5", getAvgRating());
        System.out.format(" (price £%.2f)", price);
        System.out.println();
    }
}
