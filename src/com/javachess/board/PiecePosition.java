package com.javachess.board;

import com.javachess.pieces.Piece;

public class PiecePosition {
    public Square square;
    public Piece piece;
    public PiecePosition(Square s, Piece p) {
        square = s;
        piece = p;
        piece.setSquare(square);
        square.add(piece.iconLabel);
        square.revalidate();
    }
}
