import java.util.logging.Level;
import java.util.logging.Logger;
class RomanNumeral {
    public static void main(String args[]){
        Logger LOGGER = Logger.getGlobal();
        // LOGGER.getGlobal().setLevel(Level.OFF);
    }
    /**
     * Integer array that holds roman numeral values in enums.
     */
    private static int conv[] = {
        rnENUMS.I.getValue(),
        rnENUMS.IV.getValue(),
        rnENUMS.V.getValue(),
        rnENUMS.IX.getValue(),
        rnENUMS.X.getValue(),
        rnENUMS.XL.getValue(),
        rnENUMS.L.getValue(),
        rnENUMS.XC.getValue(),
        rnENUMS.C.getValue(),
        rnENUMS.CD.getValue(),
        rnENUMS.D.getValue(),
        rnENUMS.CM.getValue(),
        rnENUMS.M.getValue(),
    };
    
    /**
     * String array that'll return the appropriate roman numeral symbol according to its value.
     */
    private static String rNum[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

    public RomanNumeral(){};

    /**
     * Method that turns value into a roman numeral by subtraction.
     * @param value value that'll be converted into a roman numeral.
     */
    public static String convert(int value){
        Logger LOGGER = Logger.getGlobal();
        String romanNum = new String();
        int i = 12;
        while(i >= 0){

            if(value >= conv[i]){
                Logger.getGlobal().info("Value: " + Integer.toString(value) + " - " + rNum[i] + "(" + conv[i] + ")");
                value -= conv[i];
                romanNum += rNum[i];
            }
            else{
                i--;
            }
        }
        // System.out.println(romanNum);
        return romanNum;
    }
    
}
