import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class House extends JComponent{
    int _dimensions = 150;
    
    //Default Ctor
    public House(){}

    /**
        Change the size of the house.
        @param dimensions Set's the house size.
    */
    public House(int dimensions){
        _dimensions = dimensions;
    }

    /**
     * Function that draws the house components.
     * @param g inherited method from JComponent that is part of the draw system GUI.
     */
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;

        /*  House
            We also alter the x&y so that the shapes stay together while the size get's altered  
        */
        Rectangle box = new Rectangle(_dimensions/2,_dimensions/2,_dimensions,_dimensions);
        g2.draw(box);

        /*  Window
            Updating the rectangle obj to new dimensions and x&y values. We want the window to be a
            quarter of the size of the house frame.
        */
        box.setFrame(_dimensions, _dimensions, _dimensions/4,_dimensions/4);
        g2.draw(box);

        /*  Door
            Updating the rectanble obj once more.
            We want the door to be placed at 1/3 of the house frame and it's dimension to be the same width
            as the window and the half the height of the square. 
        */
        box.setFrame((_dimensions/3)*2,_dimensions,_dimensions/4,_dimensions/2);
        g2.draw(box);

        /* Roof
            We create the first line object to go up to half of the dimension of the house.
            Then the second objects starts where the first line object ended and ends at the 
            other corner of the house.
         */
        Line2D.Double roof = new Line2D.Double(_dimensions/2,_dimensions/2,_dimensions,_dimensions/6);
        g2.draw(roof);
        roof.setLine(_dimensions,_dimensions/6, (_dimensions*3)/2, _dimensions/2);
        g2.draw(roof);
    }
}
