import java.util.*;

class passengerSort implements Comparator<Passenger> {
    public int compare(Passenger a, Passenger b){
        if(a.desired_station > b.desired_station)
            return 1;
        else if(a.desired_station < b.desired_station)
            return -1;
        else
            return 0;
    }
}
