package com.javachess.board;

import com.javachess.pieces.Piece;
import com.javachess.pieces.PieceBishop;
import com.javachess.pieces.PieceColor;
import com.javachess.pieces.PieceKing;
import com.javachess.pieces.PieceKnight;
import com.javachess.pieces.PiecePawn;
import com.javachess.pieces.PieceQueen;
import com.javachess.pieces.PieceRook;

public class GamePosition {
    public GamePosition(Square[] squares) {
        startPosition(squares);
    }
    private void startPosition(Square[] squares) {
        Piece.setSquares(squares);
        squares[0].setPiece(new PieceRook(new PieceColor(false)));
        //squares[1].setPiece(new PieceKnight(new PieceColor(false)));
        //squares[2].setPiece(new PieceBishop(new PieceColor(false)));
        //squares[3].setPiece(new PieceQueen(new PieceColor(false)));
        squares[4].setPiece(new PieceKing(new PieceColor(false)));
        //squares[5].setPiece(new PieceBishop(new PieceColor(false)));
        //squares[6].setPiece(new PieceKnight(new PieceColor(false)));
        squares[7].setPiece(new PieceRook(new PieceColor(false)));

        squares[8].setPiece(new PiecePawn(new PieceColor(false)));
        squares[9].setPiece(new PiecePawn(new PieceColor(false)));
        squares[10].setPiece(new PiecePawn(new PieceColor(false)));
        squares[11].setPiece(new PiecePawn(new PieceColor(false)));
        squares[12].setPiece(new PiecePawn(new PieceColor(false)));
        squares[13].setPiece(new PiecePawn(new PieceColor(false)));
        squares[14].setPiece(new PiecePawn(new PieceColor(false)));
        squares[15].setPiece(new PiecePawn(new PieceColor(false)));

        squares[48].setPiece(new PiecePawn(new PieceColor()));
        squares[49].setPiece(new PiecePawn(new PieceColor()));
        squares[50].setPiece(new PiecePawn(new PieceColor()));
        squares[51].setPiece(new PiecePawn(new PieceColor()));
        squares[52].setPiece(new PiecePawn(new PieceColor()));
        squares[53].setPiece(new PiecePawn(new PieceColor()));
        squares[54].setPiece(new PiecePawn(new PieceColor()));
        squares[55].setPiece(new PiecePawn(new PieceColor()));

        squares[56].setPiece(new PieceRook(new PieceColor()));
        // squares[57].setPiece(new PieceKnight(new PieceColor()));
        // squares[58].setPiece(new PieceBishop(new PieceColor()));
        // squares[59].setPiece(new PieceQueen(new PieceColor()));
        squares[60].setPiece(new PieceKing(new PieceColor()));
        //squares[61].setPiece(new PieceBishop(new PieceColor()));
        //squares[62].setPiece(new PieceKnight(new PieceColor()));
        squares[63].setPiece(new PieceRook(new PieceColor()));
    }
}
