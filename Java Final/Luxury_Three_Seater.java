public class Luxury_Three_Seater extends Car{

    int PassengerCount;

    public Luxury_Three_Seater(int current_station){
        setRate(getRate() * 5);
        setMPG(18);
        setCurrentStation(current_station);
    }

    public boolean hasroom(){
        PassengerCount = getAmountOfPassengers();
        if(PassengerCount >= 3){
            return false;
        }
        else{
            return true;
        }
    }
    
}
