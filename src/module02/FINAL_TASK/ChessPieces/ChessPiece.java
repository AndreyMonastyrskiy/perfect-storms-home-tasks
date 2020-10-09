package module02.FINAL_TASK.ChessPieces;

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

public interface ChessPiece {
    String getPieceUnicodeSymbol();
    boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to);
    ChessPieceColor getColor();
}
