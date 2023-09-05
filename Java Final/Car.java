import java.util.*;

public class Car{

    public double rate = 5.00;
    public static int ID = 0;
    public int CarID;
    int location;
    public double gasCost = 5.39;
    int gasTank;
    int mpg;
    int destination;
    double fares;
    int milesDriven;
    ArrayList<Passenger> passengers; 

    public Car(){
        ID++;
        this.gasTank = 0;
        this.mpg = 0;
        this.CarID = ID;
        this.location = 0;
        this.destination = 0;
        this.milesDriven = 0;
        this.fares = 0;
        this.passengers = new ArrayList<Passenger>();
    }
    
    /**
     * CTOR that'll initialize all the instance variables. 
     * @param current_station the station the driver is starting his trip at.
     */
    public Car(int current_station){
        ID++;
        this.CarID = ID;
        this.location = current_station;
        this.destination = 0;
        this.milesDriven = 0;
        this.fares = 0;
        this.passengers = new ArrayList<Passenger>();
    }

    public void setGasTank(int GasTank){
        this.gasTank = GasTank;
    }

    public int getGasTank(int GasTank){
         return gasTank;
    }

    public void setMPG(int mpg){
        this.mpg = mpg;
    }

    public int getMPG(){
        return mpg;
    }

    public void setCurrentStation(int current_station){
        this.location = current_station;
    }

    /**
     * Accessor function that returns the location the driver is currently at.
     * @return location.
     */
    public int getLocation(){
        return location;
    }

    public double getRate(){
        return rate;
    }

    /**
     * Accessor function that returns the driver's final location.
     * @return destination.
     */
    public int getDestination(){
        return destination;
    }

    /**
     * Sets the driver's laste destination.
     * @param destination the driver's last destination.
     */
    public void setDestination(int destination){
        this.destination = destination;
    }

    /**
     * Check to see if we reached the final destination of the driver.
     * @return True if we reacehd the final destination of the driver.
     */
    public boolean hasArrived(){
        if(destination == location){

            return true;
        }
        return false;
    }

    /**
     * Function that checks if we have room or not.
     * @return true if we have room false elsewise.
     */
    public boolean hasRoom(){
        if(passengers.size() < 3)
            return true;
        return false;
    }
    
    /**
     * Accessor function that'll return the amount of fares we've collected during our trip.
     * @return fares
     */
    public double getFares() {
        return fares;
    }

    /**
     * Accessor function that returns the amount of miles the driver drove.
     * @return miles driven.
     */
    public int getMilesDriven() {
        return milesDriven;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    /**
     * Function that'll update location depending on the direction we're headed.
     */
    public void drive(){
        if(location > destination){
            milesDriven++;
            location--;
        }
        else if(location < destination){
            milesDriven++;
            location++;
        }
        else{

        }
    }

    /**
     * Mutator function that'll add to our fares.
     * @param p passenger that'll be paying.
     */
    public void payment(Passenger p){
        int miles = Math.abs(location - p.start_station);
        fares += (rate*miles);
        fares -= (miles*mpg);
    }
        
    /**
     * Drops off the passenger and collects our payment.
     */
    public void dropOff(){
        for(int i = 0; i < passengers.size(); i++){
            if(passengerArrival(passengers.get(i))){
                payment(passengers.get(i));
                passengers.remove(i);
            }
        }
    }

    public double getGasPrices(){
        return gasCost;
    }

    public void setGasPrices(double gasCost){
        this.gasCost = gasCost;
    }

    /**
     * Checks if we're at the passengers destination. 
     * @param p Passenger 
     * @return true if we're at the desired destination false elsewise.
     */
    public boolean passengerArrival(Passenger p){
        if(p.destination == location)
            return true;
        return false;
    }

    public int getAmountOfPassengers(){
        return passengers.size();
    }

    /**
     * Function that'll add passengers if there is room AND the passengers destination is within the driver's route.
     * @param p passenger that we're picking up depending on certain conditions.
     * @return true if their is room and it's within our destination else false.
     */

    public boolean add(Passenger p){
        if(!hasRoom()){
            return false;
        }

        if(!withInRange(p.destination)){
            return false;
        }   

        passengers.add(p);
        return true;
    }

    /**
     * Function to check if the passengers destination is within the driver's route.
     * @param desired_station the passengers destination.
     * @return true if the passenger's destination is within the driver's route; false elsewise.
     */
    public boolean withInRange(int desired_station){    
        //current station 12        30-12 = 28          
        //passenger dest = 26       26-12 = 14
        //driver dest = 30          
  
        //current station 26        10-26 = -16
        //passenger dest 12         12-26 = -12
        //driver destination 10
  
  
        //currentStation 20         10-20 = -10
        //passenger dest 26         26-20 = 6
        //driver destination 10 
  
        int driverRange = (destination - location);
        int passengerRange = (desired_station - location);
  
        if((driverRange > 0 && passengerRange < 0) || (driverRange < 0 && passengerRange >0))
            return false;
        else{
            driverRange = Math.abs(driverRange);
            passengerRange = Math.abs(passengerRange);
        }
  
        // if(passengerRange > 0 && driverRange > 0 && passengerRange <= driverRange)
        if(passengerRange <= driverRange)
            return true;
        else
            return false;
    }
 
    /**
     * Print function.
     */
    public String toString(){
        return (String) "Driver's Destination: " + destination + "\tDriver's Rate: [" + rate + "] per mile\tCapacity: " + passengers.size() + "\tCurrent Station: " + location;
    }
}   
