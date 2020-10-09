package module02.FINAL_TASK;

/**
 * The class implements the logic for storing and displaying the state of a chessboard with figures.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessPieces.*;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard() {
        this.resetBoard();
    }

    public void resetBoard() {
        this.board = new ChessPiece[][] {
                {new PieceRook(ChessPieceColor.WHITE), new PieceKnight(ChessPieceColor.WHITE),
                        new PieceBishop(ChessPieceColor.WHITE), new PieceQueen(ChessPieceColor.WHITE),
                        new PieceKing(ChessPieceColor.WHITE), new PieceBishop(ChessPieceColor.WHITE),
                        new PieceKnight(ChessPieceColor.WHITE), new PieceRook(ChessPieceColor.WHITE)},
                {new PiecePawn(ChessPieceColor.WHITE), new PiecePawn(ChessPieceColor.WHITE),
                        new PiecePawn(ChessPieceColor.WHITE), new PiecePawn(ChessPieceColor.WHITE),
                        new PiecePawn(ChessPieceColor.WHITE), new PiecePawn(ChessPieceColor.WHITE),
                        new PiecePawn(ChessPieceColor.WHITE), new PiecePawn(ChessPieceColor.WHITE)},
                {new PieceNone(), new PieceNone(), new PieceNone(), new PieceNone(),
                        new PieceNone(), new PieceNone(), new PieceNone(), new PieceNone()},
                {new PieceNone(), new PieceNone(), new PieceNone(), new PieceNone(),
                        new PieceNone(), new PieceNone(), new PieceNone(), new PieceNone()},
                {new PieceNone(), new PieceNone(), new PieceNone(), new PieceNone(),
                        new PieceNone(), new PieceNone(), new PieceNone(), new PieceNone()},
                {new PieceNone(), new PieceNone(), new PieceNone(), new PieceNone(),
                        new PieceNone(), new PieceNone(), new PieceNone(), new PieceNone()},
                {new PiecePawn(ChessPieceColor.BLACK), new PiecePawn(ChessPieceColor.BLACK),
                        new PiecePawn(ChessPieceColor.BLACK), new PiecePawn(ChessPieceColor.BLACK),
                        new PiecePawn(ChessPieceColor.BLACK), new PiecePawn(ChessPieceColor.BLACK),
                        new PiecePawn(ChessPieceColor.BLACK), new PiecePawn(ChessPieceColor.BLACK)},
                {new PieceRook(ChessPieceColor.BLACK), new PieceKnight(ChessPieceColor.BLACK),
                        new PieceBishop(ChessPieceColor.BLACK), new PieceQueen(ChessPieceColor.BLACK),
                        new PieceKing(ChessPieceColor.BLACK), new PieceBishop(ChessPieceColor.BLACK),
                        new PieceKnight(ChessPieceColor.BLACK), new PieceRook(ChessPieceColor.BLACK)}
        };
    }

    public ChessPiece[][] getBoard() {
        return this.board;
    }

    public ChessPiece getPieceByCoordinates(Coordinates coordinates) {
        return this.board[coordinates.getNumberForArray()][coordinates.getLetterForArray()];
    }

    public void putPiece(ChessPiece piece, Coordinates coordinates) {
        this.board[coordinates.getNumberForArray()][coordinates.getLetterForArray()] = piece;
    }

    public void clearCell(Coordinates coordinates) {
        this.board[coordinates.getNumberForArray()][coordinates.getLetterForArray()] = new PieceNone();
    }

    public Boolean movePiece(Coordinates from, Coordinates to) {
        if (getPieceByCoordinates(from).canMove(this, from, to)) {
            putPiece(getPieceByCoordinates(from), to);
            clearCell(from);
            return true;
        }
        return false;
    }

}
