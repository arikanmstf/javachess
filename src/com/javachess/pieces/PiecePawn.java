package com.javachess.pieces;

import com.javachess.Constants;

public class PiecePawn extends Piece {
    public PiecePawn(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhitePawnPath : Constants.PieceBlackPawnPath);
    }
}
