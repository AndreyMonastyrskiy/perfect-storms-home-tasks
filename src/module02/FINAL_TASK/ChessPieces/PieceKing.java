package module02.FINAL_TASK.ChessPieces;

/**
 * A class for a chess piece King.
 * Extends class ChessPiece.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

public class PieceKing extends ChessPiece {
    private ChessPieceColor color;

    public PieceKing (ChessPieceColor color) {
        super(color);
    }

    @Override
    public ChessPieceTypes getType() {
        return ChessPieceTypes.KING;
    }

    @Override
    public boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to) {
        //FIXME Not all cases checked:
        // - Threat to the king
        // - Castling
        ChessPiece fromPeace = chessBoard.getPieceByCoordinates(from);
        ChessPiece toPeace = chessBoard.getPieceByCoordinates(to);
        // must be different colors
        if (toPeace.getColor() == fromPeace.getColor()) { return false; }
        // check if piece move exactly vertically
        if (from.getLetter() == to.getLetter()) {
            // maximum 1 step
            if (Math.abs(from.getNumber() - to.getNumber()) > 1) { return false; }
        }
        // check if piece move exactly horizontally
        if (from.getNumber() == to.getNumber()) {
            // maximum 1 step
            if (Math.abs(from.getLetter() - to.getLetter()) > 1) { return false; }
        }
        // if piece move obliquely maximum allowed difference in coordinates is 2
        if (Math.abs(from.getNumber() - to.getNumber()) +
                Math.abs(from.getLetterForArray() - to.getLetterForArray()) > 2) {
            return false;
        }
        // if all ok return true
        return true;
    }

}
