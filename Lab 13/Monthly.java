public class Monthly extends Appointment{
    
    int month;


    /**
     * Onetime constructor to construct an appointment at a specific date once.
     * @param month month of appointment
     * @param appointment Description of appointment
     */
    public Monthly(int month, String appointment){
        this.month = month;
        setDescription(appointment);
    }
    

    /**
     * check to see if the appointment matches the given month
     * @param year year of appointment
     * @param month month of appointment
     * @param day day of appointment
     * @return true if the year,month,day matches the appointment time.
     */
    public boolean occursOn(int year, int month, int day){
        if(this.month != month){
            return false;
        }
        
        return true;
    }
}