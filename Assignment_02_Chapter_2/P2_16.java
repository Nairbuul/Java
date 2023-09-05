import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;;

public class P2_16 {
    public static void main(String[] args){
        //Constructing a frame 
        JFrame frame = new JFrame();
        frame.setSize(400,400);

        //instructions to stop the program when the frame is closed.
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        
        //Constructing a label
        JLabel label = new JLabel("Hello, Brian!");
        label.setOpaque(true);
        //Creating a pale green color for the background.
        Color paleGreen = new Color(151,251,151);
        label.setBackground(paleGreen);

        //Adding it to the frame and making it visible.
        frame.add(label);
        frame.setVisible(true);
    }   
}







//1.) Double the window size.                       (✓)
//2.) Change hello world to hello, your name        (✓)
//3.) Changge thhe background color to pale green.  (✓)

/* P2_16
Run the following program:
import java.awt.Color; import javax.swing.JFrame; import javax.swing.JLabel;
public class FrameViewer
{
public static void main(String[] args)
{
    JFrame frame = new JFrame();
    frame.setSize(200, 200);
    JLabel label = new JLabel("Hello, World!"); label.setOpaque(true); label.setBackground(Color.PINK);
    frame.add(label); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true);
} }

Modify the program as follows:
• Double the frame size.
• Change the greeting to “Hello, your name!”.
• Change the background color to pale green (see Exercise •• Graphics E2.11).
• For extra credit, add an image of yourself. (Hint: Construct an ImageIcon.)
*/