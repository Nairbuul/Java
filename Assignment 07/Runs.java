import java.util.Random;

public class Runs{
    protected static int Rolls[] = new int[20];
    protected static Random r = new Random();
    protected static int array_size = 20;
    
    /**
     * Only public function of this class that calls the initialization
     * of the array and prints it with the inclusions of runs.
     */
    public static void simulate(){
        initialize_array();
        print();
    }

    /**
     * Fills the array with randomly generated numbers.
     */
    protected static void initialize_array(){
        for(int i = 0; i < array_size; i++){
            Rolls[i] = r.nextInt(0,10);

            // testcases
            // if(i > 10)
            //     Rolls[i] = 2;
            // else
            //     Rolls[i] = r.nextInt(0,10);
        }
    }

    /**
     * Output method that adds parantheses to showcase all the runs in the array.
     */
    protected static void print(){
        //This boolean is a marks the beginning and end of a run.
        boolean runs = false;

        //Loop through 19 indexes becaues we're checking 1 ahead
        for(int i = 0; i < array_size-1; i++){
            //Check for the start of the runs
            if(check(Rolls[i], Rolls[i+1]) && !runs){
                System.out.print("(" + Rolls[i] + " ");
                runs = true;
            }
            //Check for the end of the runs
            else if(runs && !check(Rolls[i], Rolls[i+1])){
                System.out.print(Rolls[i] + ") ");
                runs = false;
            }
            //If no runs just print number.
            else{System.out.print(Rolls[i] + " ");}
        }
        //We now need to print last number
        System.out.print(Rolls[array_size-1]);
        //If the runs hasnt ended yet we'll print the last paran after
        //the last number.
        if(runs != false){
            System.out.print(")");
        }
        System.out.println();
    }

    /**
     * Compairson to check if the array[i] == array[i+1]
     */
    protected static boolean check(int one, int two){
        if(one == two){
            return true;
        }
        return false;
    }
}