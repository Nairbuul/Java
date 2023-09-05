import java.util.*;
public class Passenger {
    static int passengerNumber = 0;
    public int desired_station = 0;
    int start_station = 0;
    Random r = new Random();
    String name = new String();

    public Passenger(int current_station){
        passengerNumber++;
        this.desired_station = r.nextInt(1,31);
        this.start_station = current_station;
        this.name = "P#" + current_station + "-" + passengerNumber;
    }

    public int getDestination(){
        return desired_station;
    }

    public int getStartStation(){
        return start_station;
    }

    public String toString(){
        String output = "Picked up at: " + start_station + "\t\tDesired_station: " + desired_station;
        return output;
    }
}