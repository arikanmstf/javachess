package com.javachess;

import com.javachess.screens.GameScreen;
import com.javachess.screens.LoginScreen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.CardLayout;

public class JavaChessOnline {
    public static void main(String[] args) {
        JFrame frame = new JFrame(Constants.ApplicationTitle);
        JPanel panel = new JPanel();
        panel.setBorder(Constants.zeroPadding);
        CardLayout card = new CardLayout();
        panel.setLayout(card);
        new LoginScreen(panel, card);
        new GameScreen(panel);
        frame.setContentPane(panel);
        frame.getContentPane().setBackground(Constants.ApplicationBackground);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(Constants.isResizable);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(Constants.ApplicationWidth, Constants.ApplicationHeight);
    }
}
