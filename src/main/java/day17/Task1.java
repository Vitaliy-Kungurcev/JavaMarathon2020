package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[]list = new ChessPiece[8];
        list[0]=ChessPiece.PAWN_WHITE;
        list[1]=ChessPiece.PAWN_WHITE;
        list[2]=ChessPiece.PAWN_WHITE;
        list[3]=ChessPiece.PAWN_WHITE;
        list[4]=ChessPiece.ROOK_BLACK;
        list[5]=ChessPiece.ROOK_BLACK;
        list[6]=ChessPiece.ROOK_BLACK;
        list[7]=ChessPiece.ROOK_BLACK;

        for (ChessPiece chessPiece : list) {
            System.out.print(chessPiece+" ");

        }

    }
}
