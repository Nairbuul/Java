import java.util.*;
public class tester{
    public static void main(String[] args){
        Random r = new Random();
        Simulation s = new Simulation(r);
        s.loadRandomScenario(30,15,12,13,14);
        s.driveAllCars();
        System.out.println();
        System.out.println("Revenue Per Mile: " + s.getRevenuePerMile());
        System.out.println("Fares Collected: " + s.faresCollected + "\tMiles Driven: " + s.milesDriven + "\tRPM:" + s.getRevenuePerMile());
        System.out.println();
        System.out.println(s.getRate());
        System.out.println(s.getVariables());
        System.out.println(s.getResults());
    }
}    
