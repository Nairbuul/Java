package Car;
import java.util.ArrayList;
import People.People;
import People.Passenger;
public class Three_Seater extends Car{
    ArrayList<People> passengers;

    public Three_Seater(){
        passengers = new ArrayList<People>(3);
    }

    public void DropOff(Passenger p){
        // passengers.
    }

    public boolean hasArrived(){
        return false;
    }
}
