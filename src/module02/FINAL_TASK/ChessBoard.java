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
        System.out.println("------------------------");
        for (int i = 7; i >= 0; i--) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < 8; j++) {
                System.out.print((board[i][j] == null ? "\u2001" : board[i][j].getImage()) + "|");
            }
            System.out.println();
            System.out.println("------------------------");
        }
        System.out.println("  |\u2005a\u2006|\u2005b\u2006|\u2005c\u2006|\u2005d\u2006|" +
                "\u2005e\u2006|\u2005f\u2006|\u2005g\u2006|\u2005h\u2006|");
    }

    public ChessPiece getPieceByCoordinates(Coordinates coordinates) {
        return this.board[coordinates.getNumberForArray()][coordinates.getLetterForArray()];
    }

    public void putPiece(ChessPiece piece, Coordinates coordinates) {
        this.board[coordinates.getNumberForArray()][coordinates.getLetterForArray()] = piece;
    }

    public void clearCell(Coordinates coordinates) {
        this.board[coordinates.getNumberForArray()][coordinates.getLetterForArray()] = null;
    }

    public Boolean movePiece(Coordinates from, Coordinates to) {
        if (getPieceByCoordinates(from).canMove(this, from, to)) {
            putPiece(getPieceByCoordinates(from), to);
            clearCell(from);
            return true;
        }
        return false;
    }

}
