
import java.util.Calendar;
import java.util.GregorianCalendar;

public class P2_9_TEST {
    public static void main(String args[]){
        //Formating for easier readability.
        P2_9_UTILS.line();

        //Initializing G.C. obj to today's date.
        GregorianCalendar cal = new GregorianCalendar();
        System.out.print("\tTodays date:" + P2_9_UTILS.setwidth(4)); 
        P2_9_UTILS.GC_print(cal);
        
        //Altering the object to hold the date 100 days from now.
        cal = P2_9_UTILS.GC_date_addition(cal,100);
        System.out.print("\tDate 100 days from today:" + P2_9_UTILS.setwidth(2));
        P2_9_UTILS.GC_print(cal);
 
        //Creating an obj that is initialized to my birthday.
        GregorianCalendar bday = new GregorianCalendar(1998, 8, 9);
        System.out.print("\tBirthday:" + P2_9_UTILS.setwidth(4));
        P2_9_UTILS.GC_print(bday);

        
        //Printing out the weekday of my birthday.
        System.out.print("\tWeekday of my birthday: " + P2_9_UTILS.setwidth(2));
        P2_9_UTILS.GC_weekday(bday);

        //Altering object to hold date 10,000 days away from my bday.
        // bday.add(bday.get(Calendar.DAY_OF_MONTH), 10000);
        bday = P2_9_UTILS.GC_date_addition(bday, 363);                                           //Pass by reference #2 (workaround).
        System.out.print("\t10,000 Days ahead of my birthday:" + P2_9_UTILS.setwidth(1));
        P2_9_UTILS.GC_print(bday);

        //Formating for easier readability
        P2_9_UTILS.line();
    }
}
