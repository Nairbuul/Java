import java.util.*;
class PassengerSorter implements Comparator<Passenger>{

    
    public int compare(Passenger a, Passenger b){
        if(a.range > b.range)
            return -1;
        else if(a.range < b.range)
            return 1;
        else 
            return 0;
    }
}