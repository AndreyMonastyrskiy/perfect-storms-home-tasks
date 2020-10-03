package module02.FINAL_TASK.ChessPieces;

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

public class PieceNone implements ChessPiece {
    private ChessPieceColor color;

    public PieceNone () {
        this.color = ChessPieceColor.NONE;
    }

    @Override
    public String getImage() {
        return "\u2001";
    }

    @Override
    public boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to) {
        return false;
    }

    @Override
    public ChessPieceColor getColor() {
        return ChessPieceColor.NONE;
    }

    @Override
    public String toString() {
        return String.format("%s {color = %s; image = %s}",
                this.getClass().getSimpleName(), this.color, this.getImage());
    }
}