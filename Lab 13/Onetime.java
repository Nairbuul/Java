public class Onetime extends Appointment{

    //Instance variables
    int year,month,day;
    
    /**
     * Onetime constructor to construct an appointment at a specific date once.
     * @param year year of appointment
     * @param month month of appointment
     * @param day day of appointment
     * @param appointment Description of appointment
     */
    public Onetime(int year, int month, int day, String appointment){
        this.year = year;
        this.month = month;
        this.day = day;
        setDescription(appointment);
    }
    
    /**
     * check to see if the appointment matches the given date.
     * @param year year of appointment
     * @param month month of appointment
     * @param day day of appointment
     * @return true if the year,month,day matches the appointment time.
     */
    public boolean occursOn(int year, int month, int day){
        if(this.year != year || this.month != month || this.day != day){
            return false;
        }
        
        return true;
    }
}
