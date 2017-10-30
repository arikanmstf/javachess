package com.javachess.pieces;

import com.javachess.Constants;
import com.javachess.board.Square;

import java.util.List;

public class PieceRook extends Piece implements PieceInterface {
    public PieceRook(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteRookPath : Constants.PieceBlackRookPath);
    }
    @Override
    public List<PieceMove> getPossibleMoves() {
        // moves calculation at another method because will be used by PieceQueen
        return PieceRook.calculatePossibleMoves(this.square);
    }

    public static List<PieceMove> calculatePossibleMoves(Square square) {
        int index = square.index;
        int[] rowAndCol = getRowAndColFromIndex(index);

        List<PieceMove> moves = new PieceMoveList<>();
        for (int i = rowAndCol[1] + 1; i <= 7; i++) { // move right (white perspective)
            if (Piece.squares[(rowAndCol[0]*8)+i].piece == null) {
                moves.add(new PieceMove(square, Piece.squares[(rowAndCol[0]*8)+i]));
            } else if (square.piece.color.getColor() != Piece.squares[(rowAndCol[0]*8)+i].piece.color.getColor()) {
                moves.add(new PieceMove(square, Piece.squares[(rowAndCol[0]*8)+i]));
                break;
            } else break;
        }

        for (int i = rowAndCol[1] - 1; i >= 0; i--) { // move left (white perspective)
            if (Piece.squares[(rowAndCol[0]*8)+i].piece == null) {
                moves.add(new PieceMove(square, Piece.squares[(rowAndCol[0]*8)+i]));
            } else if (square.piece.color.getColor() != Piece.squares[(rowAndCol[0]*8)+i].piece.color.getColor()) {
                moves.add(new PieceMove(square, Piece.squares[(rowAndCol[0]*8)+i]));
                break;
            } else break;
        }

        for (int i = rowAndCol[0] + 1; i <= 7; i++) { // move bottom (white perspective)
            if (Piece.squares[(i*8)+rowAndCol[1]].piece == null) {
                moves.add(new PieceMove(square, Piece.squares[(i*8)+rowAndCol[1]]));
            } else if (square.piece.color.getColor() != Piece.squares[(i*8)+rowAndCol[1]].piece.color.getColor()) {
                moves.add(new PieceMove(square, Piece.squares[(i*8)+rowAndCol[1]]));
                break;
            } else break;
        }

        for (int i = rowAndCol[0] - 1; i >= 0; i--) { // move top (white perspective)
            if (Piece.squares[(i*8)+rowAndCol[1]].piece == null) {
                moves.add(new PieceMove(square, Piece.squares[(i*8)+rowAndCol[1]]));
            } else if (square.piece.color.getColor() != Piece.squares[(i*8)+rowAndCol[1]].piece.color.getColor()) {
                moves.add(new PieceMove(square, Piece.squares[(i*8)+rowAndCol[1]]));
                break;
            } else break;
        }

        return moves;
    }
}
