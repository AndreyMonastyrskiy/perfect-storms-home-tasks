package module02.FINAL_TASK;

public class ChessGame {
    public static void main(String[] args) {
        //System.out.println("|\u20051\u2006|\u20052\u2006|\u20053\u2006|\u20054\u2006|");
        //System.out.println("------------");
        //System.out.println("|\u2654|\u2001|\u2654|\u265B|");
        //System.out.println("------------");
        //System.out.println("|\u2001|\u2654|\u265E|\u2654|");
        ChessBoard cb = new ChessBoard();
        cb.movePiece(new Coordinates("g1"), new Coordinates("h3"));
        cb.movePiece(new Coordinates("e2"), new Coordinates("e3"));
        cb.movePiece(new Coordinates("f1"), new Coordinates("d3"));
        cb.movePiece(new Coordinates("f1"), new Coordinates("d3"));
        cb.movePiece(new Coordinates("f2"), new Coordinates("f3"));
        cb.movePiece(new Coordinates("h1"), new Coordinates("f1"));

        cb.drawBoard();
    }
}
