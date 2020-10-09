package module02.FINAL_TASK.ChessPieces;

/**
 * A class for a chess piece Queen.
 * Extends class ChessPiece.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

import java.util.ArrayList;
import java.util.List;

public class PieceQueen extends ChessPiece {
    private ChessPieceColor color;

    public PieceQueen (ChessPieceColor color) {
        super(color);
    }

    @Override
    public ChessPieceTypes getType() {
        return ChessPieceTypes.QUEEN;
    }

    @Override
    public boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to) {
        //FIXME Not all cases checked:
        // - Threat to the king
        ChessPiece fromPeace = chessBoard.getPieceByCoordinates(from);
        ChessPiece toPeace = chessBoard.getPieceByCoordinates(to);
        // must be different colors
        if (toPeace.getColor() == fromPeace.getColor()) { return false; }
        // find all available moves
        List<Coordinates> availableMoves = new ArrayList<Coordinates>();
        // up
        for (byte i = (byte)(from.getNumber() + 1); i <= to.getNumber(); i++) {
            Coordinates currentCoordinates = new Coordinates(from.getLetter(), i);
            ChessPiece currentPiece = chessBoard.getPieceByCoordinates(currentCoordinates);
            // If cell is empty, or it is end cell and piece color differ from start piece
            if (currentPiece.getColor() == ChessPieceColor.NONE  ||
                    (i == to.getNumber() && currentPiece.getColor() != fromPeace.getColor())) {
                availableMoves.add(currentCoordinates);
            } else {
                break;
            }
        }
        // down
        for (byte i = (byte)(from.getNumber() - 1); i >= to.getNumber(); i--) {
            Coordinates currentCoordinates = new Coordinates(from.getLetter(), i);
            ChessPiece currentPiece = chessBoard.getPieceByCoordinates(currentCoordinates);
            // If cell is empty, or it is end cell and piece color differ from start piece
            if (currentPiece.getColor() == ChessPieceColor.NONE  ||
                    (i == to.getNumber() && currentPiece.getColor() != fromPeace.getColor())) {
                availableMoves.add(currentCoordinates);
            } else {
                break;
            }
        }
        // left
        for (char i = (char)(from.getLetter() - 1); i >= to.getLetter(); i--) {
            Coordinates currentCoordinates = new Coordinates(i, from.getNumber());
            ChessPiece currentPiece = chessBoard.getPieceByCoordinates(currentCoordinates);
            // If cell is empty, or it is end cell and piece color differ from start piece
            if (currentPiece.getColor() == ChessPieceColor.NONE  ||
                    (i == to.getLetter() && currentPiece.getColor() != fromPeace.getColor())) {
                availableMoves.add(currentCoordinates);
            } else {
                break;
            }
        }
        // right
        for (char i = (char)(from.getLetter() + 1); i <= to.getLetter(); i++) {
            Coordinates currentCoordinates = new Coordinates(i, from.getNumber());
            ChessPiece currentPiece = chessBoard.getPieceByCoordinates(currentCoordinates);
            // If cell is empty, or it is end cell and piece color differ from start piece
            if (currentPiece.getColor() == ChessPieceColor.NONE  ||
                    (i == to.getLetter() && currentPiece.getColor() != fromPeace.getColor())) {
                availableMoves.add(currentCoordinates);
            } else {
                break;
            }
        }
        // up left
        for (byte i = (byte)(from.getNumber() + 1); i <= to.getNumber(); i++) {
            char j = (char)(from.getLetter() - (i - from.getNumber()));
            if (j < 'a') { break; }
            Coordinates currentCoordinates = new Coordinates(j, i);
            ChessPiece currentPiece = chessBoard.getPieceByCoordinates(currentCoordinates);
            // If cell is empty, or it is end cell and piece color differ from start piece
            if (currentPiece.getColor() == ChessPieceColor.NONE  ||
                    (i == to.getNumber() && j == to.getLetter() && currentPiece.getColor() != fromPeace.getColor())) {
                availableMoves.add(currentCoordinates);
            } else {
                break;
            }
        }
        // up right
        for (byte i = (byte)(from.getNumber() + 1); i <= to.getNumber(); i++) {
            char j = (char)(from.getLetter() + (i - from.getNumber()));
            if (j > 'h') { break; }
            Coordinates currentCoordinates = new Coordinates(j, i);
            ChessPiece currentPiece = chessBoard.getPieceByCoordinates(currentCoordinates);
            // If cell is empty, or it is end cell and piece color differ from start piece
            if (currentPiece.getColor() == ChessPieceColor.NONE  ||
                    (i == to.getNumber() && j == to.getLetter() && currentPiece.getColor() != fromPeace.getColor())) {
                availableMoves.add(currentCoordinates);
            } else {
                break;
            }
        }
        // down left
        for (byte i = (byte)(from.getNumber() - 1); i >= to.getNumber(); i--) {
            char j = (char)(from.getLetter() - (from.getNumber() - i));
            if (j < 'a') { break; }
            Coordinates currentCoordinates = new Coordinates(j, i);
            ChessPiece currentPiece = chessBoard.getPieceByCoordinates(currentCoordinates);
            // If cell is empty, or it is end cell and piece color differ from start piece
            if (currentPiece.getColor() == ChessPieceColor.NONE  ||
                    (i == to.getNumber() && j == to.getLetter() && currentPiece.getColor() != fromPeace.getColor())) {
                availableMoves.add(currentCoordinates);
            } else {
                break;
            }
        }
        // down right
        for (byte i = (byte)(from.getNumber() - 1); i >= to.getNumber(); i--) {
            char j = (char)(from.getLetter() + (from.getNumber() - i));
            if (j > 'h') { break; }
            Coordinates currentCoordinates = new Coordinates(j, i);
            ChessPiece currentPiece = chessBoard.getPieceByCoordinates(currentCoordinates);
            // If cell is empty, or it is end cell and piece color differ from start piece
            if (currentPiece.getColor() == ChessPieceColor.NONE  ||
                    (i == to.getNumber() && j == to.getLetter() && currentPiece.getColor() != fromPeace.getColor())) {
                availableMoves.add(currentCoordinates);
            } else {
                break;
            }
        }

        // if "to" coordinates in available moves list than true, else false
        if (to.isInCoordinatesList(availableMoves)) {
            return true;
        } else {
            return false;
        }
    }

}
