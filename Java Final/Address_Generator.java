import java.util.Random;
import java.util.HashMap;

public class Address_Generator{
    private Random r = new Random();

    /**
     * Default CTOR
     */
    public Address_Generator(){}

    /**
     * Update seed
     * @param r new Random variable
     */
    public Address_Generator(Random r){
        this.r = r;
    }

    /**
     * Method that generates a zip
     * @return a ranodm zip
     */
    public String generateZip(){
        int Zip = r.nextInt(89999);
        Zip += 10000;
        return Integer.toString(Zip);
    }

    /**
     * Method that generates a StreetName
     * @return Street Name
     */
    public String generateAddress(){
        HashMap<Integer, String> street = new HashMap<>();
        street.put(0, "Boluevard");
        street.put(1, "Road");
        street.put(2, "Way");
        street.put(3, "Street");
        street.put(4, "Avenue");
        street.put(5, "Lane");
        street.put(6, "Terrace");
        street.put(7, "Place");
        street.put(8, "Court");

        int num = r.nextInt(30);
        if(num == 1 || num == 11 || num == 21){
            return (String) Integer.toString(num) + "st " + street.get(9);
        }
        else if(num == 2 || num == 12 || num == 22){
            return (String) Integer.toString(num) + "nd " + street.get(r.nextInt(9));
        }
        else if(num == 3 || num == 13 || num == 23){
            return (String) Integer.toString(num) + "rd " + street.get(r.nextInt(9));  
        }
        else{
            return (String) Integer.toString(num) + "th " + street.get(r.nextInt(9));
        }
    }

    /**
    * Method that'll return a city name according to the randomly generated number
    * @return City Name
    */
    public String generateCity(){
        HashMap<Integer, String> City = new HashMap<>();
        City.put(0, "Alpine");
        City.put(1, "Bonita");
        City.put(2, "Chula Vista");
        City.put(3, "Coronado");
        City.put(4, "Imperial Beach");
        City.put(5, "La Jolla");
        City.put(6, "La Mesa");
        City.put(7, "Oceanside");
        City.put(8, "El Cajon");
        City.put(9, "Del Mar");
        City.put(10, "Lakeside");

        return City.get(r.nextInt(10));
    }

    /**
     * Method that generates a cell phone number.
     * @return celly number
     */
    public String generateCell(){
        int Area_Code = r.nextInt(899) + 100;
        int PhoneNum1 = r.nextInt(899)+ 100;
        int PhoneNum2 = r.nextInt(8999) + 1000;

        String PhoneNumber = "(" + Area_Code + ") " + PhoneNum1 + "-" + PhoneNum2;
        return PhoneNumber;
    }

    /**
     * Method that'll return a cell/st name/city/ and zip
     * @return cell/st name/city/zip
     */
    public String generateAll(){
        return (String) generateCell() + "\t" + generateAddress() + "\t" + generateCity() + " " + generateZip();
    }

    /**
     * Method that'll generate a random first
     * @return First Name
     */
    public String generateFirstName(){
        HashMap<Integer, String> FirstNames = new HashMap<>();
        FirstNames.put(0, "James");
        FirstNames.put(1, "Robert");
        FirstNames.put(2, "John");
        FirstNames.put(3, "Micheal");
        FirstNames.put(4, "David");
        FirstNames.put(4, "David");
        FirstNames.put(5, "William");
        FirstNames.put(6, "Richard");
        FirstNames.put(7, "Joseph");
        FirstNames.put(8, "Thomas");
        FirstNames.put(9, "Charles");
        FirstNames.put(10, "Christopher");
        FirstNames.put(11, "Mary");
        FirstNames.put(12, "Jennifer");
        FirstNames.put(13, "Linda");
        FirstNames.put(14, "Elizabeth");
        FirstNames.put(15, "Barbara");
        FirstNames.put(16, "Susan");
        FirstNames.put(17, "Bianca");
        FirstNames.put(18, "Margaret");
        FirstNames.put(19, "Sandra");
        FirstNames.put(20, "Ashley");
        FirstNames.put(21, "Amanda");

        return FirstNames.get(r.nextInt(22));
    }

    /**
     * Generate Last name
     * @return last name
     */
    public String generateLastName(){
        HashMap<Integer, String> LastNames = new HashMap<>();
        LastNames.put(0, "Smith");
        LastNames.put(1, "Johnson");
        LastNames.put(2, "Williams");
        LastNames.put(3, "Brown");
        LastNames.put(4, "Jones");
        LastNames.put(5, "Garcia");
        LastNames.put(6, "Miller");
        LastNames.put(7, "Davis");
        LastNames.put(8, "Rodriguez");
        LastNames.put(9, "Wilson");
        LastNames.put(10, "Anderson");
        LastNames.put(11, "Thomas");
        LastNames.put(12, "Lee");
        LastNames.put(13, "Sanchez");
        LastNames.put(14, "White");
        LastNames.put(15, "Nguyen");
        LastNames.put(16, "Torres");
        LastNames.put(17, "Scott");
        LastNames.put(18, "Evans");
        LastNames.put(19, "Edwards");
        LastNames.put(20, "Collins");
        LastNames.put(21, "Stewart");

        return LastNames.get(r.nextInt(22));
    }

    /**
     * Full name
     * @return full name
     */
    public String generateFullName(){
        return (String) generateFirstName() + " " + generateLastName();
    }
}