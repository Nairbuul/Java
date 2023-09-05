import java.util.ArrayList;
import java.util.Random;
public class Driver {
    
  Random r = new Random();
  
  static int driverNum = 0;
  int driverID = 0;
   
  int current_station;
  public int destination;

  final double rate = 5.00;
  double salary;
  ArrayList<Passenger>passengers;

public Driver(){
    driverNum++;
    this.driverID = driverNum;
    this.salary = 0;
    this.current_station = 1;
    this.destination = r.nextInt(1,31);
    this.passengers = new ArrayList<Passenger>();
}

public Driver(int current_station){
    driverNum++;
    this.driverID = driverNum;  
    this.salary = 0;
    this.current_station = current_station;
    this.destination = r.nextInt(1,31);
    this.passengers = new ArrayList<Passenger>();
}

public void getDestination(){
  System.out.println("Driver's Destination: " + destination);
}

public void getRate(){
  System.out.println("Driver's rate per mile: " + rate);
}

public boolean full(){
  if(passengers.size() == 3){
    return true;
  }
  else{
    return false;
  }
}

  public void pickup(Passenger p){
      passengers.add(p);
  }
  public boolean addPassenger(){    
    return false;
  }

  public boolean passengerDestination(){
      for(int i = 0; i < passengers.size(); i++){
          if(passengers.get(i).desired_station == current_station){
              payment(passengers.get(i));
              passengers.remove(i);
              return true;
          }
      }
      return false;
  }

public void drive(){
  if(current_station < destination)
    current_station--;
  else if(current_station > destination)
    current_station++;
  else{
    
  }
}

  public void payment(Passenger p){
    int miles = current_station - p.start_station;
      salary += (rate * miles);
  }

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

      int driverRange = (destination - current_station);
      int passengerRange = (desired_station - current_station);

      if((driverRange > 0 && passengerRange < 0) || (driverRange < 0 && passengerRange >0))
          return false;
      else{
          driverRange = Math.abs(driverRange);
          passengerRange = Math.abs(passengerRange);
      }

      if(passengerRange > 0 && driverRange > 0 && passengerRange <= driverRange)
          return true;
      else
          return false;
  }

  public String toString(){
      String temp = ("Driver's Destination: " + destination + "\tDriver's Rate: [" +  rate + "] per mile\tCapacity: " + passengers.size() + "\tCurrent Station: " + current_station);
      return temp;
  }
}

