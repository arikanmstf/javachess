package com.javachess.pieces;

import com.javachess.Constants;
import com.javachess.board.Square;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Piece implements PieceInterface{
    public JLabel iconLabel;
    PieceColor color;
    static Square[] squares;
    int index;
    boolean neverMoved = true;

    private void setIconLabel(String pathToPiece) throws IOException {
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File(getClass().getResource(pathToPiece).toURI()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        iconLabel = new JLabel(new ImageIcon(getScaledImage(myPicture, Constants.PieceWidth, Constants.PieceHeight)));


    }
    private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }
    private void setAction() {
        iconLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                showPossibleMoves();
            }
        });
    }
    static int[] getRowAndColFromIndex(int index) {
        int j = index % 8;
        int i = index/8;
        int [] rowAndCol = new int[2];
        rowAndCol[0] = i;
        rowAndCol[1] = j;
        return rowAndCol;
    }
    public static void setSquares(Square[] s) {
        squares = s;
    }
    public void setIndex(int i) {
        index = i;
    }

    @Override
    public List<PieceMove> getPossibleMoves() {
        return new PieceMoveList<>();
    }
    public Piece(PieceColor pieceColor, String pathToPiece) {
        color = pieceColor;
        try {
            setIconLabel(pathToPiece);
            Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
            iconLabel.setCursor(cursor);
            setAction();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showPossibleMoves() {
        List<PieceMove> pieceMoves = getPossibleMoves();
        for (int i = 0; i < Piece.squares.length; i++) {
            if (Piece.squares[i].initialColor != Piece.squares[i].getBackground()){
                Piece.squares[i].setBackground(Piece.squares[i].initialColor);
            }
        }
        for (PieceMove object: pieceMoves) {
            object.toSquare.setBackground(Color.magenta);
        }
    }
}
