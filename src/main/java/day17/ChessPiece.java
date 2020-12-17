package day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"),
    QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    BISHOP_WHITE(3.5, "♗"), BISHOP_BLACK(3.5, "♝"),
    KNIGHT_WHITE(3, "♘"), KNIGHT_BLACK(3, "♞"),
    ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"),
    PAWNS_WHITE(1, "♙"), PAWNS_BLACK(1, "♟"),
    EMPTY(-1, "_");

    private double figureValue;
    private String figureName;


    ChessPiece(double figureValue, String figureName){
        this.figureValue = figureValue;
        this.figureName = figureName;
    }

    public double getFigureValue(){
        return figureValue;
    }

    public String getFigureName(){
        return figureName;
    }
}
