import java.util.HashMap;
public class Pawn extends ChessPiece {
    boolean start;

    public Pawn(boolean white){
        start = true;
        setColor(white);
        setPosition("D7");
    }
    
    //Need to add function that'll convert the pawn to a different piece when it reaches row 8 or row 1.
    public void MoveTo(){
        clearMoveablePositions();
        if(getColor() == true){
            WhiteMoveTo();
        }
        else {
            BlackMoveTo();
        }
    }

    public void WhiteMoveTo(){
        String position = getPosition();
        int x = xCoordinatesEnum.getKey(position.charAt(0));
        int y = position.charAt(1)- '0';
        if(start){
            String temp = xCoordinatesEnum.getKey(x) + (y+2);
            addMoveablePositions(temp);
            start = false;
        }
        String temp = xCoordinatesEnum.getKey(x) + (y+1);
        addMoveablePositions(temp);

        // if(y+1 == 8){
            // Transform object into another object somehow.
        // }
    }

    public void BlackMoveTo(){
        String position = getPosition();
        int x = xCoordinatesEnum.getKey(position.charAt(0));
        int y = position.charAt(1)- '0';
        if(start){
            String temp = xCoordinatesEnum.getKey(x) + (y-2);
            addMoveablePositions(temp);
            start = false;
        }
        String temp = xCoordinatesEnum.getKey(x) + (y-1);
        addMoveablePositions(temp);

        // if(y-1 == 1){
            //Transform object into another object somehow.
        // }
    }

}



/*
 *   A B C D E F G H 
 * 8 r k b K Q b k r  
 * 7 p p p p p p p p 
 * 6                 
 * 5                 
 * 4       p         
 * 3                 
 * 2 p p p   p p p p 
 * 1 r k b Q K b k r 
 *   A B C D E F G H  
 */