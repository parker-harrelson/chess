package com.company.Gameboard;

import com.company.Pieces.Piece;

public class Cell {

    private Piece piece;

    public Cell (Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void setPiece (Piece piece) {
        this.piece = piece;
    }
}
