package day17;

public class ChessBoard {
    public ChessBoard(ChessPiece[][] chessPieces) {
        print(chessPieces);
    }

    public static void print(ChessPiece[][] chessBoard) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}