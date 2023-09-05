import java.util.*;

public class Car{

    final double rate = 5.00;
    static int driver = 0;

    ArrayList<Passenger> passengers;
    int driverID;
    double fares;
    int current_station;
    int destination;
    int milesDriven;
    Random r = new Random();

    public Car(int current_station){
        driver++;
        this.driverID = driver;
        this.passengers = new ArrayList<Passenger>();
        this.fares = 0;
        destination();
        this.current_station = current_station;
        this.milesDriven = current_station;
    }

    private void destination(){
        this.destination = r.nextInt(1,31);
        while(destination == current_station){
            destination = r.nextInt(1,31);
        }
    }

    public int getDestination(){
        return destination;
    }

    public int getLocation(){
        return current_station;
    }

    public boolean hasArrived(){
        boolean arrived = false;
        for(int i = 0; i < passengers.size();i++){
            if(passengers.get(i).desired_station == current_station){
                payment(passengers.get(i));
                dropOff(passengers.get(i));
                arrived = true;
            }
        }
        return arrived;
    }

    public boolean reachedDestination(){
        if(current_station == destination){
            return true;
        }
        return false;
    }

    public boolean hasRoom(){
        if(passengers.size() > 3){
            return false;
        }
        return true;
    }

    public double getFares(){
        return fares;
    }

    public int getMilesDriven(){
        return Math.abs(current_station - milesDriven);
    }

    public void payment(Passenger p){
        int milesDriven = Math.abs(p.start_station - current_station);
        fares += (milesDriven * rate);
    }

    public void drive(){
        if(current_station < destination){
            current_station++;
        }
        else if(current_station > destination){
            current_station--;
        }
        else{

        }
    }

    public void dropOff(Passenger p){
        passengers.remove(p);
    }

    public void dropOff(){
        for(int i = 0; i < passengers.size()-1;i++){
            if(passengers.get(i).desired_station == current_station){
                passengers.remove(i);
            }
        }
    }

    public boolean add(Passenger p){
        if(passengers.size() > 3){
            return false;
        }
        passengers.add(p);
        return true;
    }

    public String toString(){
        String temp = "Driver ID: " + driverID + "\tCurrent Destination: " + current_station + "\tDestination: " + destination;
        return temp;
    }
}