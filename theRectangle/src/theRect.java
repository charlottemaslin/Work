import javax.swing.*;
import java.awt.*;

//DRAWS THE RECTANGLE
public class theRect extends JPanel{

    //creates the height, width and ratio variables
    int height;
    int width;
    double ratio;

    

    public void init(){
        //creates a temp variable and asks the user to enter the height
        String temp;
        temp = JOptionPane.showInputDialog("Enter the height: " );

        //converts the String temp to an INT
        height = Integer.parseInt(temp);
        //creates the ratio so the width can be worked out
        ratio = (Math.sqrt(5) +1 ) / 2;

        width = (int) Math.round(height * ratio);

        System.out.println(width);


    }




    public void paint(Graphics g)
    {
        Color c = new Color((int)Math.random()*255, (int)Math.random()*255, (int)Math.random()*255);
        g.setColor(c);
        g.fillRect((int)Math.random()*200, (int)Math.random()*600, (int)Math.random()*40, (int)Math.random()*40);
    }

    public void paintComponent(Graphics rect){
        //this creates the rectangle and fills it red
        rect.setColor( new Color( 255, 0, 0 ) );
        rect.fillRect(50,20,width, height);

        for (int i = 0; i < 5; i++) {
            paint(g);
        }

}
