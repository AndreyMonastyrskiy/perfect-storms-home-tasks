package module02.FINAL_TASK.ChessPieces;

/**
 * A class for a chess piece Bishop.
 * Extends class ChessPiece.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

public class PieceBishop extends ChessPiece {

    public PieceBishop(ChessPieceColor color) {
        super(color);
    }

    @Override
    public ChessPieceTypes getType() {
        return ChessPieceTypes.BISHOP;
    }

    public boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to) {
        //FIXME Not all cases checked:
        // - Threat to the king
        ChessPiece fromPeace = chessBoard.getPieceByCoordinates(from);
        ChessPiece toPeace = chessBoard.getPieceByCoordinates(to);
        // must be different colors
        if (toPeace.getColor() == fromPeace.getColor()) { return false; }
        // ABS from.digit - to.digit must equal to from.letter - to.letter
        if (Math.abs(from.getNumber() - to.getNumber()) !=
                Math.abs(from.getLetter() - to.getLetter())) { return false; }
        // Determinate direction of movement
        if (from.getNumber() < to.getNumber()) { // up
            if (from.getLetter() < to.getLetter()) { // up right
                for (byte i = (byte)(from.getNumber() + 1); i < to.getNumber(); i++) {
                    char j = (char)(from.getLetter() + i - from.getNumber());
                    ChessPiece currentPiece = chessBoard.getPieceByCoordinates(new Coordinates(j, i));
                    if (currentPiece.getColor() != ChessPieceColor.NONE) { return false; }
                }
            } else { // up left
                for (byte i = (byte)(from.getNumber() + 1); i < to.getNumber(); i++) {
                    char j = (char)(from.getLetter() - (i - from.getNumber()));
                    ChessPiece currentPiece = chessBoard.getPieceByCoordinates(new Coordinates(j, i));
                    if (currentPiece.getColor() != ChessPieceColor.NONE) { return false; }
                }
            }
        } else { //down
            if (from.getLetter() < to.getLetter()) { // down right
                for (byte i = (byte)(from.getNumber() - 1); i > to.getNumber(); i--) {
                    char j = (char)(from.getLetter() + from.getNumber() - i);
                    ChessPiece currentPiece = chessBoard.getPieceByCoordinates(new Coordinates(j, i));
                    if (currentPiece.getColor() != ChessPieceColor.NONE) { return false; }
                }
            } else { // down left
                for (byte i = (byte)(from.getNumber() - 1); i > to.getNumber(); i--) {
                    char j = (char)(from.getLetter() - (from.getNumber() - i));
                    ChessPiece currentPiece = chessBoard.getPieceByCoordinates(new Coordinates(j, i));
                    if (currentPiece.getColor() != ChessPieceColor.NONE) { return false; }
                }
            }
        }
        // can move if all ok
        return true;
    }

}
