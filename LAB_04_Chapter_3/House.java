import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class House extends JComponent{
    /**
     * Default house is made for 300x300 frame.
     * 
     */
    static int size;
    static boolean Shrink;
    public House(int frameSize, boolean shrink){
        size = frameSize;
        Shrink = shrink;
    }
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
    
        //House frame.
        Rectangle frame = new Rectangle(75,75,75,75);
        g2.draw(frame);
    
        //Window.
        frame.setFrame(165, 150, 45, 45);
        g2.draw(frame);
        
        //Door.
        frame.setFrame(100,100,45/2,75/2);
        g2.draw(frame);
    
        //Roof.
        Line2D.Double roof = new Line2D.Double(75,75,150,25);
        g2.draw(roof);
        roof.setLine(150, 25, 225, 75);
        g2.draw(roof);
        
    }   
}

/*public void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;

    //House frame.
    Rectangle frame = new Rectangle(75,75,150,150);
    g2.draw(frame);

    //Window.
    frame.setFrame(165, 150, 45, 45);
    g2.draw(frame);
    
    //Door.
    frame.setFrame(100,150,45,75);
    g2.draw(frame);

    //Roof.
    Line2D.Double roof = new Line2D.Double(75,75,150,25);
    g2.draw(roof);
    roof.setLine(150, 25, 225, 75);
    g2.draw(roof);
    
}*/

/*public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        //House frame.
        Rectangle frame = new Rectangle(75,75,75,75);
        g2.draw(frame);

        //Window.
        frame.setFrame(165/2+(160/4), 150/2+(150/4), 45/2, 45/2);
        g2.draw(frame);
        
        //Door.
        frame.setFrame(100/2+(150/4),150/2+(150/4),45/2,75/2);
        g2.draw(frame);

        //Roof.
        Line2D.Double roof = new Line2D.Double(75,75,150/2+(150/4),25/2+(25/4));
        g2.draw(roof);
        roof.setLine(150/2+(150/size*2), 25/2+(25/4), 150/2+(150/4)*2, 75);
        g2.draw(roof);    
    } */