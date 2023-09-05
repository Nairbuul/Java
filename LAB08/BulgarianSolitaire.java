import java.util.Arrays;
import java.util.Random;

public class BulgarianSolitaire {

    private static int MAX_PILES = 10;
    private static final int NUMBER_OF_CARDS = 45;
    private static int[] piles = new int[MAX_PILES];
    private static int numOfPiles = 0;
    private static Random random = new Random();

    public static void play() {
        // Initialize the piles with a random distribution of cards
        int remainingCards = NUMBER_OF_CARDS;
        while (remainingCards > 0) {
            int cardsInPile = random.nextInt(remainingCards) + 1;
            piles[numOfPiles++] = cardsInPile;
            remainingCards -= cardsInPile;
            if (numOfPiles == MAX_PILES) {
                resizePiles();
            }
        }

        for(int i = 0; i < MAX_PILES; i++){
            System.out.print(piles[i]+"|");
        }
        System.out.println();

        // Play the game
        int[] finalConfig = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // while (!Arrays.equals(piles, finalConfig)) {
        for(int j = 0; j < 10; j++){
            // Remove any piles that are empty
            // for (int i = 0; i < numOfPiles; i++) {
            //     piles[i]--;
            //     if (piles[i] == 0) {
            //         removeCell(i);
            //         i--;
            //     }
            // }

            // Add a new pile with one card from each pile
            // int newPile = numOfPiles++;
            // piles[newPile] = 0;
            // for (int i = 0; i < numOfPiles; i++) {
            //     piles[i]--;
            //     piles[newPile]++;
            //     if (piles[i] == 0) {
            //         removeCell(i);
            //         i--;
            //     }
            // }

            // Check if the piles are in the final configuration
            Arrays.sort(piles);
        }
        // Print the final configuration
        System.out.println(Arrays.toString(piles));
    }

    private static void resizePiles() {
        piles = Arrays.copyOf(piles, MAX_PILES * 2);
        MAX_PILES *= 2;
    }

    private static void removeCell(int index) {
        for (int i = index; i < numOfPiles - 1; i++) {
            piles[i] = piles[i + 1];
        }
        numOfPiles--;
    }

    // public static String toString() {
    //     return Arrays.toString(Arrays.copyOf(piles, numOfPiles));
    // }

    private static void print(){
        for(int i = 0; i < numOfPiles; i++){
            System.out.println(piles[i]);
        }
    }
}