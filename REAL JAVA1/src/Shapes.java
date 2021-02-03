import java.awt.*;
import java.util.Random;


public class Shapes {

    public int width1;
    public int height1;
    public int x;
    public int y;
    public Color shapeColor;

    public int goldheight;
    public int goldwidth;
    public double ratio;

    public void makeRandomRect(){


        //this method creates random numbers for the widths and heights of the random rectangles

        Random rand = new Random(); //instance of random class
        int upper = 200;
        int no1 = rand.nextInt(upper);
        int no2 = rand.nextInt(upper);

        height1 = no1;
        width1 = no2;
    }




    public void makeGoldenRect(){
        //this method randomly makes the golden rectangle and has
        // the maths equation for it tp be worked out


        Random rand = new Random(); //instance of random class
        int upperbound = 200 ;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);

        //converts the String temp to an INT - it creates the golden rectangle
        goldheight = Integer.parseInt(String.valueOf(int_random));
        ratio = (Math.sqrt(5) + 1) / 2;
        goldwidth= (int) Math.round(goldheight * ratio);





    }


}
