package module02.FINAL_TASK.ChessPieces;

/**
 * A class for a chess piece Knight.
 * Implements the interface ChessPiece.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

public class PieceKnight implements ChessPiece {
    private ChessPieceColor color;

    public PieceKnight (ChessPieceColor color) {
        this.color = color;
    }

    @Override
    public String getImage() {
        return this.color == ChessPieceColor.WHITE ? "\u2658" : "\u265E";
    }

    @Override
    public boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to) {
        //FIXME Not all cases checked:
        // - Threat to the king
        ChessPiece fromPeace = chessBoard.getPieceByCoordinates(from);
        ChessPiece toPeace = chessBoard.getPieceByCoordinates(to);
        // must be different colors
        if (toPeace.getColor() == fromPeace.getColor()) { return false; }
        // sum of difference of coordinates must be = 3
        // Coordinates literals of from and to must be different
        // Coordinates numbers of from and to must be different
        //       3
        //     3 2 3
        //   3 2 1 2 3
        // 3 2 1 K 1 2 3
        //   3 2 1 2 3
        //     3 2 3
        //       3
        if (Math.abs(from.getNumber() - to.getNumber()) +
                Math.abs(from.getLetterForArray() - to.getLetterForArray()) != 3 ||
                from.getNumber() == to.getNumber() ||
                from.getLetter() == to.getLetter()) {
            return false;
        }
        return true;
    }

    @Override
    public ChessPieceColor getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return String.format("%s {color = %s; image = %s}",
                this.getClass().getSimpleName(), this.color, this.getImage());
    }
}
