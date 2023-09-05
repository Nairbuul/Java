import javax.swing.JFrame;

// Write a program to plot the face at right. Provide a class FaceViewer and a class FaceComponent.
public class P2_14_FaceViewer{
    public static void main(String args[]){
        //Constructing a new frame.
        JFrame frame = new JFrame();
        frame.setSize(250,300);
        frame.setTitle("Face: ");

        //Stops the program when the window is closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Class instruction that tells us how to draw a face.
        P2_14_FaceComponent features = new P2_14_FaceComponent();
        //Adding that image to the frame.
        frame.add(features);

        //Making it visible.
        frame.setVisible(true);
    }
}