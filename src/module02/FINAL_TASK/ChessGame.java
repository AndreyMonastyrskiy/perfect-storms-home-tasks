package module02.FINAL_TASK;

public class ChessGame {
    public static void main(String[] args) {
        //System.out.println("|\u20051\u2006|\u20052\u2006|\u20053\u2006|\u20054\u2006|");
        //System.out.println("------------");
        //System.out.println("|\u2654|\u2001|\u2654|\u265B|");
        //System.out.println("------------");
        //System.out.println("|\u2001|\u2654|\u265E|\u2654|");
        ChessBoard cb = new ChessBoard();
        /*cb.movePiece(new Coordinates("a7"), new Coordinates("a6"));
        cb.movePiece(new Coordinates("a6"), new Coordinates("a5"));
        cb.movePiece(new Coordinates("a5"), new Coordinates("a4"));
        cb.movePiece(new Coordinates("a4"), new Coordinates("a3"));
        cb.movePiece(new Coordinates("a8"), new Coordinates("a4"));
        cb.movePiece(new Coordinates("a3"), new Coordinates("b2"));
        cb.movePiece(new Coordinates("a4"), new Coordinates("a2"));
        cb.movePiece(new Coordinates("b2"), new Coordinates("c1"));
        cb.movePiece(new Coordinates("a2"), new Coordinates("d2"));
        cb.movePiece(new Coordinates("a2"), new Coordinates("c2"));
        cb.movePiece(new Coordinates("c2"), new Coordinates("c8"));
        cb.movePiece(new Coordinates("c2"), new Coordinates("c6"));
        cb.movePiece(new Coordinates("c6"), new Coordinates("b6"));*/
        cb.drawBoard();
    }
}
