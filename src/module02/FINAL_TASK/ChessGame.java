package module02.FINAL_TASK;

public class ChessGame {
    public static void main(String[] args) {
        //System.out.println("|\u20051\u2006|\u20052\u2006|\u20053\u2006|\u20054\u2006|");
        //System.out.println("------------");
        //System.out.println("|\u2654|\u2001|\u2654|\u265B|");
        //System.out.println("------------");
        //System.out.println("|\u2001|\u2654|\u265E|\u2654|");
        ChessBoard cb = new ChessBoard();
        cb.movePiece(new Coordinates("b1"), new Coordinates("c3"));
        cb.movePiece(new Coordinates("c3"), new Coordinates("d5"));
        cb.movePiece(new Coordinates("d5"), new Coordinates("e7"));
        cb.movePiece(new Coordinates("e7"), new Coordinates("b7"));
        cb.drawBoard();
    }
}
