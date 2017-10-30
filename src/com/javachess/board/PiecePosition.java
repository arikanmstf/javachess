package com.javachess.board;

import com.javachess.pieces.Piece;

public class PiecePosition {
    Square square;
    Piece piece;
    public PiecePosition(Square s, Piece p) {
        square = s;
        piece = p;
        square.add(piece.iconLabel);
        square.revalidate();
    }
}
