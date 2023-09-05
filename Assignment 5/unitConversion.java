import java.util.Arrays;
import java.util.HashSet;
class unitConversion{

    public static final String volumetricUnits[] = {"fl oz", "gallon", "cubic foot", "cup", "liter", "milliliter", "tablespoon", "teaspoon", "quart"};
    public static final String massUnits[] = {"gram", "ton", "metric ton", "lb", "stone"};
    public static final String distanceUnits[] = {"millimeter", "meter", "centimeter", "inch", "feet", "yard", "mile"};
    private static final HashSet<String> hashVol = new HashSet<String>(Arrays.asList(volumetricUnits));
    private static final HashSet<String> hashMass = new HashSet<String>(Arrays.asList(massUnits));
    private static final HashSet<String> hashDist = new HashSet<String>(Arrays.asList(distanceUnits));

    /**
     * Method that converts all the valid units to lbs
     * @param value value of the unit
     * @param valuesUnit the units specifier
     * @return conversion of unit to lbs
     */
    private static double toLB(double value, String valuesUnit){
        switch(valuesUnit){
            case "gram":{
                return value * 0.00220462;
            }
            case "ton":{
                return value * 2000;
            }
            case "metric ton":{
                return value * 2204.62;
            }
            case "stone":{
                return value * 14;
            }
            default: {
                System.out.println("ERROR  toLB");
                System.exit(0);
                return 0;
            }
        }
    }
    /**
     * Method that converts lbs into different mass units
     * @param value value in lbs
     * @param valuesUnit the wanted conversion
     * @return value in the wanted conversion.
     */
    private static double LBto(double value, String valuesUnit){
        switch(valuesUnit){
            case "gram":{
                return value * 453.592;
            }
            case "ton":{
                return value * 0.0005;
            }
            case "metric ton":{
                return value * 0.000453592;
            }
            case "lb":{
                return value;
            }
            case "stone":{
                return value * 0.0714286;
            }
            default: {
                System.out.println("ERROR  LBto");
                System.exit(0);
                return 0;
            }
        }
    }
    /**
     * Method that converts all valid units to to liters
     * @param value value of the unit
     * @param valuesUnit the units specifier
     * @return conversion of unit to liters
     */
    private static double toLiter(double value, String valuesUnit){
        switch(valuesUnit){
            case "fl oz":{
                return value * 0.0295735;
            }
            case "gallon":{
                return value * 3.78541;
            }
            case "cubic foot":{
                return value * 28.3168;
            }
            case "cup":{
                return value * 0.24;
            }
            case "milliliter":{
                return value * 0.001;
            }
            case "teaspoon":{
                return value * 0.00492892;
            }
            case "tablespoon":{
                return value * 0.0147868;
            }
            case "quart":{
                return value * 0.946353;
            }
            default:{
                System.out.println("ERROR  toLITER");
                System.exit(0);
                return 0;
            }
        }
    }  
    /**
     * Method that converts liter to different volumetric units
     * @param value value in ltrs
     * @param valuesUnit the unit we want to convert into
     * @return value in the wanted conversion.
     */
    private static double Literto(double value, String valuesUnit){
        switch(valuesUnit){
            case "fl oz":{
                return value * 33.814;
            }
            case "gallon":{
                return value * 0.264172;
            }
            case "cubic foot":{
                return value * 0.0353147;
            }
            case "cup":{
                return value * 4.16667;
            }
            case "milliliter":{
                return value * 1000;
            }
            case"liter":{
                return value;
            }
            case "teaspoon":{
                return value * 202.884;
            }
            case "tablespoon":{
                return value * 67.628;
            }
            case "quart":{
                return value * 1.05669;
            }
            default:{
                System.out.println("ERROR  LiterTO");
                System.exit(0);
                return 0;
            }
        }
    }
    /**
     * Method that converts all valid units to inches
     * @param value value of the unit
     * @param valueUnit the units specifier
     * @return conversion of unit to inches.
     */
    private static double toIn(double value, String valueUnit){
        switch(valueUnit){
            case "millimeter":{
                return value * 25.4;
            }
            case "meter":{
                return value * 0.0254;
            }
            case "centimeter":{
                return value * 2.54;
            }
            case "feet":{
                return value * 0.0833333;
            }
            case "yard":{
                return value * 0.0277778;
            }
            case "mile":{
                return (value * 1.5783)/100000;
            }
            default:{
                System.out.println("ERROR  Into");
                System.exit(0);
                return 0;
            }
        }
    }
    /**
     * Method that converts inches to specified unit
     * @param value value in inches
     * @param valueUnit specified unit
     * @return value in specified unit
     */
    private static double Into(double value, String valueUnit){
        switch(valueUnit){
            case "millimeter":{
                return value * 0.0393701;
            }
            case "meter":{
                return value * 39.3701;
            }
            case "centimeter":{
                return value * 0.393701;
            }
            case "inch":{
                return value;
            }
            case "feet":{
                return value * 12;
            }
            case "yard":{
                return value * 36;
            }
            case "mile":{
                return value * 63360;
            }
            default:{
                System.out.println("ERROR  ToIn");
                System.exit(0);
                return 0;
            }
        }
    }
    /**
     * Check to see that both the units given are valid.
     * @param unit1 unit1
     * @param unit2 unit2
     * @return true/false depending on if the units given are compatible.
     */
    private static boolean volCheck(String unit1, String unit2){
        if(hashVol.contains(unit1) && hashVol.contains(unit2)){
            return true;
        }
        return false;
    }
    /**
     * Check to see that the units given are valid. 
     * @param unit1 unit1
     * @param unit2 unit2
     * @return true/false depending on if the units given are compatible.
     */
    private static boolean massCheck(String unit1, String unit2){
        if(hashMass.contains(unit1) && hashMass.contains(unit2)){
            return true;
        }
        return false;
    }
    /**
     * Check to see that the units given are valid.
     * @param unit1 unit1
     * @param unit2 unit2
     * @return true/false depending on if the units given are compatible.
     */
    private static boolean distCheck(String unit1, String unit2){
        if(hashDist.contains(unit1) && hashDist.contains(unit2)){
            return true;
        }
        return false;
    }
    /**
     * Method that calls conversions.
     * @param value value of unit1
     * @param unit1 original unit
     * @param unit2 unit to convert to
     * @return value of converted unit
     */
    private static double convertDist(double value, String unit1, String unit2){
        if(unit1.equals(distanceUnits[3])){
            return toIn(value, unit2);
        }
        else{
            double in = toIn(value, unit1);
            return Into(in, unit2);
        }
    }
    /**
     * Method that calls conversions.
     * @param value value of unit1
     * @param unit1 original unit
     * @param unit2 unit to convert to
     * @return value of converted unit
     */
    private static double convertMass(double value, String unit1, String unit2){
        if(unit1.equals(massUnits[3])){
            return LBto(value,unit2);
        }
        else{
            double lb = toLB(value, unit1);
            return LBto(lb, unit2);
        }
    }
    /**
     * Method that calls conversions.
     * @param value value of unit1
     * @param unit1 original unit
     * @param unit2 unit to convert to
     * @return value of converted unit
     */
    private static double convertVol(double value, String unit1, String unit2){
        if(unit1.equals(volumetricUnits[4])){
            return Literto(value, unit2);
        }
        else{
            double liter = toLiter(value, unit1);
            return Literto(liter, unit2);
        }
    }
    /**
     * Method that calls checks and conversions.
     * @param value value of unit1
     * @param unit1 original unit
     * @param unit2 unit to conver to 
     * @return value of converted unit.
     */
    public static double convert(double value, String unit1, String unit2){

        if(massCheck(unit1.toLowerCase(), unit2.toLowerCase())){
            return convertMass(value, unit1.toLowerCase(), unit2.toLowerCase());
        }
        else if(distCheck(unit1.toLowerCase(), unit2.toLowerCase())){
            return convertDist(value, unit1.toLowerCase(), unit2.toLowerCase());
        }
        else if(volCheck(unit1.toLowerCase(), unit2.toLowerCase())){
            return convertVol(value, unit1.toLowerCase(), unit2.toLowerCase());
        }
        else{
            System.out.println("Invalid conversion");
            return 0.0;
        }
    }
}