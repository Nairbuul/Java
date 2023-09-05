import java.util.*;
class CarSorter implements Comparator<Car>{
    public int compare(Car a, Car b){
        if(a.range > b.range)
            return -1;
        else if(a.range < b.range)
            return 1;
        else 
            return 0;
    }
}