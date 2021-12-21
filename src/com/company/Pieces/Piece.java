package com.company.Pieces;

public abstract class Piece {

    private String outputCode;
    private final boolean isWhite;

    public Piece (boolean isWhite) {

        this.isWhite = isWhite;
    }

    public String getOutputCode() {
        return this.outputCode;
    }

    public boolean getIsWhite () {
        return this.isWhite;
    }
}
