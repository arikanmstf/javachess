package com.javachess.pieces;

import java.util.ArrayList;

public class PieceMoveList<E> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        if (e instanceof PieceMove) {
            if (isMoveValid( (PieceMove) e)) {
                return super.add(e);
            }
        }
        return false;
    }
    private boolean isMoveValid(PieceMove pm) {
        if(pm.toSquare.piece != null && pm.fromSquare.piece.color.getColor() == pm.toSquare.piece.color.getColor()) {
            return false;
        }
        return true;
    }
}
