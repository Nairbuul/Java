import javax.swing.JFrame;
import java.awt.Color;

public class CarViewer{
    public static void main(String[] args){
        //Creating a frame.
        JFrame frame = new JFrame();
        //Declaring the size.
        frame.setSize(300, 400);
        //Declaring the title.
        frame.setTitle("Two cars");
        //Making it so the program stops running when the window is closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Declaring a color array.
        Color a[] = {new Color(0,0,255), new Color(255,0,0), new Color(0,255,0)};
        //Passing the color array into CarComponent to construct cars of different colors.
        CarComponent component = new CarComponent(a);
        //Adding the drawing to the frame.
        frame.add(component);
        //Making it visible.
        frame.setVisible(true);
    }
}