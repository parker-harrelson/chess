package com.company.Pieces;

public class Queen extends Piece {

    private final String outputCode;

    public Queen(boolean isWhite) {
        super(isWhite);

        if (isWhite) this.outputCode = "\u2654 ";
        else this.outputCode = "\u265B ";
    }

    public String getOutputCode() {
        return this.outputCode;
    }
}
