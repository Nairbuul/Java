// import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class RNC_TESTER {
    /**
     * Test by generating random numbers and checking output.
     * @param args
     */
    public static void main(String args[]){
        Logger LOGGER = Logger.getGlobal();
        // LOGGER.setLevel(Level.OFF);

        
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNextInt()){
            System.out.println("Invald input");
            return;
        }

        int maxValue = 3999;
        int smallestValue = 0;
        int value = scan.nextInt();
        
        if(value >= smallestValue && value <= maxValue){
            System.out.println("Number: " + value + " " + RomanNumeral.convert(value));
        }
        else{
            System.out.println("Invalid input");
        }
    }
}


// Random rand = new Random();
// RomanNumeral a = new RomanNumeral();
// for(int i = 0; i <= 100; i++){
//     int b = (i*rand.nextInt(10));
//     System.out.println("Number: " + b + " " + a.convert(b));
// }
//ADD pop up window.