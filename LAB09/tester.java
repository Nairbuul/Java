import java.util.ArrayList;

public class tester {
    public static void main(String args[]){
        /* Test to get sysout to work with container class */
        //====================================================
        // customer Brian = new customer("Brian", 600);
        // System.out.println(Brian);
        
        // ArrayList<customer> t = new ArrayList<customer>();
        // for(int i = 0; i < 10; i++){
        //     t.add(Brian);
        // }
        // System.out.println(t);
        //====================================================

        market t = new market();
        System.out.println(t.nameOfBestCustomer(2));

    }   
}
