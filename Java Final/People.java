public class People {
    String FullName;
    String Address;
    String Zip;
    String CellNumber;

    public People(){}

    public People(String FullName, String Address, String Zip, String CellNumber){
        this.FullName = FullName;
        this.Address = Address;
        this.Zip = Zip;
        this.CellNumber = CellNumber;
    }

    public void setName(String FullName){
        this.FullName = FullName;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public void setZip(String Zip){
        this.Zip = Zip;
    }

    public void setCell(String CellNumber){
        this.CellNumber = CellNumber;
    }
}
