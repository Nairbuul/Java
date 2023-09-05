import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class P2_15_util extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        //Drawing the frame of the stoplight.
        Rectangle stoplightFrame = new Rectangle(85,50,75,150);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(stoplightFrame);
        g2.draw(stoplightFrame);

        Ellipse2D.Double lights = new Ellipse2D.Double(107, 70, 30,30);
        g2.setColor(Color.RED);
        g2.fill(lights);
        g2.draw(lights);

        lights.setFrame(107,110,30,30);
        g2.setColor(Color.YELLOW);
        g2.fill(lights);
        g2.draw(lights);

        lights.setFrame(107,150,30,30);
        g2.setColor(Color.GREEN);
        g2.fill(lights);
        g2.draw(lights);

        lights.setFrame(107,150,31,31);
        g2.setColor(Color.BLACK);
        g2.fill(lights);
        g2.draw(lights);
    }
}
