package com.javachess.pieces;

import com.javachess.board.Square;

public class PieceMove {
    public Square fromSquare;
    public Square toSquare;

    public PieceMove(Square f, Square t) {
        fromSquare = f;
        toSquare = t;
    }
}
