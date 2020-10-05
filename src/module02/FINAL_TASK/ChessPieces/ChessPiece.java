package module02.FINAL_TASK.ChessPieces;

/**
 * Chess piece interface. Methods are described:
 * getting an image of a figure,
 * checking the possibility of moving from one coordinate of the board to another,
 * getting the color of the figure.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

public interface ChessPiece {
    String getImage();
    boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to);
    ChessPieceColor getColor();
}
