package module02.FINAL_TASK;

/**
 * The class implements the logic for displaying the state of a chessboard with figures on the console (terminal).
 *
 * @author Andrey Monastyrskiy
 */


import module02.FINAL_TASK.ChessPieces.ChessPiece;
import module02.FINAL_TASK.ChessPieces.ChessPieceColor;


public abstract class ChessBoardConsoleUI {

    public static void drawBoard(ChessBoard chessBoard) {
        ChessPiece[][] board = chessBoard.getBoard();
        System.out.println("------------------------");
        for (int i = 7; i >= 0; i--) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < 8; j++) {
                System.out.print(ChessBoardConsoleUI.getPieceUnicodeSymbol(board[i][j]) + "|");
            }
            System.out.println();
            System.out.println("------------------------");
        }
        System.out.println("  |\u2005a\u2006|\u2005b\u2006|\u2005c\u2006|\u2005d\u2006|" +
                "\u2005e\u2006|\u2005f\u2006|\u2005g\u2006|\u2005h\u2006|");
    }

    public static String getPieceUnicodeSymbol(ChessPiece piece) {
        switch (piece.getType()) {
            case BISHOP:
                return piece.getColor() == ChessPieceColor.WHITE ? "\u2657" : "\u265D";
            case KING:
                return piece.getColor() == ChessPieceColor.WHITE ? "\u2654" : "\u265A";
            case KNIGHT:
                return piece.getColor() == ChessPieceColor.WHITE ? "\u2658" : "\u265E";
            case PAWN:
                return piece.getColor() == ChessPieceColor.WHITE ? "\u2659" : "\u265F";
            case QUEEN:
                return piece.getColor() == ChessPieceColor.WHITE ? "\u2655" : "\u265B";
            case ROOK:
                return piece.getColor() == ChessPieceColor.WHITE ? "\u2656" : "\u265C";
            default:
                return "\u2001";
        }
    }
}
