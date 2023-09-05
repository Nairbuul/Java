import javax.swing.JFrame;

public class House_viewer {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setTitle("House");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        House h1 = new House(150);
        frame.add(h1);
        frame.setVisible(true);
    }
}