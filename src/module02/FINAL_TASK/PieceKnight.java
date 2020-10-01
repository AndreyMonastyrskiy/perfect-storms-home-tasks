package module02.FINAL_TASK;

public class PieceKnight implements ChessPiece{
    private ChessPieceColor color;

    public PieceKnight (ChessPieceColor color) {
        this.color = color;
    }

    @Override
    public String getImage() {
        return this.color == ChessPieceColor.WHITE ? "\u2658" : "\u265E";
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
