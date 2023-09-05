import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class P2_14_FaceComponent extends JComponent{
    //Method has to be paintComponent
    public void paintComponent(Graphics g){
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        //Setting the color
        Color darkViolet = new Color(148,0,211);
        g2.setColor(darkViolet);

        //Creating a circle as a head.
        Ellipse2D.Double head = new Ellipse2D.Double(5,10,200,200);
        g2.draw(head);

        //Creating a smaller circle for the eyes. 
        //Drawing left one first.
        Ellipse2D.Double eyes = new Ellipse2D.Double(40, 75, 30, 30);
        g2.draw(eyes);
        //Moving the coords after drawing it to draw the right eye.
        eyes.setFrame(140,75,30,30);
        g2.draw(eyes);

        //Drawing the mouth.
        Line2D.Double mouth = new Line2D.Double(40, 150, 160, 150);
        g2.draw(mouth);
    }
}