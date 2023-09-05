import javax.swing.JFrame;

public class House_viewer {
    public static void main(String args[]){
        int frameSize = 300;
        int shrink = 1;
        JFrame frame = new JFrame();
        frame.setSize(frameSize,frameSize);
        frame.setTitle("House");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        House h1 = new House(shrink, true);
        frame.add(h1);
        frame.setVisible(true);
    }
}