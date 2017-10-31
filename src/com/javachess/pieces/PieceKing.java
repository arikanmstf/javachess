package com.javachess.pieces;

import com.javachess.Constants;

import java.util.List;

public class PieceKing extends Piece implements PieceInterface  {

    public PieceKing(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteKingPath : Constants.PieceBlackKingPath);
    }

    @Override
    public List<PieceMove> getPossibleMoves() {
        List<PieceMove> moves = new PieceMoveList<>();
        int[] rowAndCol = getRowAndColFromIndex(index);

        // check each possible square if exists, before add. Else, null pointer exception.

        if (rowAndCol[0] < 7) {
            moves.add(new PieceMove(Piece.squares[index], Piece.squares[((rowAndCol[0]+1) *8) + rowAndCol[1]]));
            if (rowAndCol[1] > 0) {
                moves.add(new PieceMove(Piece.squares[index], Piece.squares[((rowAndCol[0]+1) *8) + rowAndCol[1] -1]));
            }
            if (rowAndCol[1] < 7) {
                moves.add(new PieceMove(Piece.squares[index], Piece.squares[((rowAndCol[0]+1) *8) + rowAndCol[1] +1]));
            }
        }
        if (rowAndCol[0] > 0) {
            moves.add(new PieceMove(Piece.squares[index], Piece.squares[((rowAndCol[0]-1) *8) + rowAndCol[1]]));
            if (rowAndCol[1] > 0) {
                moves.add(new PieceMove(Piece.squares[index], Piece.squares[((rowAndCol[0]-1) *8) + rowAndCol[1] -1]));
            }
            if (rowAndCol[1] < 7) {
                moves.add(new PieceMove(Piece.squares[index], Piece.squares[((rowAndCol[0]-1) *8) + rowAndCol[1] +1]));
            }
        }
        if (rowAndCol[1] > 0) {
            moves.add(new PieceMove(Piece.squares[index], Piece.squares[((rowAndCol[0]) *8) + rowAndCol[1] -1]));
        }
        if (rowAndCol[1] < 7) {
            moves.add(new PieceMove(Piece.squares[index], Piece.squares[((rowAndCol[0]) *8) + rowAndCol[1] +1]));
        }

        // Castling
        if (this.neverMoved) { // First condition: king should have never moved
            if (this.color.getColor()) { // White King
                // Queen side Castling
                // Piece should have never moved and should be instance of PieceRook and other squares must be empty
                if (Piece.squares[56].piece.neverMoved && Piece.squares[56].piece instanceof PieceRook &&
                        Piece.squares[57].piece == null && Piece.squares[58].piece == null && Piece.squares[59].piece == null
                        ) {
                    moves.add(new CastlingPieceMove(Piece.squares[index], Piece.squares[57], CastlingPieceMove.QUEEN_SIDE_WHITE));
                }
                // King side Castling
                if (Piece.squares[63].piece.neverMoved && Piece.squares[63].piece instanceof PieceRook &&
                        Piece.squares[61].piece == null && Piece.squares[62].piece == null) {
                    moves.add(new CastlingPieceMove(Piece.squares[index], Piece.squares[62], CastlingPieceMove.KING_SIDE_WHITE));
                }
            } else { // Black King
                // Queen side Castling
                // Piece should have never moved and should be instance of PieceRook and other squares must be empty
                if (Piece.squares[0].piece.neverMoved && Piece.squares[0].piece instanceof PieceRook &&
                        Piece.squares[1].piece == null && Piece.squares[2].piece == null && Piece.squares[3].piece == null
                        ) {
                    moves.add(new CastlingPieceMove(Piece.squares[index], Piece.squares[1], CastlingPieceMove.QUEEN_SIDE_BLACK));
                }
                // King side Castling
                if (Piece.squares[7].piece.neverMoved && Piece.squares[7].piece instanceof PieceRook &&
                        Piece.squares[5].piece == null && Piece.squares[6].piece == null) {
                    moves.add(new CastlingPieceMove(Piece.squares[index], Piece.squares[6], CastlingPieceMove.KING_SIDE_BLACK));
                }
            }
        }

        return moves;
    }
}
