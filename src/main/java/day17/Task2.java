package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece rB = ChessPiece.ROOK_BLACK;
        ChessPiece e = ChessPiece.EMPTY;
        ChessPiece kB = ChessPiece.KING_BLACK;
        ChessPiece rW = ChessPiece.ROOK_WHITE;
        ChessPiece pB = ChessPiece.PAWNS_BLACK;
        ChessPiece knB = ChessPiece.KNIGHT_BLACK;
        ChessPiece qB = ChessPiece.QUEEN_BLACK;
        ChessPiece bW = ChessPiece.BISHOP_WHITE;
        ChessPiece bB = ChessPiece.BISHOP_BLACK;
        ChessPiece pW = ChessPiece.PAWNS_WHITE;
        ChessPiece qW = ChessPiece.QUEEN_WHITE;
        ChessPiece kW = ChessPiece.KING_WHITE;
        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
                                                                    {rB, e, e, e, e, rB, kB, e},
                                                                    {e, rW, e, e, pB, pB, e, pB},
                                                                    {pB, e, knB, e, e, e, pB, e},
                                                                    {qB, e, e, bW, e, e, e, e},
                                                                    {e, e, e, bB, pW, e, e, e},
                                                                    {e, e, e, e, bW, pW, e, e},
                                                                    {pW, e, e, qW, e, pW, e, pW},
                                                                    {e, e, e, e, e, rW, kW, e}
                                                                                                    });

        chessBoard.print();
    }
}
