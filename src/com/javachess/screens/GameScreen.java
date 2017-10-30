package com.javachess.screens;

import com.javachess.Constants;
import com.javachess.board.GamePosition;
import com.javachess.board.PiecePosition;
import com.javachess.board.Square;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class GameScreen {
    public Square[] squares = new Square[64];
    public GameScreen(JPanel parentPanel) {
        JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(-5, -5, 0, 0));
        mainPanel.setBackground(Color.BLUE);

        JPanel panel1 = new JPanel(new GridLayout(8, 8));
        panel1.setPreferredSize(Constants.BoardPanelSize);
        panel1.setMaximumSize(Constants.BoardPanelSize);
        panel1.setMinimumSize(Constants.BoardPanelSize);
        panel1.setBorder(Constants.zeroPadding);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Integer index = (i*8)+j;
                Color color = ((i % 2 == 0) && (j % 2 == 0) || (i % 2 == 1) && (j % 2 == 1)) ?
                        Constants.LightSquareColor : Constants.DarkSquareColor;
                Square square = new Square(color, index);
                panel1.add(square);
                square.setVisible(true);
                squares[index] = square;
            }
        }
        new GamePosition(squares);
        panel1.revalidate();

        mainPanel.add(panel1);
        mainPanel.revalidate();

        parentPanel.add(mainPanel);
        parentPanel.revalidate();
    }
}
