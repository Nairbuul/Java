import java.util.*;
public class Passenger extends People{
    static int passengerNumber = 0;
    public int destination;
    int start_station = 0;

     
    public Passenger(String FullName, String Address, String Zip, int current_station){
        setName(FullName);
        setAddress(Address);
        setZip(Zip);
        this.start_station = current_station;
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