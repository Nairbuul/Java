import java.util.Comparator;
import java.util.*;

public class sorter implements Comparator<customer>{
    public int compare(customer a, customer b){
        double dif = a.customer_value - b.customer_value;
        if(dif > 0) return -1;                          //swap line 7/8 for ascending order.
        if(dif < 0) return 1;
        return 0;
    }
}


/*
 * Got this class and method from 
 * https://www.geeksforgeeks.org/collections-sort-java-examples/ 
 *                  &&
 * https://stackoverflow.com/questions/30193275/comparator-return-type-is-not-compatible-with-integer
 * I'm not too familiar with how the compartor works but it seems like it it works similar to assemblys
 * jz operand. 
 * 
 * From observation it looks like if the left operand is greater then the right we use 1 to indicate greater.
 *                                                       less then the right we use -1 to indicate less.
 *                                                       equal to the right then we use 0 to indicate equal.
 * 
 * What I ended up doing was inverting the greater and less then in order to organize the array list in 
 * descending order.
 */