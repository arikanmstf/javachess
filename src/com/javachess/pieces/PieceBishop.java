package com.javachess.pieces;

import com.javachess.Constants;

public class PieceBishop extends Piece {
    public PieceBishop(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteBishopPath : Constants.PieceBlackBishopPath);
    }
}
