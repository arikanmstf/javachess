package com.javachess;

import com.javachess.pieces.Piece;

import javax.swing.JPanel;
import java.awt.Color;

public class Square extends JPanel {
    public Piece piece = new Piece();
    public Square(Color color) {
        super();
        this.initialize(color);
    }

    private void initialize(Color color) {

        this.setOpaque(true);
        this.setBackground(color);
        this.setPreferredSize(Constants.SquareSize);
        this.setMaximumSize(Constants.SquareSize);
        this.setMinimumSize(Constants.SquareSize);
        this.add(piece.iconLabel);
        this.revalidate();
        this.setVisible(true);
    }
}
