package module02.FINAL_TASK;

import java.util.ArrayList;
import java.util.HashSet;
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
        // List with all available coordinates to move this pawn
        List<Coordinates> availableCoordinates = new ArrayList<>();
        // If pawn at start position it can move up to 2 positions, else up to 1 position
        int linesToCheck = (from.getNumber() == 2 || from.getNumber() == 7) ? 2 : 1;
        // Different direction of movement depending on the color of the figure
        if (this.color == ChessPieceColor.WHITE) {

        } else {

        }
        // if "to" coordinate in availableCoordinates List then return true, else false
        if (to.isInCoordinatesList(availableCoordinates)) {
            return true;
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
