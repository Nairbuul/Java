import java.util.Random;
import java.util.ArrayList;
/**
 * Car Sharing Simulation - Part 3
 * Complete the loadRandomScenario and getRevenuePerMile methods.
 * Follow the instructions in the method.
 */
public class Simulation
{
   private Random generator;
   private ArrayList<Car> cars = new ArrayList<>();
   private double faresCollected = 0.0;
   private int milesDriven = 0;
   private Station[] stations;
   
   /**
    * Construct a simulation using a given generator.
    * @param generator the Random generator to use in this simulation.
    */
   public Simulation(Random generator)
   {
      this.generator = generator;
      this.stations = new Station[30];
      initStations();
   }

   /**
    * Load a scenario into the simulator.
    * @param numStations - the number of stations to add.
    */
   public void loadRandomScenario(int numStations)
   {
      // Follow this plan
      // 1. Construct the array of stations and initialize variables
      // 2. Visit each station; generate a station, cars and passengers
      //    NOTE: When constructing stations, the station number will be 1 
      //    greater than the array index, so stations[0].getNumber() returns 1.
      //    Follows numbering scheme that the cars and passengers expect.
      //   A. For the number of passengers to add to each station, 
      //      Use 10 + a random number from 0 to the number of stations * 3
      //      Generate this number separately for each station
      //   B. Randomly select a destination station between 1 + number of stations
      //      If the destination is the same as the station number, keep trying.
      //      You can generate a random name for the passenger.
      //   C. For each station, the number of cars should be the number of
      //      passengers (for that station) / 3. Generate the destinations
      //      using the same algorithm as with the passengers.

      //A.) Initializing people waiting at a station.
        for(int i = 0; i < 30; i++){
            int numberOfPeopleAtStation = 10 + generator.nextInt(0,30) * 3;
            for(int j = 0; j < numberOfPeopleAtStation; j++){
                stations[i].add(new Passenger(stations[i].getNumber()));
            }
        }

        //B.) Randomly select a destination station between 1 + number of stations

        //C.) 
        for(int i = 0; i < 30; i++){
            int numberOfCarsAtStation = stations[i].peopleWaiting()/3;
            for(int j = 0; j < numberOfCarsAtStation; j++){
                cars.add(new Car(stations[i]));
            }
        }
    }

    public void initStations(){
        for(int i = 0; i < 30; i++){
            stations[i] = new Station();
        }
    }

   /**
    * Calcuate the revenue per mile.
    */
   public double getRevenuePerMile(){
      // Complete this method.
        return 0;
    }
   
   
   // Accessor methods
   public void addCar(Car car) { cars.add(car); }
   public double getFares() { return faresCollected; }
   public int getMilesDriven() { return milesDriven; }
   
   /**
    * Drive all the cars to their destination.
    */
   public void driveAllCars()
   {
      while (cars.size() > 0)
      {
         for (int i = cars.size() - 1; i >= 0; i--)
         {
            Car car = cars.get(i);
            loadPassengers(stations[car.getLocation() - 1], car);
            car.drive();
            car.dropOff();
            if (car.hasArrived())
            {
               faresCollected += car.getFares();
               milesDriven += car.getMilesDriven();
               cars.remove(i);
            }
         }
      }
   }
   
   /**
    * Pick up passengers from a station.
    * @station the station to load passengers from.
    * @car the car that we want to load the passengers into.
    */
   public void loadPassengers(Station station, Car car)
   {
      if (car.hasRoom() && station.hasPeopleWaiting())
      {
         int cDest = car.getDestination();
         for (int i = station.peopleWaiting() - 1; car.hasRoom() && i >= 0; i--)
         {
            Passenger possible = station.get(i);
            int pDest = possible.getDestination();
            int stationNo = station.getNumber();
            if (stationNo > cDest && pDest < stationNo && pDest >= cDest ||
                stationNo < cDest && pDest > stationNo && pDest <= cDest)
            {
               car.add(station.remove(i));
            }
         }
      }
   }
}
