package Station;
public class Station {
    private static int StationID = 0001;
    int Station_ID;
    String Address;

    public Station(String Address){
        StationID++;
        this.Station_ID = StationID;
        this.Address = Address;
    }
}
