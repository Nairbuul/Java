import java.util.*;
public class DataCapsule {
    String array[];
    
    public DataCapsule(){
        array = new String[3];
    }

    public DataCapsule(String Name, String DOB, String DOD){
        array = new String[3];
        array[0] = Name;
        array[1] = DOB;
        array[2] = DOD;
    }   

    public String getColumn(int index){
        System.out.println(array[index]);
        return array[index];
    }

    public String toString(){
        return (String)array[0] + " " + array[1] + " " + array[2];
    }
}
