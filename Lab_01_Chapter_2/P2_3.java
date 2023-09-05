/*
Project details: 
Write a CenteredSquaresPrinter program that constructs a Rectangle object square representing 
a square with top-left corner (100, 100) and side length 200, prints its location by calling 
System.out.println(square), applies the grow and translate methods, and calls System.out.println(square) 
again. The calls to grow and translate should modify the square so that it has half the width and is 
centered in the original square. If the squares were drawn, they would look like the figure at right. Your
program will not produce a drawing. It will simply print the locations of square before and after calling 
the mutator methods. Look up the description of the grow method in the API documentation. 
*/

/*
 * Steps 
 * 1.) Draw the square with the correct coordinates and width.
 * 2.) Locaate the center coordinates of the square(200,200).
 * 3.) Calculate the new coordinates of the smaller square (top_left corner). //Set this coordinates as our new goal
 * 4.) Open the API documentation of the awt.Rectangle class and find the arguments for translate/grow.
 * 5.) Create a square object.
 * 6.) We want to alter the width and height to half of what it is.
 * 7.) Arithmetic to calulate new location of top left of triangle.
 */
import java.awt.Rectangle;

//2.3 
public class P2_3{
    public static void main(String[] args){
        //Changes the Arithmethic.
        boolean shrink = true;
        boolean growth = false;

        //Declaring our square object.
        Rectangle square = new Rectangle(100,100,200,200); 
        Rectangle square2 = new Rectangle(100,100,200,200); 

        //Printing out our dimensions  and coordinates:
        System.out.println("Square Coordinates and Dimensions:");
        System.out.println(square);
        
        //Saving our height and width for future arithemtic.
        int widthShrink = (int)-square.getWidth()/4;    //Shrinks half
        int heightShrink = (int)-square.getWidth()/4;   //Shrinks by half
        int widthGrowth = (int)square2.getWidth()/4;
        int heightGrowth = (int)square2.getHeight()/4;

        //grow changes coordinates the top left coordinates and also grows 1 in each direction.
        if(shrink == true){
            System.out.println("Shrinking by half and maintaining square's center coordinates.");
            // square.grow(0,-1); //Example
            // System.out.println(square);
            square.grow(widthShrink, heightShrink); 
            // square.translate(0, heightShrink*2); // x&y coordinates represent quadrant 4 on graph.
            System.out.println(square);
        }

        //x-values grow/shrink in the correct direction while y-values grow in the oppsite direction.
        if(growth == true){
            System.out.println("Growth by half and maintaing square's center coordinates.");
            square2.grow(widthGrowth, heightGrowth);
            // square2.translate(0, heightGrowth*2); 
            System.out.println(square2);
        }
    }
}