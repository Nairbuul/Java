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
   private Station[] stations;
   private Address_Generator ag;
   public double faresCollected = 0.0;
   public int milesDriven = 0;
   public int AmountOfThreeSeaters;
   public int AmountOfFiveSeaters;
   public int AmountOfLuxuryThreeSeaters;
   public int AmountOfLuxuryFiveSeaters;
   public int AmountOfStations;

   /**
    * Construct a simulation using a given generator.
    * @param generator the Random generator to use in this simulation.
    */
   public Simulation(Random generator)
   {
      this.generator = generator;
      ag =  new Address_Generator(generator);
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
   public void loadRandomScenario(int numStations,  int AmountOfLuxury3Seaters, int AmountOfLuxury5Seaters, int AmountOf3Seaters, int AmountOf5Seaters){
      this.AmountOfLuxuryFiveSeaters = AmountOfLuxury5Seaters;
      this.AmountOfLuxuryThreeSeaters = AmountOf3Seaters;
      this.AmountOfFiveSeaters = AmountOf5Seaters;
      this.AmountOfThreeSeaters = AmountOf3Seaters;
      this.AmountOfStations = numStations;
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

      //2a.) Add passengers to stations (Amount = 10 + randomly generated number bounded to number of stations * 3)
      //2b.) Generate a  destination that is not the same as the station they're (Driver/Passenger) is currently at.
      //2c.) Add cars to the stations.


      //2a.) Adding passengers to stations.
      //2b.) Generated a destination that is not the same as their current location.
      for(int i = 0; i < numStations; i++){
        int temp = (10 + generator.nextInt(0, numStations) * 3);
        for(int j = 0; j < temp; j++){
            Passenger p = new Passenger(ag.generateFullName(), ag.generateAddress(), ag.generateCity() + ag.generateZip(), stations[i].getNumber());
            p.setDestination(setDestination(p.getStartStation()));
            stations[i].add(p);
        }
      }


      //2c.) 
      for(int i = 0; i < numStations; i++){
         int temp = stations[i].peopleWaiting()/3;

         for(int j = 0; j < AmountOf3Seaters; j++){
            Three_Seater ThreeC = new Three_Seater(stations[i].getNumber());
            ThreeC.setDestination(setDestination(ThreeC.getLocation()));
            cars.add(ThreeC);
         }
         for(int k = 0; k < AmountOf5Seaters; k++){
            Five_Seater FiveC = new Five_Seater(stations[i].getNumber());
            FiveC.setDestination(setDestination(FiveC.getLocation()));
            cars.add(FiveC);
         }
         for(int l = 0; l < AmountOfLuxury3Seaters; l++){
            Luxury_Three_Seater L3C = new Luxury_Three_Seater(stations[i].getNumber());
            L3C.setDestination(setDestination(L3C.getLocation()));
            cars.add(L3C);
         }
         for(int m = 0; m < AmountOfLuxury3Seaters; m++){
            Luxury_Five_Seater L5C = new Luxury_Five_Seater(stations[i].getNumber());
            L5C.setDestination(setDestination(L5C.getLocation()));
            cars.add(L5C);
         }
         int amountOfCars = AmountOf3Seaters + AmountOf5Seaters + AmountOfLuxury3Seaters + AmountOfLuxury5Seaters;
         if(amountOfCars < temp){
            amountOfCars -= temp;
            for(int n = 0; n < amountOfCars; n++){
               Three_Seater a = new Three_Seater(stations[i].getNumber());
               a.setDestination(setDestination(a.getLocation()));
               cars.add(a);
            }
         }
      }
   }

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

         // Miles Driven / MPG(specific vehicle) = gallons used.
         // Gallons Used * Price per Gallon = Gas Cost
         // FaresCollected - Gas Cost = Actual Profit
        return faresCollected/milesDriven;
    }
   
   
   // Accessor methods
   public void addThreeSeater(Three_Seater car) { cars.add(car); }
   public void addFiveSeater(Five_Seater car) { cars.add(car); }
   public void addLuxuryThreeSeater(Luxury_Three_Seater car) { cars.add(car); }
   public void addLuxuryFiveSeater(Luxury_Five_Seater car) { cars.add(car); }
   public double getFares() { return faresCollected; }
   public int getMilesDriven() { return milesDriven; }
   public String getVariables(){
      return (String) "Variables:\n\tAmount of Luxury Five Seaters: " + AmountOfLuxuryFiveSeaters + "\n\tAmount of Luxury Three Seaters: " + "\n\tAmount of Five Seater: " + AmountOfFiveSeaters + "\n\tAmount of Three Seaters: " + AmountOfLuxuryThreeSeaters + "\n\tAmount of Stations: " + AmountOfStations;
   }
   public String getResults(){
      double temp = Math.round(getRevenuePerMile()*100);
      temp /= 100;
      return (String)"Results after Simulation:\n\tFares Collected: " + faresCollected + "\n\tMiles Driven: " + milesDriven + "\n\tAverage revenue per mile: " + temp;
   }
   public  String getRate(){
      Car c = new Luxury_Five_Seater(0);
      Car c1 = new Luxury_Three_Seater(0);
      Car c2 = new Three_Seater(0);
      Car c3 = new Five_Seater(0);

      return (String) "Vehicle Rates:\n\tRate of Luxury Five Seater: " + c.getRate() + "\n\tRate of Luxury Three Seater: " + c1.getRate() + "\n\t Rate of Three Seater: " + c2.getRate() + "\n\t Rate of Five Seater: " + c3.getRate();
   }
   
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
