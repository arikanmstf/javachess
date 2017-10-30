package com.javachess.pieces;

import com.javachess.Constants;

public class PieceKnight extends Piece {
    public PieceKnight(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteKnightPath : Constants.PieceBlackKnightPath);
    }
}
