package com.javachess.pieces;

import com.javachess.Constants;
import java.util.List;

public class PieceQueen extends Piece implements PieceInterface {
    public PieceQueen(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteQueenPath : Constants.PieceBlackQueenPath);
    }
    @Override
    public List<PieceMove> getPossibleMoves() {
        // Queen move is the easiest ! join Bishop and Rook moves !
        List<PieceMove> moves = PieceBishop.calculatePossibleMoves(this.square);
        moves.addAll(PieceRook.calculatePossibleMoves(this.square));
        return moves;
    }
}
