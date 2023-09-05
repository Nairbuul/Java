// package Assignment_01_Chapter_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class P2_9_learning {
    //Pass by reference method #1 (workaround).
    // GregorianCalendar cal = new GregorianCalendar();
    // GregorianCalendar bday = new GregorianCalendar(1998,8,9);
    
    //Needed a proper comparison operator to check the date instead of the milisecond it was initialized
    static boolean GC_comparison(GregorianCalendar a, GregorianCalendar b){
        if(a.get(Calendar.DATE) == b.get(Calendar.DATE) && a.get(Calendar.YEAR) == b.get(Calendar.YEAR) && a.get(Calendar.MONTH) == b.get(Calendar.MONTH))
            return true;
        return false;
    }

    //Pass by reference #2 (workaround).
    //We create a today object because for some reason it does not like it when we ask for it's date...
    static GregorianCalendar date_addition(GregorianCalendar c, int number_of_days){
        GregorianCalendar today = new GregorianCalendar();
        
        //Checking to see if the object is initialzied to today's date...
        if(GC_comparison(today, c)){
            today.add(Calendar.DAY_OF_MONTH, number_of_days);
            return today;
        }
        else{
            c.add(c.get(Calendar.DATE), number_of_days);
            return c;
        }
    }
    public static void main(String args[]){
        System.out.println("\n======================================================================");
        //Initializing cal object with a default constructor [defualts to today's date] and printing it out.
        GregorianCalendar cal = new GregorianCalendar();                                    
        System.out.println("\tTodays date:\t\t\t\t" + cal.get(Calendar.YEAR) + "-" 
                            + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DATE));

        //Altering the object by adding 100 days.
        // cal.add(Calendar.DATE, 100);
        cal = date_addition(cal, 100);                                                      //Pass by reference #2 (workaround).
        System.out.println("\tDate 100 days from today:\t\t" +  cal.get(Calendar.YEAR) + "-" 
                            + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DATE));

        //Creating an obj that is initialized to my birthday.
        GregorianCalendar bday = new GregorianCalendar(1998, 8, 9);
        System.out.println("\tBirthday:\t\t\t\t" + bday.get(Calendar.YEAR) 
                            + "-" + bday.get(Calendar.MONTH) + "-" + bday.get(Calendar.DATE));

        //Printing out the weekday of my birthday.
        System.out.println("\tWeekday of my birthday: \t\t" + bday.get(Calendar.DAY_OF_WEEK));

        //Altering object to hold date 10,000 days away from my bday.
        // bday.add(bday.get(Calendar.DAY_OF_MONTH), 10000);
        bday = date_addition(bday, 10000);                                                  //Pass by reference #2 (workaround).
        System.out.println("\t10,000 Days ahead of my birthday:\t" + bday.get(Calendar.YEAR)
                           + "-" + bday.get(Calendar.MONTH) + "-" + bday.get(Calendar.DATE));

        System.out.println("\n======================================================================\n");
    }
}

//Programmer notes:
/* From book...
 * The GregorianCalender class describes a point in time, as measured by the Gregorian calendar,
 * the standard calendar that is commonly used throughout the world today. You construct a 
 * GregorianCalender object froma  year,month, and day of the month like this: 
 * GregorianCalendar today = new GregorianCalendar();                           This will create an object of today's date
 * GregorainCalender date = new GregorianCalendar(1919, Calendar.April, 9);     This will create an object of the specified date.
 * Use the values Calendar.January ... Calendar.December to specify the monthh.
 * The add method can be used to adda  number of days to a GreggorianCalendar object:
 * cal.add(Calendar.DAY_OF_MONTH, 10);                                          Now "today" is ten days from the actual date.
 * This is a mutator method-it changed the "today" object.
 * The get method can be used to query a given GregorianCalendar object:
 * int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
 * int month = cal.get(Calendar.MONTH);
 * int year = cal.get(Calendar.Year);
 * int weekday = cal.get(Calendar.DAY_OF_WEEK);                                 1 = Sunday, 2 = Monday... 7 = Saturday
 * Your task is to write  aprogram that prints:
 * - The date and weekday that is 100 days from today.
 * - The weekday of your birthday.
 * - The date that is 10,000 days from your birthday.
*/