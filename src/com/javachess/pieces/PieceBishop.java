package com.javachess.pieces;

import com.javachess.Constants;
import com.javachess.board.Square;

import java.util.List;

public class PieceBishop extends Piece implements PieceInterface {
    public PieceBishop(PieceColor pieceColor) {
        super(pieceColor, pieceColor.getColor() ? Constants.PieceWhiteBishopPath : Constants.PieceBlackBishopPath);
    }

    @Override
    public List<PieceMove> getPossibleMoves() {
        // moves calculation at another method because will be used by PieceQueen
        return PieceBishop.calculatePossibleMoves(Piece.squares[index]);
    }
    public static List<PieceMove> calculatePossibleMoves(Square square) {
        int index = square.index;
        int[] rowAndCol = getRowAndColFromIndex(index);

        List<PieceMove> moves = new PieceMoveList<>();
        for (int i = rowAndCol[1] - 1, j = rowAndCol[0] - 1; i >= 0 && j >= 0; i--, j--) { // move left top (white perspective)
            if (Piece.squares[(j*8)+i].piece == null) {
                moves.add(new PieceMove(square, Piece.squares[(j*8)+i]));
            } else if (square.piece.color.getColor() != Piece.squares[(j*8)+i].piece.color.getColor()){
                moves.add(new PieceMove(square, Piece.squares[(j*8)+i]));
                break;
            } else break;
        }

        for (int i = rowAndCol[1] + 1, j = rowAndCol[0] + 1; i <= 7 && j <= 7; i++, j++) { // move right bottom (white perspective)
            if (Piece.squares[(j*8)+i].piece == null) {
                moves.add(new PieceMove(square, Piece.squares[(j*8)+i]));
            } else if (square.piece.color.getColor() != Piece.squares[(j*8)+i].piece.color.getColor()) {
                moves.add(new PieceMove(square, Piece.squares[(j*8)+i]));
                break;
            } else break;
        }

        for (int i = rowAndCol[1] + 1, j = rowAndCol[0] - 1; i <= 7 && j >= 0; i++, j--) { // move right top (white perspective)
            if (Piece.squares[(j*8)+i].piece == null) {
                moves.add(new PieceMove(square, Piece.squares[(j*8)+i]));
            } else if (square.piece.color.getColor() != Piece.squares[(j*8)+i].piece.color.getColor()) {
                moves.add(new PieceMove(square, Piece.squares[(j*8)+i]));
                break;
            } else break;
        }

        for (int i = rowAndCol[1] - 1, j = rowAndCol[0] + 1; i >= 0 && j <= 7; i--, j++) { // move left bottom (white perspective)
            if (Piece.squares[(j*8)+i].piece == null) {
                moves.add(new PieceMove(square, Piece.squares[(j*8)+i]));
            } else if (square.piece.color.getColor() != Piece.squares[(j*8)+i].piece.color.getColor()) {
                moves.add(new PieceMove(square, Piece.squares[(j*8)+i]));
                break;
            } else break;
        }

        return moves;
    }
}
