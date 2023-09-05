package People;
public class Passenger extends People{
    int Destination;
    int Current_Location;
    
    //Constructors
    public Passenger(String FullName, String Address, String CellNumber, int Destination, int Current_Location){
        setName(FullName);
        setAddress(Address);
        setCell(CellNumber);
        this.Destination = Destination;
        this.Current_Location = Current_Location;
    }

    public Passenger(String First_Name, String Last_Name, String Street_Name, String City, String Zip, String Cell, int Destination, int Current_Location){
        setName((First_Name + " " + Last_Name));
        setAddress((Street_Name + " " + City + " " + Zip));
        setCell(Cell);
        this.Destination = Destination;
        this.Current_Location = Current_Location;
    }
    
    public Passenger(String First_Name, String Last_Name, String Address, String Cell, int Destination, int Current_Location){
        setName((First_Name + " " + Last_Name));
        setAddress(Address);
        setCell(Cell);
        this.Destination = Destination;
        this.Current_Location = Current_Location;
    }
    
    public Passenger(String FullName, String Street_Name, String City, String Zip, String Cell, int Destination, int Current_Location){
        setName(FullName);
        setAddress((Street_Name + " " + City + " " + Zip));
        setCell(Cell);
        this.Destination = Destination;
        this.Current_Location = Current_Location;
    }

    //Accessor 
    public int getDestination(){
        return Destination;
    }
    public int getCurrentLocation(){
        return Current_Location;
    }

    //Mutator 
    public void setDestination(int Destination){
        this.Destination = Destination;
    }
    public void setCurrentLocation(int Current_Location){
        this.Current_Location = Current_Location;
    }

}
