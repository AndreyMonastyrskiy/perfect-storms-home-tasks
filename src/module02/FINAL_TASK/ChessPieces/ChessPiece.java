package module02.FINAL_TASK.ChessPieces;

/**
 * Chess piece abstract class. Methods are described:
 * canMove - checking the possibility of moving from one coordinate of the board to another,
 * getColor - getting the color of the figure.
 * getType - getting the type of the figure.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

public abstract class ChessPiece {
    private ChessPieceColor color;

    ChessPiece(ChessPieceColor color) {
        this.color = color;
    }

    public ChessPieceColor getColor() {
        return this.color;
    }

    public abstract boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to);

    public abstract ChessPieceTypes getType();

    @Override
    public String toString() {
        return String.format("ChessPiece{Type: %s; Color: %s}", this.getType(), this.color);
    }
}
