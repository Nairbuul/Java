public class Five_Seater extends Car{
    
    int PassengerCount;
    
    public Five_Seater(int current_station){
        setRate(rate + getRate());
        setMPG(24);
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
