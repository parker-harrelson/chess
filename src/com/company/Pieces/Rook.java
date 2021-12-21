package com.company.Pieces;

public class Rook extends Piece {

    private final String outputCode;

    public Rook(boolean isWhite) {
        super(isWhite);

        if (isWhite) this.outputCode = "\u2656 ";
        else this.outputCode = "\u265C ";
    }

    public String getOutputCode() {
        return this.outputCode;
    }
}
