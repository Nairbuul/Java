import java.util.*;
public class tester{
    public static void main(String[] args){
        Random r = new Random();
        Simulation s = new Simulation(r);
        s.loadRandomScenario(29);
        s.driveAllCars();
        System.out.println(s.getRevenuePerMile());
        System.out.println("S:" + s.faresCollected + "\tM:" + s.milesDriven + "\tRPM:" + s.getRevenuePerMile());
    }
}    
