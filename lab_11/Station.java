// import java.util.*;

// public class Station {
//     Random r = new Random();

//     public final int amount_of_passengers = 100;                //Amount of passengers at a new station object.
//     public final int amount_of_drivers = 24;                    //Amount of drivers at a new station object.

//     static int station = 0;
//     public int stationID = 0;
    
//     public ArrayList<Passenger> passengers = new ArrayList<Passenger>();
//     public ArrayList<Driver> drivers = new ArrayList<Driver>();    

//     public Station(){
//         station++;
//         stationID = station;
//         initPassengers();
//         initDrivers();
//     }

//     public void getAmountOfPassengers(){
//       System.out.println("Amount of people waiting at station: " + passengers.size());
//     }

//     void initPassengers(){
//         for(int i = 0; i < amount_of_passengers; i++){
//             passengers.add(new Passenger(stationID));
//         }
//         Collections.sort(passengers, new passengerSort());
//         for(int i = 0; i < amount_of_passengers; i++){
//             System.out.println("P: " + passengers.get(i).desired_station);
//         }
//     }

//     // void initDrivers(){
//     //     for(int i = 0; i < amount_of_drivers; i++){
//     //         drivers.add(new Driver(stationID));
//     //     }
//     //     Collections.sort(drivers, new driverSort());

//     //     for(int i = 0; i < amount_of_drivers; i++){
//     //         System.out.println("D: " + drivers.get(i).destination);
//     //     }
//     // }

//     void arrivals(Driver d){
//         drivers.add(d);
//     }

//     boolean full(Driver d){
//         if(d.passengers.size() == 3)
//             return true;
//         return false;
//     }

//     boolean direction(Driver d, Passenger p){
//         if(stationID < p.desired_station && p.desired_station <= d.destination)
//             return true;
//         else if(stationID > p.desired_station && p.desired_station <= d.destination)
//             return true;
//         else 
//             return false;
//     }

//     void simulate(){
//         for(int i = 0; i < drivers.size(); i++){
//             if(!full(drivers.get(i))){
//                 for(int j = 0; (j < passengers.size() && drivers.get(i).passengers.size() != 3); j++){
//                     if(drivers.get(i).withInRange(passengers.get(j).desired_station)){
//                         drivers.get(i).passengers.add(passengers.remove(j));
//                     }
//                 }
//             }
//             if(full(drivers.get(i))){
//                 drivers.remove(i);
//             }
//         }
        
//         for(int i = 0; i < drivers.size(); i++){
//             System.out.println("end: " + drivers.get(i).destination + " " + drivers.get(i).passengers.size());
//         }
//         for(int i = 0; i < passengers.size(); i++){
//             System.out.println("end2: " + passengers.get(i).desired_station);
//         }
//     }
// }

import java.util.*;

public class Station{

    
    ArrayList<Passenger> people;
    static int stationID = 0;
    int stationNumber;

    public Station(){
        stationID++;
        this.stationNumber = stationID;
        this.people = new ArrayList<Passenger>();
    }

    private void initPeople(){
        for(int i = 0; i < 84; i++){
            people.add(new Passenger(stationNumber));
        }
    }

    public int getNumber(){
        return stationNumber;
    }

    public void add(Passenger p){
        people.add(p);
    }

    public boolean hasPeopleWaiting(){
        if(people.size() >= 3){
            return true;
        }
        return false;
    }

    public Passenger get(int index){
        return people.get(index);
    }

    public Passenger remove(int index){
        return people.remove(index);
    }

    public int peopleWaiting(){
        return people.size();
    }

    public String toString(){
        String output = ("StationNumber: " + stationNumber + "\tPeople Waiting: " + peopleWaiting());
        return output;
    }


}