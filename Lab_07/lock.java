import java.util.Random;
/**
 * Cody Toeung
 * Brian Luu
 * Lock class that has 4 rings numbered (1-4)
 * [0][0][0][0]
 * We can rotate up to increment a ring
 * We can rotate down to decrement a ring.
 */
public class lock {
    //Default values
    private String combinationKey = new String(); 
    private String initialCombination = new String();

    /*
     * Default constructor.
     */
    public lock(){
        Random r = new Random();
        combinationKey = "5714";
        setInitialCombination(r.nextInt(1000,10000));
    }

    /**
     * Sets the initial combination and key.
     * @param _initialCombination the combination currently displayed on the lock.
     * @param desiredCombination the combination required to unlock the lock.
     */
    public lock(int _initialCombination, int desiredCombination){
        initialCombination = Integer.toString(_initialCombination);
        combinationKey = Integer.toString(desiredCombination);
    }

    /**
     * Mutator method  to set the combination key.
     * @param combination combination key
     */
    public void setCombinationKey(int combination){
        combinationKey = Integer.toString(combination);
    }

    /**
     * Mutator method to set the combo shown on the lock.
     * @param combination Method to set the combo on the lock.
     */
    public void setInitialCombination(int combination){
        initialCombination =  Integer.toString(combination);
    }

    /**
     * Rotates the ring upwards 
     * @param times amount of time that we rotate.
     * @param ring ring that we're rotating.
     */
    public void rotateUp(int ringNum, int times){
        //Idea is that if it rotates more then 10x it'll complete one rotation. So % 10 returns us the remainder of whatever # given
        if(times >= 10){
            times %= 10;
        }

        //-1 since ringNum ranges from 1-4 and index ranges from 0-3
        ringNum-=1;

        //Converting string into integer.
        int ring = Character.getNumericValue(initialCombination.charAt(ringNum));
        ring += times;

        //Complete rotation.
        if(ring >= 10){
            ring -= 10;
        }

        //Replacing the character with the updated number.
        initialCombination  = initialCombination.substring(0, ringNum) + Integer.toString(ring) + initialCombination.substring(ringNum+1);
    }

    /**
     * Rotates all the rings up by one.
     */
    public void rotateUpAll(){
        for(int i = 1 ; i < 5; i++){
            rotateUp(i,1);
        }
    }

    /**
     * Rotates the ring down 
     * @param times amount of time that we rotate.
     * @param ring ring that we're rotating.
     */
    public void rotateDown(int ringNum, int times){
        //Idea is that if it rotates more then 10x it'll complete one rotation. So % 10 returns us the remainder of whatever # given
        if(times >= 10){
            times %= 10;
        }

        //-1 since ringNum ranges from 1-4 and index ranges from 0-3
        ringNum-=1;

        //Converting string into integer.
        int ring = Character.getNumericValue(initialCombination.charAt(ringNum));
        ring -= times;
       
        //Negative checks.
        if(ring < 0){
            ring += 10;
        }

        //Complete rotation.
        if(ring >= 10){
            ring -= 10;
        }

        //Replacing the character with the updated number.
        initialCombination  = initialCombination.substring(0, ringNum) + Integer.toString(ring) + initialCombination.substring(ringNum+1);
    }

    /**
     * Rotates all the rings down by one.
     */
    public void rotateDownAll(){
        for(int i = 1 ; i < 5; i++){
            rotateDown(i,1);
        }
    }

    /**
     * Method that computes the (X) rotation at (X) ring (X) amount of times.
     * @param direction rotates the ring up or down.
     * @param ring the ring number.
     * @param times the amount of rotation.
     */
    public void instructions(String direction, int ring, int times){
        if(!direction.toLowerCase().equals("down") && !direction.toLowerCase().equals("up")){
            System.out.println("Directional error.");
        }

        if(direction.toLowerCase().equals("down")){
            rotateDown(ring,times);
        }
        else{
            rotateUp(ring, times);
        }

        System.out.println("Rotated ring " + ring + " " + direction.toLowerCase() + " " + times +"x" + "\tCurrent Combination: (" + initialCombination + ")");
    }

    /**
     * Method to check if the initialCombination matches the combination key.
     */
    public void unlock(){
        if(combinationKey.equals(initialCombination)){
            System.out.println("Current Combination: " + initialCombination  + "\tCombination Key: " + combinationKey);
            System.out.println("Unlocked. ");
        }
        else{
            System.out.println("Current Combination: " + initialCombination  + "\tCombination Key: " + combinationKey);
            System.out.println("Locked. ");
        }
    }

    /**
     * returns currentCombination
     * @return the current Combination
     */
    public String getCurrentCombination(){
        return initialCombination;
    }

    /**
     * returns the combination key
     * @return the combination key.
     */
    public String getCombinationKey(){
        return combinationKey;
    }

    /**
     * Method that checks if the current Combination matches the combination key.
     * @return true/false
     */
    public boolean locked(){
        if(initialCombination.equals(combinationKey)){
            return false;
        }
        return true;
    }

    /**
     * outputs the current combination and the combination key and checks if it's unlocked or locked.
     */
    public void print(){
        System.out.println();
        unlock();
        System.out.println();
    }
}