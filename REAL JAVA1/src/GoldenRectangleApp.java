
import javax.swing.JFrame;
import java.awt.*;

public class GoldenRectangleApp {

    public static void main(String[] args)
    {

        GoldenRectangle panel = new GoldenRectangle();

       panel.init();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel); // add the panel to the frame
        application.setBackground(Color.black);
        application.setSize(1000, 800); // set the size of the frame
        application.setVisible(true); // make the frame visible

    }



}