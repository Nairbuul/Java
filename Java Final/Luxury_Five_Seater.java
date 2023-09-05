public class Luxury_Five_Seater extends Car {
    
    int PassengerCount;

    public Luxury_Five_Seater(int current_station){
        setRate(getRate() * 10);
        setMPG(13);
        setCurrentStation(current_station);
    }

    public boolean hasroom(){
        PassengerCount = getAmountOfPassengers();
        if(PassengerCount >= 5){
            return false;
        }
        else{
            return true;
        }
    }

}
