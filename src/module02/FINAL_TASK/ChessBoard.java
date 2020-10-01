package module02.FINAL_TASK;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard() {
        this.resetBoard();
    }

    public void resetBoard() {
        this.board = new ChessPiece[][] {
                {new PieceRook(ChessPieceColor.WHITE), new PieceKnight(ChessPieceColor.WHITE),
                        new PieceBishop(ChessPieceColor.WHITE), new PieceQueen(ChessPieceColor.WHITE),
                        new PieceKing(ChessPieceColor.WHITE), new PieceBishop(ChessPieceColor.WHITE),
                        new PieceKnight(ChessPieceColor.WHITE), new PieceRook(ChessPieceColor.WHITE)},
                {new PiecePawn(ChessPieceColor.WHITE), new PiecePawn(ChessPieceColor.WHITE),
                        new PiecePawn(ChessPieceColor.WHITE), new PiecePawn(ChessPieceColor.WHITE),
                        new PiecePawn(ChessPieceColor.WHITE), new PiecePawn(ChessPieceColor.WHITE),
                        new PiecePawn(ChessPieceColor.WHITE), new PiecePawn(ChessPieceColor.WHITE)},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {new PiecePawn(ChessPieceColor.BLACK), new PiecePawn(ChessPieceColor.BLACK),
                        new PiecePawn(ChessPieceColor.BLACK), new PiecePawn(ChessPieceColor.BLACK),
                        new PiecePawn(ChessPieceColor.BLACK), new PiecePawn(ChessPieceColor.BLACK),
                        new PiecePawn(ChessPieceColor.BLACK), new PiecePawn(ChessPieceColor.BLACK)},
                {new PieceRook(ChessPieceColor.BLACK), new PieceKnight(ChessPieceColor.BLACK),
                        new PieceBishop(ChessPieceColor.BLACK), new PieceQueen(ChessPieceColor.BLACK),
                        new PieceKing(ChessPieceColor.BLACK), new PieceBishop(ChessPieceColor.BLACK),
                        new PieceKnight(ChessPieceColor.BLACK), new PieceRook(ChessPieceColor.BLACK)}
        };
    }

    public void drawBoard() {
        final char[] LETTERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        System.out.println("-----------------------");
        for (int i = 7; i >= 0; i--) {
            System.out.print(LETTERS[i] + "|");
            for (int j = 0; j < 8; j++) {
                System.out.print((board[i][j] == null ? "\u2001" : board[i][j].getImage()) + "|");
            }
            System.out.println();
            System.out.println("-----------------------");
        }
        System.out.println(" |\u20051\u2006|\u20052\u2006|\u20053\u2006|\u20054\u2006|" +
                "\u20055\u2006|\u20056\u2006|\u20057\u2006|\u20058\u2006|");
    }
}
