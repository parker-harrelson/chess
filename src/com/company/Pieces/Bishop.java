package com.company.Pieces;

public class Bishop extends Piece{

    private final String outputCode;

    public Bishop(boolean isWhite) {
        super(isWhite);

        if (isWhite) this.outputCode =  "\u2657 ";
        else this.outputCode = "\u265D ";
    }

    public String getOutputCode () {
        return this.outputCode;
    }
}
