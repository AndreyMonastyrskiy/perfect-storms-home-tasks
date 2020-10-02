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
        //FIXME Not all cases checked:
        // - Taking on the aisle
        // - Threat to the king
        // - Replacing the shape on the last line
        ChessPiece fromPeace = chessBoard.getPieceByCoordinates(from);
        ChessPiece toPeace = chessBoard.getPieceByCoordinates(to);
        // must be different colors
        if (toPeace.getColor() == fromPeace.getColor()) { return false; }
        // sum of difference of coordinates must be < 3
        // 3 2 3
        // 2 1 2
        if (Math.abs(from.getNumber() - to.getNumber()) +
                Math.abs(from.getLetterForArray() - to.getLetterForArray()) > 2) {
            return false;
        }
        // Let's check the case when the pawn moves two steps forward
        // The previous cell must be empty
        if (Math.abs(to.getNumber() - from.getNumber()) == 2) {
            if (chessBoard.getPieceByCoordinates(new Coordinates(from.getLetter(), (byte)(from.getNumber() + 1))).
                    getColor() != ChessPieceColor.NONE) { return false; }
        }
        // can move if all ok
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
