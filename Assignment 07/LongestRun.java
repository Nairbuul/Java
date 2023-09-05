//subclass of runs so we'll use runs array/initialize array/& print method.
public class LongestRun extends Runs{
    
    /**
     * Similar to runs simulate where it calls a function to initialize array
     * and print except this one only print's theh first run if they're all the same
     * size or the longest run.
     */
    public static void simulate(){
        Runs.initialize_array();
        get_longestRun();
    }

    /**
     * This method grabs the indexes of all the runs and then calls print on the longest
     * indexed saved.
     */
    private static void get_longestRun(){
        //Function variables.
        boolean debug = true;               //Turn this to true if you want to see all the runs inside the array.
        boolean runsCheck = false;
        int a = 0;
        int b = 0;
        int length = 0;
        int a_save = 0;
        int b_save = 0;

        //Only loops 1 less then the array size because we're checking an element ahead of the array.
        for(int i = 0; i < array_size-1; i++){
            if(!runsCheck && check(Rolls[i], Rolls[i+1])){
                runsCheck = true;
                a = i;
                b = i;
            }
            else if(runsCheck && !check(Rolls[i], Rolls[i+1])){
                runsCheck = false;
                b = i;
            }
            //This ensures it so it wont update if the next run is also the same size.
            if(length < b-a){
                a_save = a;
                b_save = b;
                length = b_save - a_save;
            }
        }
        //This is a check in case thhe end of the run is the last element of the array.
        if(b == a && a != 0){
            b = array_size;
        }
        if(debug){
            print();
        }

        //If there is no run then we'll just call thhe run function print.
        if(a == 0 && b == a){
            print();
        }
        //If there is a run we'll give it an index to input thhe paran
        else
            print_longest(a_save, b_save);
    }

    /**
     * Simple print method that adds a parantheses before the starting index
     * specified and after the ending index specified.
     * @param starting_index put a paranthese here to clarify the start of the run
     * @param ending_index put a paranthese here to clarify the end of the run. 
     */
    private static void print_longest(int starting_index, int ending_index){
        for(int i = 0; i < array_size; i++){
            if(i == starting_index){
                System.out.print("(" + Rolls[i] + " ");
            }
            else if(i == ending_index){
                System.out.print(Rolls[i]);
                System.out.print(") ");
            }
            else
                System.out.print(Rolls[i] + " ");
        }
        if(ending_index == array_size){
            System.out.print(")");
        }
        System.out.println();
    }
}
