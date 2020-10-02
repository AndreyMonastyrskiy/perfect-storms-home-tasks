package module02.FINAL_TASK;

public class PieceKing implements ChessPiece{
    private ChessPieceColor color;

    public PieceKing (ChessPieceColor color) {
        this.color = color;
    }

    @Override
    public String getImage() {
        return this.color == ChessPieceColor.WHITE ? "\u2654" : "\u265A";
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