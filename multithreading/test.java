import java.util.*;

public class test {
    public static void main(String args[]){
        // GreetingRunnable r1 = new GreetingRunnable("Hello");
        // Runnable r2 = new GreetingRunnable("Goodbye");
        PrimeThread p = new PrimeThread(143);
        PrimeThread p2 = new PrimeThread(200);
        p.start();
        p2.start();
    }
}