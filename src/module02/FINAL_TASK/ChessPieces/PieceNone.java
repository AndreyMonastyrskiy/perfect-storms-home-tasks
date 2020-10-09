package module02.FINAL_TASK.ChessPieces;

/**
 * A class for a virtual chess piece defining an empty square on a chessboard.
 * Extends class ChessPiece.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

public class PieceNone extends ChessPiece {
    private ChessPieceColor color;

    public PieceNone () {
        super(ChessPieceColor.NONE);
    }

    @Override
    public ChessPieceTypes getType() {
        return ChessPieceTypes.NONE;
    }

    @Override
    public boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to) {
        return false;
    }

}
