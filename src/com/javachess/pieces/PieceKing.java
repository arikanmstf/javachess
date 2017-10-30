package com.javachess.pieces;

import com.javachess.Constants;

import java.util.List;

public class PieceKing extends Piece implements PieceInterface  {

    public PieceKing(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteKingPath : Constants.PieceBlackKingPath);
    }

    @Override
    public List<PieceMove> getPossibleMoves() {
        int index = this.square.index;
        List<PieceMove> moves = new PieceMoveList<>();
        int[] rowAndCol = getRowAndColFromIndex(index);

        // check each possible square if exists, before add. Else, null pointer exception.

        if (rowAndCol[0] < 7) {
            moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]+1) *8) + rowAndCol[1]]));
            if (rowAndCol[1] > 0) {
                moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]+1) *8) + rowAndCol[1] -1]));
            }
            if (rowAndCol[1] < 7) {
                moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]+1) *8) + rowAndCol[1] +1]));
            }
        }
        if (rowAndCol[0] > 0) {
            moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]-1) *8) + rowAndCol[1]]));
            if (rowAndCol[1] > 0) {
                moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]-1) *8) + rowAndCol[1] -1]));
            }
            if (rowAndCol[1] < 7) {
                moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]-1) *8) + rowAndCol[1] +1]));
            }
        }
        if (rowAndCol[1] > 0) {
            moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]) *8) + rowAndCol[1] -1]));
        }
        if (rowAndCol[1] < 7) {
            moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]) *8) + rowAndCol[1] +1]));
        }

        return moves;
    }
}
