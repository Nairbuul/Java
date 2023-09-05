public class Video_club {
    
    private int movieRentals;
    private int Recomendees;
    public final double maxDiscount = 75.00;
    
    /**
     * Default constructor
     */
    public Video_club(){
        movieRentals = 0;
        Recomendees = 0;
    }

    /**
     * Double arg constructor to initialize # of movie rentals and # of people recomended to video club.
     * @param numOfMovieRentals number of movie rentals
     * @param numOfReferredMembers number of referred members
     */
    public Video_club(int numOfMovieRentals, int numOfReferredMembers){
        movieRentals = numOfMovieRentals;
        Recomendees = numOfReferredMembers;
    }

    /**
     * Function that calculates and returns discount
     * @return discount
     */
    public double getDiscount(){
        double discount = (double)movieRentals + (double)Recomendees;
        return Math.min(discount,maxDiscount);
    }

    /**
     * Mutator function to update number of movie rentals
     * @param numberOfRentals number of movie rentals
     */
    public void setMovieRentals(int numberOfRentals){
        movieRentals = numberOfRentals;
    }

    /**
     * Mutator function to update number of people recomended.
     * @param numberOfRecomendees number of people recomended.
     */
    public void setRecomendees(int numberOfRecomendees){
        Recomendees = numberOfRecomendees;
    }
}
