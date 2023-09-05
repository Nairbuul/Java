// package Assignment_01_Chapter_2;

import java.util.Random;
import java.util.Scanner;

public class P2_7 {
    public static void main(String args[]){
        //To alter the seed input a number into Random();
        Random lottery_rolls = new Random();

        Scanner input = new Scanner(System.in);

        //nextInt arguments(lowerBound, upperBound) 
        //NOTE: the upperBound is excluded from the number generation.
        System.out.println("Play this combination -it'll make your rich!: ");
        for(int i = 0; i < 6; i++){
            System.out.print(lottery_rolls.nextInt(1,50) + " ");
        }
        System.out.println();
        return; 
    }
}

//Programmer notes:

/*E2.13
 * The random class implements a random number egnerator, which produces sequences of numbers that appear to be random.
 * To generate random integers, you must construct an object of the random class, and then apply the nextInt method. For
 * example, the call ggenerator.next int 6 gives you a random number between 0 and 5. 
 * Write a program DieSimulator that uses the random class to simulate teh cast of a die, printing a random number between 
 * 1 and 6 everytime the program is ran.
 */

 /*P2.7
  * Write a program LoteryPrinter that picks a combination in a lottery. In this lottery, players can choose
  * 6 numbers (possibly repeated) between 1 and 49. Construct an object of the Random class (see Exercise E2.12)
  * and invoke an appropriate method to generate each number. (In a real lottery, repetitions aren't allowed, but
  * we haven't yet discussed the programming constructs that would be required to deal with that problem.) Your 
  * program should print out a sentence such as "Play this cominbation -it'll make you rich!", followed by a lottery
  * combination.
  */