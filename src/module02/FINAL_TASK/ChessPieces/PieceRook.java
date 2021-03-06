package module02.FINAL_TASK.ChessPieces;

/**
 * A class for a chess piece Rook.
 * Extends class ChessPiece.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

public class PieceRook extends ChessPiece {
    private ChessPieceColor color;

    public PieceRook (ChessPieceColor color) {
        super(color);
    }

    @Override
    public ChessPieceTypes getType() {
        return ChessPieceTypes.ROOK;
    }

    @Override
    public boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to) {
        //FIXME Not all cases checked:
        // - Castling
        // - Threat to the king
        ChessPiece fromPeace = chessBoard.getPieceByCoordinates(from);
        ChessPiece toPeace = chessBoard.getPieceByCoordinates(to);
        // must be different colors
        if (toPeace.getColor() == fromPeace.getColor()) { return false; }
        // Determinate direction of movement
        if (from.getNumber() == to.getNumber()) { // horizontal move
            // Select where to move left or right
            if (from.getLetter() < to.getLetter()) { // right
                for (char i = (char)(from.getLetter() + 1); i < to.getLetter(); i++) {
                    ChessPiece currentPiece = chessBoard.getPieceByCoordinates(new Coordinates(i, from.getNumber()));
                    if (currentPiece.getColor() != ChessPieceColor.NONE) { return false; }
                }
            } else { //left
                for (char i = (char)(to.getLetter() - 1); i > from.getLetter(); i--) {
                    ChessPiece currentPiece = chessBoard.getPieceByCoordinates(new Coordinates(i, from.getNumber()));
                    if (currentPiece.getColor() != ChessPieceColor.NONE) { return false; }
                }
            }
        } else { // vertical move
            // Must be in the same vertical line
            if (from.getLetter() != to.getLetter()) { return false; }
            // Select where to move up or down
            if (from.getNumber() < to.getNumber()) { //up
                for (byte i = (byte)(from.getNumber() + 1); i < to.getNumber(); i++) {
                    ChessPiece currentPiece = chessBoard.getPieceByCoordinates(new Coordinates(from.getLetter(), i));
                    if (currentPiece.getColor() != ChessPieceColor.NONE) { return false; }
                }
            } else { //down
                for (byte i = (byte)(to.getNumber() - 1); i > from.getNumber(); i--) {
                    ChessPiece currentPiece = chessBoard.getPieceByCoordinates(new Coordinates(from.getLetter(), i));
                    if (currentPiece.getColor() != ChessPieceColor.NONE) { return false; }
                }
            }
        }
        // can move if all ok
        return true;
    }
}
