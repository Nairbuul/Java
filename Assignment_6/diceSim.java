import java.util.Random;

public class diceSim{
    private static int simulation_time = 1000000;
    private static int wins = 0;
    private static int losses = 0;

    /**
     * This method generates a random number, 1,000,000x (default value). And 
     * if it generates  two 6’s it’ll then record it as a win else it’ll be recorded as a loss. 
     */
    public static void simulation(){
        
        //dice 1 & 2
        int dice1;
        int dice2;

        //Random number generator
        Random r = new Random();

        //Loop that runs 1,000,000x and generates two random numbers.
        for(int i = 0; i < simulation_time; i++){
            dice1 = r.nextInt(1,7);
            dice2 = r.nextInt(1,7);
            if(dice1 == 6 && dice2 == 6){
                wins++;
            }
        }

        //Calculate our losses by subtracting the wins by the simulation_time.
        losses = simulation_time - wins;

        //Printing out the value.
        System.out.println("Wins: $" + wins + " Losses: -$" + losses + " Games: " + simulation_time);
    }
}