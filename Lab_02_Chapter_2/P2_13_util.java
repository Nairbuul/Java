import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class P2_13_util extends  JComponent{
    //This function updates the line objects positions.
    public Line2D.Double lines(double y1,double y2){
        Line2D.Double line = new Line2D.Double(0,y1,250,y2);
        return line;
    }

    //This function returns a color depending on the index value
    public Color colors(int i){
        //Alternate check in case i >= 12
        if(i >= 12){//This makes it so that it'll alternate back to 0, and 11.
            i = i%12;
        }

        switch(i){
            case 0:{
                return Color.BLACK;
            }
            case 1:{
                return Color.BLUE;
            }
            case 2:{
                return Color.CYAN;
            }
            case 3:{
                return Color.GRAY;
            }
            case 4:{
                return Color.DARK_GRAY;
            }
            case 5:{
                return Color.LIGHT_GRAY;
            }
            case 6:{
                return Color.GREEN;
            }
            case 7:{
                return Color.MAGENTA;
            }
            case 8:{
                return Color.ORANGE;
            }
            case 9:{
                return Color.PINK;
            }
            case 10:{
                return Color.RED;
            }
            case 11:{
                return Color.YELLOW;
            }
            default:{
                //Ideally should never get here.
                //If it does we want to notify the programmer that 
                //something unexpected happened and stop the program.
                System.out.println("Out of bounds");
                System.exit(0);
                return Color.WHITE;
            }
        }
    }

    //This function is responsible for drawing the line and setting the color.
    //or can also be called the draw instructions.
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Line2D.Double line = new Line2D.Double(0,0,250,0);
        for(int i = 0; i < 12; i++){
            line = lines(line.getY1()+20, line.getY2()+20);
            g2.setColor(colors(i));
            g2.draw(line);
        }
    }   
}

