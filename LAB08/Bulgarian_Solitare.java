import java.util.Random;
import java.util.Arrays;
public class Bulgarian_Solitare {
    //Instance variables
    private static int MAX_PILES = 10;
    private static final int NUMBER_OF_CARDS = 45;
    private static int piles[] = new int[MAX_PILES];
    private static int numOfPiles = 0;
    private static Random random = new Random();

    public static void play(){
        initialize_array();
        print();
        while(maximum() != 9){
            deduct_elements();
        }
        print();
    }

    private static int[] resizePiles(int array[]){
        MAX_PILES += 1;
        int temp[] = new int[MAX_PILES];
        for(int i = 0; i < piles.length; i++){
            temp[i] = piles[i];
        }
        return temp;
    }

    private static void initialize_array(){
        int remainingCards = NUMBER_OF_CARDS;
        while(remainingCards > 0){
            int generatedNumber = random.nextInt(remainingCards+1);
            if(generatedNumber != 0){
                piles[numOfPiles] = generatedNumber;
                remainingCards -= piles[numOfPiles];
                numOfPiles++;
                if(numOfPiles == MAX_PILES){
                    piles = resizePiles(piles);
                }
            }
        }
    }

    private static void removeCell(int index){
        for(int i = index; i < numOfPiles-1; i++){
            piles[i] = piles[i+1];
        }
        numOfPiles--;
    }

    private static boolean check(){
        int temp  = 0;
        for(int i = 0; i <numOfPiles;i++){
            if(temp == 45){
                return true;
            }
            temp += piles[i];
        }
        
        return false;
    }

    private static void deduct_elements(){
        for(int i = 0; i < numOfPiles; i++){
            piles[i]--;
            if(piles[i] == 0){
                removeCell(i);
            }
            else{
                piles = resizePiles(piles);
            }
        }
        if(numOfPiles != MAX_PILES){
            piles[numOfPiles] = numOfPiles;
            numOfPiles++;
        }
    }

    private static void print(){
        for(int i = 0; i < numOfPiles; i++){
            System.out.print(piles[i]+"|");
        }
        System.out.println("\nSIZE:" + numOfPiles + " MAX SIZE: " + MAX_PILES);
        System.out.println(check());
    }

    private static int maximum(){
        int largest = 0;
        for(int i = 1; i < numOfPiles; i++){
            if(piles[i] > largest)
                largest = piles[i];
        }
        return largest;
    }

}
