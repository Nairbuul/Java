import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 This component draws two car shapes.
*/
public class CarComponent extends JComponent{
    private Color b[] = new Color[10];

    /*
     * Default CTOR defaults car color to green.
     */
    public CarComponent(){}

    /**
     * CTOR that lets you set the car color
     * @param c Color
     */
    public CarComponent(Color c[]){
        b = c;
    }

    /**
     * Sets the color. 
     * @param c Color
     */
    public void setColor(Color c[]){
        b = c;
    }

    /**
     * Drawing the car component.
     * @param inherited method from JComponent that is part of the draw system GUI.
     */
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        //Looping instructions and updating colors.
        for(int i = 0; i < 3; i++){
            g2.setColor(b[i]);
            Car car = new Car(i*30, i*30);
            car.draw(g2);
        }
    }
}



//Book code.
//========================================
// Car car1 = new Car(0, 0);

// int x = getWidth() - 60;
// int y = getHeight() - 30;

// Car car2 = new Car(x, y);

// car1.draw(g2);
// car2.draw(g2);
// car3.draw(g2);
//========================================