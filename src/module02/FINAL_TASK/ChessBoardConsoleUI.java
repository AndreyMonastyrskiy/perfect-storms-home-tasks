package module02.FINAL_TASK;

import module02.FINAL_TASK.ChessPieces.ChessPiece;

/**
 * The class implements the logic for displaying the state of a chessboard with figures on the console (terminal).
 *
 * @author Andrey Monastyrskiy
 */

public class ChessBoardConsoleUI {

    public static void drawBoard(ChessBoard chessBoard) {
        ChessPiece[][] board = chessBoard.getBoard();
        System.out.println("------------------------");
        for (int i = 7; i >= 0; i--) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j].getPieceUnicodeSymbol() + "|");
            }
            System.out.println();
            System.out.println("------------------------");
        }
        System.out.println("  |\u2005a\u2006|\u2005b\u2006|\u2005c\u2006|\u2005d\u2006|" +
                "\u2005e\u2006|\u2005f\u2006|\u2005g\u2006|\u2005h\u2006|");
    }
}
