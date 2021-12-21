package com.company.Pieces;

public class King extends Piece{

    private final String outputCode;

    public King(boolean isWhite) {
        super(isWhite);

        if (isWhite) this.outputCode = "\u2654 ";
        else this.outputCode = "\u265A ";
    }

    public String getOutputCode () {
        return this.outputCode;
    }
}
