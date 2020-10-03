package module02.FINAL_TASK.ChessPieces;

import module02.FINAL_TASK.ChessBoard;
import module02.FINAL_TASK.Coordinates;

public class PieceQueen implements ChessPiece {
    private ChessPieceColor color;

    public PieceQueen (ChessPieceColor color) {
        this.color = color;
    }

    @Override
    public String getImage() {
        return this.color == ChessPieceColor.WHITE ? "\u2655" : "\u265B";
    }

    @Override
    public boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to) {
        // TODO
        return false;
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
