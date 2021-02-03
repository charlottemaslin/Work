package uk.ac.kent.el334.digimediastore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Catalogue catalogue = new Catalogue();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            catalogue.printCatalogue();

            System.out.println("Select item to be added to the shopping cart. Select 0 to see the cart.");
            System.out.print("Choice: ");
            // Read a
            String line = scanner.nextLine();

            if (line.equals("0")) {
                // TODO: Add the code to show the shopping cart

                System.out.println("Press enter to continue.");
                scanner.nextLine();
            }
            else {
                int position = Integer.parseInt(line) - 1;
                // TODO: Add specific item to the cart


                System.out.println("Item added to the cart. Press enter to continue");
                scanner.nextLine();
            }
        }
    }

}
