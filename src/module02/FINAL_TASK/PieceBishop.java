package module02.FINAL_TASK;

public class PieceBishop implements ChessPiece{
    private ChessPieceColor color;

    public PieceBishop (ChessPieceColor color) {
        this.color = color;
    }

    @Override
    public String getImage() {
        return this.color == ChessPieceColor.WHITE ? "\u2657" : "\u265D";
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
