package com.javachess.pieces;

import com.javachess.Constants;

import java.util.List;

public class PieceKnight extends Piece implements PieceInterface {
    public PieceKnight(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteKnightPath : Constants.PieceBlackKnightPath);
    }

    @Override
    public List<PieceMove> getPossibleMoves() {
        int index = this.square.index;
        List<PieceMove> moves = new PieceMoveList<>();
        int[] rowAndCol = getRowAndColFromIndex(index);

        // check each possible square if exists, before add. Else, null pointer exception.

        if (rowAndCol[0] < 7) {
            if (rowAndCol[0] < 6) {
                if (rowAndCol[1] > 0) {
                    moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]+2) *8) + rowAndCol[1] -1]));
                }
                if (rowAndCol[1] < 7) {
                    moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]+2) *8) + rowAndCol[1] +1]));
                }
            }
            if (rowAndCol[1] < 6) {
                moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]+1) *8) + rowAndCol[1] +2]));
            }
            if (rowAndCol[1] > 1) {
                moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]+1) *8) + rowAndCol[1] -2]));
            }
        }
        if (rowAndCol[0] > 0){
            if (rowAndCol[1] < 6) {
                moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]-1) *8) + rowAndCol[1] +2]));
            }
            if (rowAndCol[1] > 1) {
                moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]-1) *8) + rowAndCol[1] -2]));
            }
            if (rowAndCol[0] > 2) {
                if (rowAndCol[1] > 0) {
                    moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]-2) *8) + rowAndCol[1] -1]));
                }
                if (rowAndCol[1] < 7) {
                    moves.add(new PieceMove(this.square, Piece.squares[((rowAndCol[0]-2) *8) + rowAndCol[1] +1]));
                }
            }
        }

        return moves;
    }
}
