package Car;
import java.time.*;
import java.util.*;

//MAKE ABSTRACT CLASS CAN USE AS PUBLIC
abstract class Car {
    private static int CarID = 0;

    //Instance variables
    int Car_ID;
    double Fair;
    int Current_Location;
    int destination;
    int FuelRemaining;           //in percentage(%)                               
    double FuelCost;
    LocalTime CurrentTime;       //Time Stamp
    LocalTime BusyHoursStart = LocalTime.of(3,00,00);
    LocalTime BusyHoursEnd = LocalTime.of(6,30,00);
    Random r = new Random();
    
    //Constructors
    public Car(){
        CarID++;
        this.Car_ID = CarID;
        this.Fair = 5.00;
        this.FuelCost = 5.23;
        this.Current_Location = 0;
        this.destination = r.nextInt(1,31);
        while(destination == Current_Location){destination = r.nextInt(1,31);}
        this.FuelRemaining = 100;
        this.CurrentTime = LocalTime.now();
    }

    public Car(int Current_Location){
        //Calling own default constructor.
        this();    
        this.Current_Location = Current_Location;
    }

    public Car(int Current_Location, double Fair){
        this();
        this.Current_Location = Current_Location;
        this.Fair = Fair;
    }

    //Accessors
    public double getFair(){
        return Fair;
    }

    public int getLocation(){
        return Current_Location;
    }

    public int getFuelRemaining(){
        return FuelRemaining;
    }

    public double getFuelCost(){
        return FuelCost;
    }

    public LocalTime getCurrentTime(){
        return CurrentTime;
    }

    public String getBusyHours(){
        String temp = "Busy Hours: " + BusyHoursStart + " - " + BusyHoursEnd;
        return temp;  
    }

    //Mutators
    public void setFair(double Fair){
        this.Fair = Fair;
    }

    public void setLocation(int Location){
        this.Current_Location = Location;
    }

    public void setFuelRemaining(int Fuel){
        this.FuelRemaining = Fuel;
    }

    public void setFuelCost(double FuelCost){
        this.FuelCost = FuelCost;
    }

    public void setLocalTime(LocalTime time){
        this.CurrentTime = time;
    }

    public void setBusyHours(LocalTime start, LocalTime end){
        this.BusyHoursStart = start;
        this.BusyHoursEnd = end;
    }

    public String toString(){
        return String.valueOf(CarID);
    }

    abstract boolean hasArrived();











    //NOTES
//     static LocalDate myObj = LocalDate.now();
//     static LocalTime a = LocalTime.now();
//     static LocalTime b = LocalTime.of(8,20,46);
//     static LocalTime c = LocalTime.of(8,20,45);

//     public static void main(String args[]){
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         int value = b.compareTo(c);

//         if(value > 0){
//             System.out.println("b > c");
//         }else if( value == 0){
//             System.out.println("equal");
//         }else{
//             System.out.println("b < c");
//         }

//         Car test = new Car(2);
//         Car tes2 = new Car(2);
//         Car tes36t = new Car(2);
//         Car tes3t = new Car(2);
//         Car tes4t = new Car(2);
//         Car tes5t = new Car(2);
//         Car test7 = new Car(2);
//         System.out.println(test.getBusyHours());
//         System.out.println(test7);
//     }
}

//https://www.geeksforgeeks.org/localtime-compareto-method-in-java-with-examples/

//https://howtodoinjava.com/java/date-time/java-localtime/