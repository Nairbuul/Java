public class Three_Seater extends Car{
    
    int PassengerCount;

    public Three_Seater(int current_station){
        setCurrentStation(current_station);
        setMPG(28);
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
