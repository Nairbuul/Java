public class Tester {
    public static void main(String args[]){
        ChessPiece p = new Pawn(true);
        System.out.println("White Piece: " + p.getPosition());
        p.MoveTo();
        System.out.println("White Piece: " + p.getMoveablePositions());
        p.MoveTo();
        System.out.println("White Piece: " + p.getMoveablePositions());
        System.out.println("White Piece: " + p.getClass());
        
        Pawn p2 = new Pawn(false);
        System.out.println("Black piece: " + p2.getPosition());
        p2.MoveTo();
        System.out.println("Black piece: " + p2.getMoveablePositions());
        p2.MoveTo();
        System.out.println("Black piece: " + p2.getMoveablePositions());
        System.out.println("Black Piece: " + p2.getClass());
    }
}
