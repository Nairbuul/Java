import java.util.*;
public class Passenger {
    final Random r = new Random();
    static int passengerNumber = 0;
    public int destination;
    int start_station = 0;
    String name = new String();
    int range = 0;

    /**
     * CTOR that'll give a passenger a name and 
     * @param current_station the station the person originally started at.
     */
    public Passenger(int current_station){
        passengerNumber++;
        this.name = "P#" + current_station + "-" + passengerNumber;
        this.start_station = current_station;
        this.destination = r.nextInt(1,31);
        this.range = (destination - start_station);
    }

    /**
     * Setting the person's desired location.
     * @param destination
     */
    public void setDestination(int destination){
       this.destination = destination;
    }


    /**
     * Accessor function that returns the person's desired destination.
     * @return
     */
    public int getDestination(){
        return  destination;
    }
    
    /**
     * Accessor function that returns the user's station they were picked up from.
     */
    public int getStartStation(){
        return start_station;
    }

    /**
     * Print function.
     */
    public String toString(){
        String output = "Picked up at: " + start_station + "\t\tDesired_station: " + destination;
        return output;
    }
}