package com.javachess;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Dimension;

public class Constants {
    private Constants() {
        // restrict instantiation
    }

    // Common
    public static final Border zeroPadding = BorderFactory.createEmptyBorder(0, 0, 0, 0);

    // Application
    public static final Integer ApplicationWidth = 800;
    public static final Integer ApplicationHeight = 600;
    public static final String ApplicationTitle = "Online Chess Application";
    public static final Boolean isResizable = true;
    public static final Color ApplicationBackground = new Color(95,186,120);

    // Login Screen
    public static final Integer LoginInputCols = 10;
    public static final String LoginScreenLabel = "Enter your username and password";

    // Game Screen
    public static final Color DarkSquareColor =  new Color(48, 107, 125);
    public static final Color LightSquareColor = new Color(239,239,239);
    public static final Dimension BoardPanelSize = new Dimension(480, 480);

    //Square
    public static final Dimension SquareSize = new Dimension(60, 60);

    // Piece
    public static final Integer PieceWidth = 40;
    public static final Integer PieceHeight = 40;
}
