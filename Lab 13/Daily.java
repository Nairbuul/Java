public class Daily extends  Appointment{
    

    /**
     * Onetime constructor to construct an appointment at a specific date once.
     * @param appointment Description of appointment
     */
    public Daily(String appointment){
        setDescription(appointment);
    }   

    /**
     * always return true.
     */
    public boolean occursOn(int year, int month, int day){
        return true;
    }
}
