package com.javachess.pieces;

import com.javachess.Constants;
import com.javachess.board.PiecePosition;
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
import java.util.ArrayList;
import java.util.List;

public class Piece implements PieceInterface{
    public JLabel iconLabel;
    private PieceColor color;
    protected static List<PiecePosition> piecePositions;
    protected Square square;

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
                int [] rowAndCol = getRowAndColFromIndex(square.index);
                System.out.println(rowAndCol[0]);
                System.out.println(rowAndCol[1]);
                showPossibleMoves();
            }
        });
    }
    protected static int[] getRowAndColFromIndex(Integer index) {
        int j = index % 8;
        int i = index/8;
        int [] rowAndCol = new int[2];
        rowAndCol[0] = i;
        rowAndCol[1] = j;
        return rowAndCol;
    }
    public static void setPiecePositions(List<PiecePosition> p) {
        piecePositions = p;
    }

    @Override
    public List<PieceMove> getPossibleMoves() {
        return new ArrayList<>();
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
    public void setSquare(Square s) {
        square = s;
    }
    public void showPossibleMoves() {
        List<PieceMove> pieceMoves = getPossibleMoves();
        for (PieceMove object: pieceMoves) {
            object.toSquare.setBackground(Color.magenta);
        }
    }
}
