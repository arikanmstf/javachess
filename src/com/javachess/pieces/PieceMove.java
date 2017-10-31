package com.javachess.pieces;

import com.javachess.board.Square;

public class PieceMove {
    Square fromSquare;
    Square toSquare;

    public PieceMove(Square f, Square t) {
        fromSquare = f;
        toSquare = t;
    }
    public void run() {
        toSquare.setPiece(fromSquare.piece);
        fromSquare.empty();
    }
}
