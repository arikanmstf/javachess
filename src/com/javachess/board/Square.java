package com.javachess.board;

import com.javachess.Constants;
import com.javachess.pieces.PieceColor;
import com.javachess.pieces.PieceKing;
import javax.swing.JPanel;
import java.awt.Color;

public class Square extends JPanel {
    public PieceKing piece = new PieceKing(new PieceColor());
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
