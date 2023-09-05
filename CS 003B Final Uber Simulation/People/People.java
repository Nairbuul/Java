package People;
public class People{
    String FullName;
    String Address;             //Street Name, City, Zip
    String CellNumber;

    //Constructors
    public People(){
        this.FullName = new String();
        this.Address = new String();
        this.CellNumber = new String();
    }

    public People(String FullName, String Address, String CellNumber){
        this.FullName = FullName;
        this.Address = Address;
        this.CellNumber = CellNumber;
    }

    public People(String First_Name, String Last_Name, String Street_Name, String City, String Zip, String Cell){
        this.FullName = First_Name + " " + Last_Name;
        this.Address = Street_Name + " " + City + " " + Zip;
        this.CellNumber = Cell;
    }

    public People(String First_Name, String Last_Name, String Address, String Cell){
        this.FullName = First_Name + " " + Last_Name;
        this.Address = Address; 
        this.CellNumber = Cell;
    }

    public People(String FullName, String Street_Name, String City, String Zip, String Cell){
        this.FullName = FullName;
        this.Address = Street_Name + " " + City + " " + Zip;
        this.CellNumber = Cell;
    }

    //Accessors
    public String getName(){
        return FullName;
    }
    public String getAddress(){
        return Address;
    }
    public String getCellNumber(){
        return CellNumber;
    }

    //Mutators
    public void setName(String FullName){
        this.FullName = FullName;
    }
    public void setName(String First_Name, String Last_Name){
        this.FullName = First_Name + " " + Last_Name;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    public void setAddress(String Street_Name, String City, String Zip){
        this.Address = Street_Name + " " + City + " " + Zip;
    }
    public void setCell(String Cell){
        this.CellNumber = Cell;
    }
}