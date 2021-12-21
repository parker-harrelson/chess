package com.company.Gameboard;

import com.company.Pieces.*;

public class Gameboard {

    private static final Cell[][] board = new Cell[8][8];

    public Gameboard(boolean playerOneIsWhite) {

        board[0][0] = new Cell(new Rook(!playerOneIsWhite));
        board[0][1] = new Cell(new Knight(!playerOneIsWhite));
        board[0][2] = new Cell(new Bishop(!playerOneIsWhite));
        board[0][3] = new Cell(new Queen(!playerOneIsWhite));
        board[0][4] = new Cell(new King(!playerOneIsWhite));
        board[0][5] = new Cell(new Bishop(!playerOneIsWhite));
        board[0][6] = new Cell(new Knight(!playerOneIsWhite));
        board[0][7] = new Cell(new Rook(!playerOneIsWhite));
        board[1][0] = new Cell(new Pawn(!playerOneIsWhite));
        board[1][1] = new Cell(new Pawn(!playerOneIsWhite));
        board[1][2] = new Cell(new Pawn(!playerOneIsWhite));
        board[1][3] = new Cell(new Pawn(!playerOneIsWhite));
        board[1][4] = new Cell(new Pawn(!playerOneIsWhite));
        board[1][5] = new Cell(new Pawn(!playerOneIsWhite));
        board[1][6] = new Cell(new Pawn(!playerOneIsWhite));
        board[1][7] = new Cell(new Pawn(!playerOneIsWhite));
        board[6][0] = new Cell(new Pawn(playerOneIsWhite));
        board[6][1] = new Cell(new Pawn(playerOneIsWhite));
        board[6][2] = new Cell(new Pawn(playerOneIsWhite));
        board[6][3] = new Cell(new Pawn(playerOneIsWhite));
        board[6][4] = new Cell(new Pawn(playerOneIsWhite));
        board[6][5] = new Cell(new Pawn(playerOneIsWhite));
        board[6][6] = new Cell(new Pawn(playerOneIsWhite));
        board[6][7] = new Cell(new Pawn(playerOneIsWhite));
        board[7][0] = new Cell(new Rook(playerOneIsWhite));
        board[7][1] = new Cell(new Knight(playerOneIsWhite));
        board[7][2] = new Cell(new Bishop(playerOneIsWhite));
        board[7][3] = new Cell(new Queen(playerOneIsWhite));
        board[7][4] = new Cell(new King(playerOneIsWhite));
        board[7][5] = new Cell(new Bishop(playerOneIsWhite));
        board[7][6] = new Cell(new Knight(playerOneIsWhite));
        board[7][7] = new Cell(new Rook(playerOneIsWhite));

        for (int i = 2; i < 6; i++)
            for (int j = 0; j < board.length; j++)
                board[i][j] = new Cell(null);
    }

    public void printGameboard () {

        for (int i = 0; i < board.length; i++) {

            System.out.print("\n");
            System.out.println("--------------------------------------");

            for (int j = 0; j < board[i].length; j++) {

                System.out.print("| " + (board[i][j].getPiece() != null ? board[i][j].getPiece().getOutputCode() : " \u2001"));
            }

            System.out.print("|");
        }
        System.out.print("\n");
        System.out.println("--------------------------------------");
    }

}
