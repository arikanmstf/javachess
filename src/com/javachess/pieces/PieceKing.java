package com.javachess.pieces;

import com.javachess.Constants;

public class PieceKing extends Piece {

    public PieceKing(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteKingPath : Constants.PieceBlackKingPath);
    }
}
