package com.company.Pieces;

public class Pawn extends Piece{

    private final String outputCode;

    public Pawn(boolean isWhite) {
        super(isWhite);

        if (isWhite) this.outputCode = "\u2659 ";
        else this.outputCode = "\u265F ";
    }

    public String getOutputCode () {
        return this.outputCode;
    }
}
