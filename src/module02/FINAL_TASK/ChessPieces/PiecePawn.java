package module02.FINAL_TASK.ChessPieces;

/**
 * A class for a chess piece Pawn.
 * Extends class ChessPiece.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;


public class PiecePawn extends ChessPiece {
    private ChessPieceColor color;

    public PiecePawn (ChessPieceColor color) {
        super(color);
    }

    @Override
    public ChessPieceTypes getType() {
        return ChessPieceTypes.PAWN;
    }

    @Override
    public boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to) {
        //FIXME Not all cases checked:
        // - Taking on the aisle
        // - Threat to the king
        // - Replacing the shape on the last line
        ChessPiece fromPeace = chessBoard.getPieceByCoordinates(from);
        ChessPiece toPeace = chessBoard.getPieceByCoordinates(to);
        // must be different colors
        if (toPeace.getColor() == fromPeace.getColor()) { return false; }
        // sum of difference of coordinates must be < 3
        // 3 2 3
        // 2 1 2
        if (Math.abs(from.getNumber() - to.getNumber()) +
                Math.abs(from.getLetterForArray() - to.getLetterForArray()) > 2) {
            return false;
        }
        // Let's check the case when the pawn moves two steps forward
        if (Math.abs(to.getNumber() - from.getNumber()) == 2) {
            // two steps allowed only from start positions
            if (from.getNumber() != 2 && from.getNumber() != 7) { return false; }
            // The previous cell must be empty
            if (fromPeace.getColor() == ChessPieceColor.WHITE) {
                if (chessBoard.getPieceByCoordinates(new Coordinates(from.getLetter(), (byte)(from.getNumber() + 1))).
                        getColor() != ChessPieceColor.NONE) { return false; }
            } else {
                if (chessBoard.getPieceByCoordinates(new Coordinates(from.getLetter(), (byte)(from.getNumber() - 1))).
                        getColor() != ChessPieceColor.NONE) { return false; }
            }

        }
        // can move only forward
        if (chessBoard.getPieceByCoordinates(from).getColor() == ChessPieceColor.WHITE) {
            if (to.getNumber() <= from.getNumber()) { return false; }
        } else {
            if (to.getNumber() >= from.getNumber()) { return false; }
        }
        // can move if all ok
        return true;
    }
}
