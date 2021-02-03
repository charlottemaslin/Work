package uk.ac.kent.el334.digimediastore;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Medialtem> items;

    public ShoppingCart(ArrayList<Medialtem> shoppingItems) {
        this.items = shoppingItems;
    }

    public void addItem(Medialtem item){

        items.add(item);
    }

    public void getTotalCost(){



    }

    public void printCart(){
        System.out.println("- Shopping Cart!! --------------------------------------------------------------------------------");

        int itemCount = 1;
        for (Medialtem bk : items) {
            System.out.print("["+itemCount + "] ");
            itemCount++;
            bk.printDetails();
        }
        System.out.println("--------------------------------------------------------------------------------------------");


    }


}
