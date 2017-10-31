package com.javachess.pieces;

import com.javachess.Constants;

import java.util.List;

public class PiecePawn extends Piece implements PieceInterface{
    public PiecePawn(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhitePawnPath : Constants.PieceBlackPawnPath);
    }
    @Override
    public List<PieceMove> getPossibleMoves() {
        int[] rowAndCol = getRowAndColFromIndex(index);
        List<PieceMove> moves = new PieceMoveList<>();

        // pawn moves depends on color, because pawns cant go back...
        // TODO: enpassant

        if(this.color.getColor()) { // if white piece
            // Pawn can move 2 square at first move
            if(rowAndCol[0] == 6){
                if (Piece.squares[index - 16].piece == null && Piece.squares[index - 8].piece == null) {
                    moves.add(new PieceMove(Piece.squares[index], Piece.squares[index - 16]));
                }
            }
            if (Piece.squares[index - 8].piece == null) {
                moves.add(new PieceMove(Piece.squares[index], Piece.squares[index - 8]));
            }
            // capture
            if (Piece.squares[index - 7].piece != null &&
                    Piece.squares[index - 7].piece.color.getColor() != this.color.getColor()) {
                moves.add(new PieceMove(Piece.squares[index], Piece.squares[index - 7]));
            }
            if (Piece.squares[index - 9].piece != null &&
                    Piece.squares[index - 9].piece.color.getColor() != this.color.getColor()) {
                moves.add(new PieceMove(Piece.squares[index], Piece.squares[index - 9]));
            }
        } else { // if black piece
            // Pawn can move 2 square at first move
            if(rowAndCol[0] == 1){
                if (Piece.squares[index + 16].piece == null && Piece.squares[index + 8].piece == null) {
                    moves.add(new PieceMove(Piece.squares[index], Piece.squares[index + 16]));
                }
            }
            if(Piece.squares[index + 8].piece == null) {
                moves.add(new PieceMove(Piece.squares[index], Piece.squares[index + 8]));
            }
            // capture
            if (Piece.squares[index + 7].piece != null &&
                    Piece.squares[index + 7].piece.color.getColor() != this.color.getColor()) {
                moves.add(new PieceMove(Piece.squares[index], Piece.squares[index + 7]));
            }
            if (Piece.squares[index + 9].piece != null &&
                    Piece.squares[index + 9].piece.color.getColor() != this.color.getColor()) {
                moves.add(new PieceMove(Piece.squares[index], Piece.squares[index + 9]));
            }
        }

        return moves;
    }
}
