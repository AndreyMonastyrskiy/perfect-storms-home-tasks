package module02.FINAL_TASK;

public class PieceKing implements ChessPiece{
    private ChessPieceColor color;

    public PieceKing (ChessPieceColor color) {
        this.color = color;
    }

    @Override
    public String getImage() {
        if (this.color == ChessPieceColor.WHITE) {
            return "\u2654";
        }
        return "\u265A";
    }

    @Override
    public boolean move(ChessBoard chessBoard, String from, String to) {
        // TODO
        return false;
    }

    @Override
    public ChessPieceColor getColor() {
        return this.color;
    }
}
