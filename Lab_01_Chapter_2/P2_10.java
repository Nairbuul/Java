/*
 * Programming Project 2.7:
 * Using the Day class of Worked Example 2.1, write a program that generates a Day object representing 
 * February 28 of this year, and three more such objects that repre- sent February 28 of the next three 
 * years. Advance each object by one day, and print each object. Also print the expected values:
 * 2016-02-29
 * Expected: 2016-02-29 2017-03-01
 * Expected: 2017-03-01 .. .
 */

 /*
  * Programming Project 2.9:
  * In Java 8, the LocalDate class describes a calendar date that does not depend on a location or time zone. You construct a date like this:
  * LocalDate today = LocalDate.now(); // Today’s date LocalDate eckertsBirthday = LocalDate(1919, 4, 9);
  * The plusDays method can be used to add a number of days to a LocalDate object: LocalDate later = today.plusDays(10); // Ten days from today
  * This method does not mutate the today object, but it returns a new object that is a given number of days away from today.
  * To get the year of a day, call
  * int year = today.getYear();
  * To get the weekday of a LocalDate, call
  * String weekday = today.getDayOfWeek().toString();
  * Your task is to write a program that prints 
  * - The weekday of “Pi day”, that is, March 14, of the current year.
  * - The date and weekday of “Programmer’s day” in the current year; that is,
  *   the 256th day of the year. (The number 256, or 28, is useful for some programming tasks.)
  * - The date and weekday of the date that is 10,000 days earlier than today.
  */
import java.util.*;
import java.time.LocalDate;
// import java.util.Local

public class P2_10{
    public static void main(String[] args){
       
        //2.10:  
        //January - 19 - 2023.
        LocalDate today= LocalDate.now();
        
        //Pi day is march 14.
        LocalDate piDay = LocalDate.of(2023,3,14);
        System.out.println("Pi day thhis year: " + piDay);
        String weekday = piDay.getDayOfWeek().toString();
        int year = piDay.getYear();
        System.out.println("Weekday of Pi Day: " + weekday + " " + year);
        
        //Programmers day.
        LocalDate temp = LocalDate.of(2023,1,1);
        LocalDate programmersDay = temp.plusDays(256-1);
        System.out.println("Programmers Day: " + programmersDay);
        String pDweekday = programmersDay.getDayOfWeek().toString();
        System.out.println("Programmers Day Weekday: " + pDweekday);
        
        //10,000 days earlier.
        LocalDate earlier = today.plusDays(-10000);
        System.out.println("10,000 days earlier: " + earlier);
        
    }   
}
