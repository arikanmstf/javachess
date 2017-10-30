package com.javachess.pieces;

import com.javachess.Constants;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Piece {
    public JLabel iconLabel;

    private void setIconLabel() throws IOException {
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(getClass().getResource("/pcs/BlackKing.png").toURI()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        iconLabel = new JLabel(new ImageIcon(myPicture));
        Border border = iconLabel.getBorder();
        Border margin = new EmptyBorder(10,10,10,10);
        iconLabel.setBorder(new CompoundBorder(border, margin));
        iconLabel.setPreferredSize(Constants.SquareSize);
        iconLabel.setMaximumSize(Constants.SquareSize);
        iconLabel.setMinimumSize(Constants.SquareSize);

    }
    public Piece() {
        try {
            setIconLabel();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
