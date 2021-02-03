import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import  java.util.Random;

public class GoldenRectangle extends JPanel {
    //this creates the buttons and the rectangles and assigns them a variable name
    public static JButton purple_button, green_button, blue_button, pink_button;

    public Shapes shape1;
    public Shapes shape2;
    public Shapes shape3;
    public Shapes goldRect;


    //this method paints all the rectangles onto the JPanel window
    public void paintComponent(Graphics rect) {

        //this sets the colour of the first rectangle and creates the
        //rectangle on the screen with the coordinates and the height and width
        rect.setColor(shape1.shapeColor);
        rect.fillRect(shape1.x, shape1.y, shape1.width1, shape1.height1);

        //this sets the colour of the second rectangle and creates the
        //rectangle on the screen with the coordinates and the height and width
        rect.setColor(shape2.shapeColor);
        rect.fillRect(shape2.x, shape2.y, shape2.width1, shape2.height1);

        //this sets the colour of the third rectangle and creates the
        //rectangle on the screen with the coordinates and the height and width
        rect.setColor(shape3.shapeColor);
        rect.fillRect(shape3.x, shape3.y, shape3.width1, shape3.height1);

        //this sets the colour of the golden rectangle and creates the
        //rectangle on the screen with the coordinates and the height and width
        rect.setColor(goldRect.shapeColor);
        rect.fillRect(goldRect.x, goldRect.y, goldRect.goldwidth,goldRect.goldheight);

    }

    //this is a method to initialse everything
    public void init() {

        //Gold rectangle
        //first the gold rectangle is created and given the colour and where the coordinates are on the JPanel
        //then the method from the "Shapes", "makeGoldenRect" is called to randomise the size.
        goldRect = new Shapes();
        goldRect.shapeColor = new Color(152, 251, 160);
        goldRect.x = 600;
        goldRect.y = 150;
        goldRect.makeGoldenRect();


        //For the other three random Rectangles, they are given the colour and where the coordinates are on the JPanel
        //then the method from the "Shapes", "makeRandomRect" is called to randomise the size.

        //Rectangle 1
        shape1 = new Shapes();
        shape1.shapeColor = new Color(200,160,204);
        shape1.x = 100;
        shape1.y = 150;
        shape1.makeRandomRect();

        //Rectangle 2
         shape2 = new Shapes();
        shape2.shapeColor = new Color(173,212,230);
        shape2.x = 100;
        shape2.y = 500;
        shape2.makeRandomRect();

        //Rectangle 3
         shape3 = new Shapes();
        shape3.shapeColor = new Color(255,153,156);
        shape3.x = 600;
        shape3.y = 500;
        shape3.makeRandomRect();


        //the buttons are then created and named and have the background
        //of the button set to the colour of the corresponding coloured
        //rectangle. Then its set to opaque and added to the JPanel so
        // the user can see it

        purple_button = new JButton("Purple Rectangle");
        purple_button.setBackground(shape1.shapeColor);
        purple_button.setOpaque(true);
        add(purple_button);

        green_button = new JButton("Green Rectangle");
        green_button.setBackground(goldRect.shapeColor);
        green_button.setOpaque(true);
        add(green_button);

        blue_button = new JButton("Blue Rectangle");
        blue_button.setBackground(shape2.shapeColor);
        blue_button.setOpaque(true);
        add(blue_button);

        pink_button = new JButton("Pink Rectangle");
        pink_button.setBackground(shape3.shapeColor);
        pink_button.setOpaque(true);
        add(pink_button);

        //this then makes the buttons work and be able to do actions when pressed
        JButtonHandler handler = new JButtonHandler();
        purple_button.addActionListener(handler);
        green_button.addActionListener(handler);
        blue_button.addActionListener(handler);
        pink_button.addActionListener(handler);



    }

    //this class sets actions to the buttons
    class JButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //if the purple button is pressed then a pop up box appears telling the user that it isn't the golden rectangle
            if (e.getSource() == GoldenRectangle.purple_button) {
                JOptionPane.showMessageDialog(null, "You chose Purple but it's not the Golden rectangle");
            }
            //if the green button is pressed then a pop up box appears telling the user that it is the golden rectangle
            if (e.getSource() == GoldenRectangle.green_button) {
                JOptionPane.showMessageDialog(null, "You chose Green and it is the golden rectangle!");
            }
            //if the blue button is pressed then a pop up box appears telling the user that it isn't the golden rectangle
            if (e.getSource() == GoldenRectangle.blue_button) {
                JOptionPane.showMessageDialog(null, "You chose Blue but it's not the golden rectangle!");
            }
            //if the pink button is pressed then a pop up box appears telling the user that it isn't the golden rectangle
            if (e.getSource() == GoldenRectangle.pink_button) {
                JOptionPane.showMessageDialog(null, "You chose Pink but it's not the golden rectangle!");

            }

        }

    }
}