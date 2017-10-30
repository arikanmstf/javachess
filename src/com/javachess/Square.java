package com.javachess;

import com.javachess.pieces.Piece;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
;

public class Square extends JPanel {
    public Piece piece = new Piece();
    public Square(Color color) {
        super(new GridLayout());


        this.initialize(color);
    }

    private void initialize(Color color) {

        this.add(piece.iconLabel);
        this.setOpaque(true);
        this.setBackground(color);
        this.setPreferredSize(Constants.SquareSize);
        this.setMaximumSize(Constants.SquareSize);
        this.setMinimumSize(Constants.SquareSize);
        this.revalidate();
        this.setVisible(true);
    }
}
