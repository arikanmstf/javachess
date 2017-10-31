package com.javachess.pieces;

import com.javachess.board.Square;

class CastlingPieceMove extends PieceMove {
    public static final int QUEEN_SIDE_WHITE = 0;
    public static final int KING_SIDE_WHITE = 1;
    public static final int QUEEN_SIDE_BLACK = 2;
    public static final int KING_SIDE_BLACK = 3;
    CastlingPieceMove(Square f, Square t, int CASTLING_TYPE) {
        super(f, t);
        int rookFrom = -1;
        int rookTo = -1;
        switch (CASTLING_TYPE) {
            case QUEEN_SIDE_WHITE: rookFrom = 56; rookTo = 58; break;
            case KING_SIDE_WHITE: rookFrom = 63; rookTo = 61; break;
            case QUEEN_SIDE_BLACK: rookFrom = 0; rookTo = 2; break;
            case KING_SIDE_BLACK: rookFrom = 7; rookTo = 5; break;
        }
        // Piece.squares[rookTo].setPiece(Piece.squares[rookFrom].piece);
        // Piece.squares[rookFrom].empty();
    }
}
