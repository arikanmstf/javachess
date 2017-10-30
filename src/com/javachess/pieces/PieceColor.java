package com.javachess.pieces;

public class PieceColor {
  private Boolean color; // 1 => white, 0 => black

  public PieceColor( Boolean isWhite) {
      color = isWhite;
  }
  public PieceColor() {
      color = true;
  }
  public Boolean getColor() {
      return color;
  }
}
