package com.javachess.pieces;

import com.javachess.Constants;

import java.util.ArrayList;
import java.util.List;

public class PieceKing extends Piece implements PieceInterface  {

    public PieceKing(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteKingPath : Constants.PieceBlackKingPath);
    }

    @Override
    public List<PieceMove> getPossibleMoves() {
        int index = this.square.index;
        int[] colAndRow = getRowAndColFromIndex(index);
        int col = colAndRow[0];
        int row = colAndRow[1];
        List<PieceMove> moves = new ArrayList<>();
        moves.add(new PieceMove(this.square, Piece.piecePositions.get(0).square));
        return moves;
    }
}
