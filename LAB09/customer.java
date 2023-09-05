import java.io.OutputStream;

public class customer{
    public String customer_name = new String();
    public double customer_value = 0;

    /**
     * Constructor that encapsulates a string and an integer.
     * @param name name
     * @param value value.
     */
    public customer(String name, double value){
        customer_name = name;
        customer_value = value;
    }

    /**
     * Prints the customer name and the amount of money they spent.
     */
    public String toString(){
        String temp = customer_name + " " + String.valueOf(customer_value);
        return temp;
    }
}