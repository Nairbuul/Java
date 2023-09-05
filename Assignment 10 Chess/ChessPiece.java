import java.util.ArrayList;
public abstract class ChessPiece{
    private String position;
    private boolean white;
    private ArrayList<String> moveablePositions;

    public ChessPiece(){
        moveablePositions = new ArrayList<String>();
        position = "";
    }

    public abstract void MoveTo();
    
    public void setPosition(String coordinates){
        this.position = coordinates;
    }

    public void setColor(boolean white){
        this.white = white;
    }

    public void addMoveablePositions(String s){
        moveablePositions.add(s);
    }

    public String getPosition(){
        return position;
    }
    
    public boolean getColor(){
        return white;
    }

    public ArrayList<String> getMoveablePositions(){
        return moveablePositions;
    }

    public void clearMoveablePositions(){
        moveablePositions.clear();
    }

    // public void transform (ChessPiece p){
    //     p = new Queen(true);
    // }
}