import java.util.*;

public class driverSort implements Comparator<Driver>{
    public int compare(Driver a, Driver b){
        if(a.destination > b.destination)
            return 1;
        else if(a.destination < b.destination)
            return -1;
        else
            return 0;
    }
}
