public class RoachPopulation{
    private static int _population;
    
    /**
    This constructs a default object for the roach population if no set population is given
    */
    public RoachPopulation(){
        _population = 0;
    }
 
    /**
    This constructs an object that holds the population of the roaches.
    @param population sets the local population to the given variable
    */
    public RoachPopulation(int population){
        _population = population;
    }
    
    /**
    This alters the instance variable.  (Increases it by 2x)
    */
    public void breed(){
        _population = _population*2;
    }

    /**
    This alters the instance variable. (Decreases it by percent)
    @param percent the percentage the population is being reduced by.
    */
    public void spray(double percent){
        double temp = ((double)_population)*percent;
        _population = _population - (int)temp;
    }

    /**
    This is an accessor function that tells us what the size of the roach pop is in the object.
    @return the number of roaches
    */
    public int getRoaches(){
        return _population;
    }

    /**
    Sets the population of the roaches
    @param population variable which dictates the new population of roaches
    */
    public void setPopulation(int population){
        _population = population;
    }

}