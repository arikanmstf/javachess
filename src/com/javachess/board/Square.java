package com.javachess.board;

import com.javachess.Constants;
import com.javachess.pieces.Piece;

import javax.swing.JPanel;
import java.awt.Color;

public class Square extends JPanel {
    public Integer index;
    public Piece piece;
    public Square(Color color, Integer i) {
        super();
        index = i;
        initialize(color);
    }

    public void setPiece( Piece p) {
        piece = p;
        add(piece.iconLabel);
        revalidate();
    }

    private void initialize(Color color) {

        setOpaque(true);
        setBackground(color);
        setPreferredSize(Constants.SquareSize);
        setMaximumSize(Constants.SquareSize);
        setMinimumSize(Constants.SquareSize);
        setVisible(true);
    }
}
