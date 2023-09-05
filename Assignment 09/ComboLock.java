import java.util.*;
public class ComboLock{
    ArrayList<Integer> combination;
    ArrayList<Integer> current;
    boolean unlocked;
    int dial;
    
    public ComboLock(int secret1, int secret2, int secret3){
        this.combination = new ArrayList<Integer>();
        this.current = new ArrayList<Integer>();
        this.unlocked = false;
        this.dial = 0;

        combination.add(secret1);
        combination.add(-secret2);
        combination.add(secret3);

        current.add(0);
        current.add(0);
        current.add(0);
    }

    public void reset(){
        dial = 0;
    }

    public void turnLeft(int ticks){
        dial -= ticks;
        if(dial < -39)
            dial += 39;
        if(current.size() == 3){
            current.remove(0);
        }
        current.add(dial);
    }

    public void turnRight(int ticks){
        dial += ticks;
        if(dial > 39)
            dial -= 39;
        if(current.size() == 3){
            current.remove(0);
        }
        current.add(dial);
    }

    public boolean open(){
        unlocked = combination.equals(current);
        return unlocked;
    }

    public String toString(){
        String temp = ("Current Combination: " + current + "\tKey: " + combination + "\tUnlocked: " + open());
        return temp;
    }
}