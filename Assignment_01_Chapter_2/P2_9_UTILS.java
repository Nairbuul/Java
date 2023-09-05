// package Assignment_01_Chapter_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class P2_9_UTILS {
    //Needed a proper comparison operator to check the date instead of the milisecond it was initialized
    //Comparison without overloading.
    static boolean GC_comparison(GregorianCalendar a, GregorianCalendar b){
        if(a.get(Calendar.DATE) == b.get(Calendar.DATE) && a.get(Calendar.YEAR) == b.get(Calendar.YEAR) && a.get(Calendar.MONTH) == b.get(Calendar.MONTH))
            return true;
        return false;
    }

    //Pass by reference #2 (workaround).
    //We create a today object because for some reason it does not like it when we ask for it's date...
    //Mutator function.
    static GregorianCalendar GC_date_addition(GregorianCalendar c, int number_of_days){
        GregorianCalendar today = new GregorianCalendar();
        
        //Checking to see if the object is initialzied to today's date...
        if(GC_comparison(today, c)){
            today.add(Calendar.DAY_OF_MONTH, number_of_days);
            return today;
        }
        else{
            c.add(c.get(Calendar.DAY_OF_MONTH), number_of_days);
            return c;
        }
    }

    //Print function that prints the date.
    static void GC_print(GregorianCalendar c){
        System.out.println(c.get(Calendar.YEAR) + "-" + c.get(Calendar.DATE) + "-" + c.get(Calendar.MONTH));
    }

    //Function that returns the weekday as an integer and string.
    static void GC_weekday(GregorianCalendar c){
        switch(c.get(Calendar.DAY_OF_WEEK)){
            case 1:{
                System.out.println(c.get(Calendar.DAY_OF_WEEK) + ":[Sunday]");
                break;
            }
            case 2:{
                System.out.println(c.get(Calendar.DAY_OF_WEEK) + ":[Monday]");
                break;
            }
            case 3:{
                System.out.println(c.get(Calendar.DAY_OF_WEEK) + ":[Tuesday]");
                break;
            }
            case 4:{
                System.out.println(c.get(Calendar.DAY_OF_WEEK) + ":[Wednesday]");
                break;
            }
            case 5:{
                System.out.println(c.get(Calendar.DAY_OF_WEEK) + ":[Thursday]");
                break;
            }
            case 6:{
                System.out.println(c.get(Calendar.DAY_OF_WEEK) + ":[Friday]");
                break;
            }
            case 7:{
                System.out.println(c.get(Calendar.DAY_OF_WEEK) + ":[Saturday]");
                break;
            }
        }
    }

    //Formating to easier differentiate start and end of code.
    static void line(){
        System.out.println("\n======================================================================");
    }

    //Formating to space apart code.
    static String setwidth(int x){
        String width = new String();
        for(int i = 0; i < x; i++){
            width = width.concat("\t");
        }
        return width;
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