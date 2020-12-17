package day17;

public class ChessBoard {
    private ChessPiece[][] figureChess;

    public ChessBoard(ChessPiece[][] figureChess){
        this.figureChess = figureChess;
    }

    public void print(){
        for(int i = 0; i < figureChess.length; i ++){
            for (int j = 0; j < figureChess[i].length; j ++){
                System.out.print(figureChess[i][j].getFigureName());
            }
            System.out.println("");
        }
    }
}
