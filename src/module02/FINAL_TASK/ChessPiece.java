package module02.FINAL_TASK;

public interface ChessPiece {
    String getImage();
    boolean canMove(ChessBoard chessBoard, String from, String to);
    ChessPieceColor getColor();
}
