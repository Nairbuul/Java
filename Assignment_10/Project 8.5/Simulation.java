import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Car Sharing Simulation - Part 3
 * Complete the loadRandomScenario and getRevenuePerMile methods.
 * Follow the instructions in the method.
 */
public class Simulation
{
   private Random generator;
   private ArrayList<Car> cars = new ArrayList<>();
   public double faresCollected = 0.0;
   public int milesDriven = 0;
   private Station[] stations;
   
   /**
    * Construct a simulation using a given generator.
    * @param generator the Random generator to use in this simulation.
    */
   public Simulation(Random generator)
   {
      this.generator = generator;
   }

   private void initStations(int numberOfStations){
        for(int i = 0; i < numberOfStations; i++){
            stations[i] = new Station();
        }
   }

   /**
    * Load a scenario into the simulator.
    * @param numStations - the number of stations to add.
    */
   public void loadRandomScenario(int numStations){
      // Follow this plan
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

      //1.) Construct an array of stations and initialize variable.
      this.stations = new Station[numStations];
      initStations(numStations);

      //2a.) Adding passengers to stations.
      //2b.) Generated a destination that is not the same as their current location.
      for(int i = 0; i < numStations; i++){
        int temp = (10 + generator.nextInt(0, numStations) * 3);
        for(int j = 0; j < temp; j++){
            Passenger p = new Passenger(stations[i].getNumber());
            p.setDestination(setDestination(p.getStartStation()));
            stations[i].add(p);
        }
        stations[i].sortLongestTrip();
      }

      //2c.) 
      for(int i = 0; i < numStations; i++){
        int temp = stations[i].peopleWaiting()/3;
        for(int j = 0; j < temp; j++){
            Car c = new Car(stations[i].getNumber());
            c.setDestination(setDestination(c.getLocation()));
            addCar(c);
        }
        Collections.sort(cars, new CarSorter());
      }
   }

   /**
    * Set's the object's destination that isn't the station the object is currently at.
    * @param notThisOne the current station
    * @return random number that doesn't match the current station.
    */
   public int setDestination(int notThisOne){
        int temp = generator.nextInt(1,31);
        while(temp == notThisOne){
            temp = generator.nextInt(1,31);
        }
        return temp;
   }

   /**
    * Calcuate the revenue per mile.
    */
    public double getRevenuePerMile(){
        // Complete this method.
        
        /*
         * faresCollected = 450
         * milesDriven = 150
         * 450/150 = 3 <-- revenue per mile.
         */

        return faresCollected/milesDriven;
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
