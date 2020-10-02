package module02.FINAL_TASK;

public interface ChessPiece {
    String getImage();
    boolean canMove(ChessBoard chessBoard, Coordinates from, Coordinates to);
    ChessPieceColor getColor();
}
