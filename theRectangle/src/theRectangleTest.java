import java.awt.*;
import javax.swing.JFrame;
//THE WINDOW TO CREATE THE WINDOW FOR THE RECTANGLE
public class theRectangleTest {

    public static void main(String[] args) {
        //creates a rectangle
        theRect rect1 = new theRect();
        rect1.init();

        //creates a new JFrame
        JFrame application = new JFrame();
        //makes it so that the window closes on the cross button
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(rect1); // add the panel to the frame
        application.setSize(400, 250); // set the size of the frame
        application.setVisible(true); // make the frame visible
    }
}
