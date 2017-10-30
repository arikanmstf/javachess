package com.javachess.board;

import com.javachess.pieces.PieceBishop;
import com.javachess.pieces.PieceColor;
import com.javachess.pieces.PieceKing;
import com.javachess.pieces.PieceKnight;
import com.javachess.pieces.PiecePawn;
import com.javachess.pieces.PieceQueen;
import com.javachess.pieces.PieceRook;

import java.util.ArrayList;
import java.util.List;

public class GamePosition {
    List<PiecePosition> piecePositions = new ArrayList<>();
    public GamePosition(Square[] squares) {
        startPosition(squares);
    }
    private void startPosition(Square[] squares) {
        piecePositions.add( new PiecePosition(squares[0], new PieceRook(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[1], new PieceKnight(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[2], new PieceBishop(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[3], new PieceQueen(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[4], new PieceKing(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[5], new PieceBishop(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[6], new PieceKnight(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[7], new PieceRook(new PieceColor(false))));

        piecePositions.add( new PiecePosition(squares[8], new PiecePawn(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[9], new PiecePawn(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[10], new PiecePawn(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[11], new PiecePawn(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[12], new PiecePawn(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[13], new PiecePawn(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[14], new PiecePawn(new PieceColor(false))));
        piecePositions.add( new PiecePosition(squares[15], new PiecePawn(new PieceColor(false))));

        piecePositions.add( new PiecePosition(squares[48], new PiecePawn(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[49], new PiecePawn(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[50], new PiecePawn(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[51], new PiecePawn(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[52], new PiecePawn(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[53], new PiecePawn(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[54], new PiecePawn(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[55], new PiecePawn(new PieceColor())));

        piecePositions.add( new PiecePosition(squares[56], new PieceRook(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[57], new PieceKnight(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[58], new PieceBishop(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[59], new PieceQueen(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[60], new PieceKing(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[61], new PieceBishop(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[62], new PieceKnight(new PieceColor())));
        piecePositions.add( new PiecePosition(squares[63], new PieceRook(new PieceColor())));

    }
}
