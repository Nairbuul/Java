import javax.swing.JFrame;

public class P2_15 {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setSize(250,300);
        frame.setTitle("Stop light");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        P2_15_util stopLight = new P2_15_util();
         
        frame.add(stopLight);

        frame.setVisible(true);
    }
}
