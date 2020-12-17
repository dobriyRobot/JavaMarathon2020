package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece figure1 = ChessPiece.PAWNS_WHITE;
        ChessPiece figure2 = ChessPiece.ROOK_BLACK;

        String[] arr = new String[8];

        for(int i = 0; i < 4; i++){
            arr[i] = figure1.getFigureName();
            System.out.print(arr[i] + " ");
        }
        for(int i = 4; i < 8; i++){
            arr[i] = figure2.getFigureName();
            System.out.print(arr[i] + " ");
        }
    }
}