import java.util.*;
public class PostalBarCode{
    private int match[][];
    private int NumericBarCode;
    private String BarCode;
    private int postalCode[] = new int[6];
    
    /**
     * Default constructor that'll initialize the instance varialbes to default variables.
     */
    public PostalBarCode(){
        this.NumericBarCode = 0;
        this.BarCode = new String();
        this.match = new int [10][5];
        initialize2D();
    }

    /**
     * Constructor that'll initialize the bar code.
     * @param BarCode String representation of the bar code.
     */
    public PostalBarCode(String BarCode){
        this.BarCode = BarCode;
        this.match = new int [10][5];
        initialize2D();
    }

    /**
     * Constructor that'll initialzie the numeric version of the bar code.
     * @param NumericBarCode numeric representation of the bar code.
     */
    public PostalBarCode(int NumericBarCode){
        this.match = new int[10][5];
        this.BarCode = new String();
        this.NumericBarCode = NumericBarCode;
        initialize2D();
    }

    /**
     * 2D array that matches the string representation of the bar code to the numerical version and vice versa.
     */
    private void initialize2D(){
        markColumns(0, 1,1,0,0,0);
        markColumns(1, 0,0,0,1,1);
        markColumns(2, 0,0,1,0,1);
        markColumns(3, 0,0,1,1,0);
        markColumns(4, 0,1,0,0,1);
        markColumns(5, 0,1,0,1,0);
        markColumns(6, 0,1,1,0,0);
        markColumns(7, 0,1,1,0,0);
        markColumns(8, 1,0,0,0,1);
        markColumns(9, 1,0,1,0,0);
    }

    /**
     * Function that'll initialize the 2D array to the given parameters.
     * @param row the row is the representation of the numeric value of the string.
     * @param column7 the first bar is a representation of 7.
     * @param column4 the second bar is a representation of 4.
     * @param column2 the third bar is a representation of 2.
     * @param column1 the fourth bar is a representation of 1.
     * @param column0 the fifth bar is a representation of 0.
     */
    private void markColumns(int row, int column7, int column4, int column2, int column1, int column0){
        match[row][0] = column7;
        match[row][1] = column4;
        match[row][2] = column2;
        match[row][3] = column1;
        match[row][4] = column0;
    }

    /**
     * Integer array comparison.
     * @param c the first integer array that is going to be compared.
     * @param b the second integer array that is going to be compared.
     * @return true if they hold the same elements false if not.
     */
    private boolean comparison(int[] a, int[] b){
        for(int i = 0; i < 4; i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }

    /**
     * Method that'll match the String representation of the bar code to the numeric value of the bar code.
     * @param c String representation of the bar code.
     * @return Numeric value that matches the string representation of the bar code.
     */
    private int getValue(int[] c){
        for(int i = 0; i < 10; i++){
            int temp[] = match[i];
            if(comparison(c, temp)){
                return i;
            }
        }
        return 0;
    }

    /**
     * Method that'll store the in an array according to it's 10^nth place. 
     * Then it'll add all the digits together and append a value to make the total = to a multiple of 10.
     */
    private void getNth(){
        //Storing the 1st place of the the integer.
        postalCode[4] = NumericBarCode%10;       
        //Storing the 10th place of the the integer.
        postalCode[3] = (NumericBarCode%100)/10;
        //Storing the 100th place of the the integer.
        postalCode[2] = (NumericBarCode%1000)/100;
        //Storing the 1,000th place of the the integer.
        postalCode[1] = (NumericBarCode%10000)/1000;
        //Storing the 10,000th place of the the integer.
        postalCode[0] = NumericBarCode/10000;

        int temp = 0;
        for(int i = 0; i < 5; i++){
            temp += postalCode[i];
        }

        temp %= 10;
        temp = Math.abs(10-temp);
        postalCode[5] = temp;

    }

    /**
     * Method that'll turn the string representation of the bar code to a numeric value.
     * @return numeric value of the bar code.
     */
    public int PostalDecoder(){
        int j = 1;
        int temp[] = new int[5];
        for(int k = 0 ; k < 5; k++){
            for(int i = 0; i < 5; i++){
                if(BarCode.charAt(j) == '|'){
                    temp[i] = 1;
                }
                else{
                    temp[i] = 0;
                }
                j++;
            }

            int temp2 = getValue(temp);
            NumericBarCode += temp2;
            NumericBarCode *= 10;
            
            temp = new int[5];
        }

        NumericBarCode /= 10;
        return NumericBarCode;
    }
    
    /**
     * Method that'll turn the numeric value into the string representation of the bar code.
     * @return String representation of the bar code.
     */
    public String PostalEncoder(){
        BarCode += "|";

        getNth();
        
        //First loop to loop through the indicis of the integer. 
        //Ex.) 95014 --> 9 --> 5 --> 0 --> 1 --> 4
        for(int i = 0; i < 5; i++){
            //Second loop to match the array to the correct bar output.
            for(int j = 0; j < 5;j++){
                if(match[postalCode[i]][j] == 1){
                    BarCode += "|";
                }
                else{
                    BarCode += ":";
                }
            }
        }

        BarCode +=  "|";
        return BarCode;
    }

    /**
     * Method that'll convert the numeric value to a string representation of the bar code.
     * @param NumericBarCode Numeric value of bar code.
     * @return String representation of bar code.
     */
    public String PostalEncoder(int NumericBarCode){
        this.NumericBarCode = NumericBarCode;
        this.match = new int[10][5];
        initialize2D();
        return PostalEncoder();
    }

    /**
     * Method that'll convert the string representation of the bar code to a numeric value.
     * @param BarCode String representation of bar code.
     * @return Numeric value of bar code.
     */
    public int PostalDecoder(String BarCode){
        this.BarCode = BarCode;
        return PostalDecoder();
    }

    /**
     * Print function.
     */
    public String toString(){
        return (String) ("Bar Code Numeric: " + NumericBarCode +"\t\tBar Code Representation: ( " +  BarCode + " )");
    }

    //Weight = 7 4 2 1 0 
    // 9 = 7 0 2 0 0 
    // 9 = 1 0 1 0 0 
    //
}