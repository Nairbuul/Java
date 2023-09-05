import javax.swing.JFrame;

public class P2_13{
    public static void main(String args[]){
        //Constructing a new Frame 
        JFrame frame = new JFrame();
        frame.setSize(250, 300);
        frame.setTitle("Colored Lines");
        
        //This command makes it so that when the frame is closed the 
        //program also stop running.
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));

        //Calling an object with the drawing instructions.
        P2_13_util test = new P2_13_util();

        //Adding the instructions into the frame.
        frame.add(test);

        //Making it visible.
        frame.setVisible(true);
    }
}










/*P2_13 (Notes):
 *Write a graphics program that draws 12 strings, 
 one each for the 12 standard colors (except Color.WHITE),
  each in its own color. Provide a class ColorNameViewer 
  and a class ColorNameComponent. 
 */