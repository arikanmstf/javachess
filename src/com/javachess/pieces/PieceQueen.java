package com.javachess.pieces;

import com.javachess.Constants;

public class PieceQueen extends Piece {
    public PieceQueen(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteQueenPath : Constants.PieceBlackQueenPath);
    }
}
