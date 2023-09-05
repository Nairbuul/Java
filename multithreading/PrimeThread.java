import java.util.Date;
public class PrimeThread extends Thread{
    public static int a = 4000;
    int id;
    long minPrime;
    
    public PrimeThread(long minPrime){
        a /= 2;
        id = a;
        this.minPrime = minPrime;
    }

    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(id + "\t\t" + (minPrime *= i+2));
        }
    }

}
