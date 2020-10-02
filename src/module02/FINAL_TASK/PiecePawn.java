package module02.FINAL_TASK;

import java.util.ArrayList;
import java.util.List;

public class PiecePawn  implements ChessPiece{
    private ChessPieceColor color;

    public PiecePawn (ChessPieceColor color) {
        this.color = color;
    }

    @Override
    public String getImage() {
        return this.color == ChessPieceColor.WHITE ? "\u2659" : "\u265F";
    }

    @Override
    public boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to) {
        // TODO
        ChessPiece fromPeace = chessBoard.getPieceByCoordinates(from);
        ChessPiece toPeace = chessBoard.getPieceByCoordinates(to);
        if (toPeace.getColor() == fromPeace.getColor()) { return false; }

        if (fromPeace.getColor() == ChessPieceColor.WHITE) {

        } else {

        }

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
