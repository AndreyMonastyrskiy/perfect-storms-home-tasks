package module02.FINAL_TASK;
/**
 * A class with a main method.
 * Allows you to enter coordinates for moving pieces around the chessboard and displays the result.
 *
 * @author Andrey Monastyrskiy
 */

import module02.FINAL_TASK.ChessPieces.ChessPieceColor;
import module02.FINAL_TASK.ChessPieces.PieceKing;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessBoard board = new ChessBoard();
        ChessBoardConsoleUI.drawBoard(board);
        //board.drawBoard();
        ChessPieceColor colorToMove = ChessPieceColor.WHITE;
        String userInput = "";

        do {
            System.out.println("Type \"exit\", or a pair of coordinates to move piece. For example: a2 a4");
            userInput = scanner.nextLine();
            if (userInput.equals("exit")) { break; }
            String[] userInputArguments = userInput.split(" ");
            if (userInputArguments.length != 2) {
                System.out.println("Wrong number of coordinates. Try another coordinates, or type exit");
                continue;
            }
            if (!Coordinates.validate(userInputArguments[0]) || !Coordinates.validate(userInputArguments[1])) {
                System.out.println("Wrong coordinates. Try another coordinates, or type exit.");
                continue;
            }
            Coordinates from = new Coordinates(userInputArguments[0]);
            Coordinates to = new Coordinates(userInputArguments[1]);
            // check color of piece to move
            if (board.getPieceByCoordinates(from).getColor() != colorToMove) {
                if (colorToMove == ChessPieceColor.WHITE) {
                    System.out.println("Wrong color of piece to move. Тow it's white's turn. " +
                            "Try another coordinates, or type exit.");
                } else {
                    System.out.println("Wrong color of piece to move. Тow it's black's turn. " +
                            "Try another coordinates, or type exit.");
                }
                continue;
            }

            if (!board.movePiece(from, to)) {
                System.out.println("Can't move! Try another coordinates, or type exit.");
                continue;
            }
            ChessBoardConsoleUI.drawBoard(board);
            //board.drawBoard();

            // change color of piece to move
            if (colorToMove == ChessPieceColor.WHITE) {
                colorToMove = ChessPieceColor.BLACK;
            } else {
                colorToMove = ChessPieceColor.WHITE;
            }
        } while (!userInput.equals("exit"));

        scanner.close();

        System.out.println(new PieceKing(ChessPieceColor.BLACK));
    }
}
