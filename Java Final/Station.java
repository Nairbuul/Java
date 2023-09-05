import java.util.*;
public class Station {
    private static int ID = 0;
    private ArrayList<Passenger> people;
    private int stationNumber;

    /**
     * Default CTOR that'll initialize all the instance variables.
     */
    public Station(){
        ID++;
        this.stationNumber = ID;
        this.people = new ArrayList<Passenger>();
    }

    /**
     * Accessor function returning the stations number
     * @return station number.
     */
    public int getNumber(){
        return stationNumber;
    }

    /**
     * Adding people waiting at the station.
     * @param p people
     */
    public void add(Passenger p){
        people.add(p);
    }

    /**
     * Function to check if there is people waiting at the station.
     * @return true if there are false if there isnt.
     */
    public boolean hasPeopleWaiting(){
        if(people.size() > 0)
            return true;
        else
            return false;
    }

    /**
     * Accessor function that returns a specific person at the station
     * @param index specifier 
     * @return specified person.
     */
    public Passenger get(int index){
        return people.get(index);
    }

    /**
     * Removes a person from the station queue.
     * @param index specifier
     * @return specified person
     */
    public Passenger remove(int index){
        return people.remove(index);
    }

    /**
     * Function that returns the amount of people waiting at the station.
     * @return amount of people waiting at a station.
     */
    public int peopleWaiting(){
        return people.size();
    }
    
    /**
     * Outstream function.
     */
    public String toString(){
        return (String) "Station Number: " + stationNumber + "\tPeople Waiting: " + peopleWaiting();
    }
}
