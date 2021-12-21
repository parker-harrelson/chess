package com.company.Pieces;

public class Knight extends Piece{

    private final String outputCode;

    public Knight(boolean isWhite) {
        super(isWhite);

        if (isWhite) this.outputCode = "\u2658 ";
        else this.outputCode = "\u265E ";
    }

    public String getOutputCode () {
        return this.outputCode;
    }
}
