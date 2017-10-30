package com.javachess.pieces;

import com.javachess.Constants;

public class PieceRook extends Piece{
    public PieceRook(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteRookPath : Constants.PieceBlackRookPath);
    }
}
