package com.company.GameControls;

import com.company.Gameboard.Gameboard;

import java.util.Scanner;
import java.util.Stack;

public class Game {

    private final Stack<Move> undoStack = new Stack<>(), redoStack = new Stack<>();
    private final Scanner scanner = new Scanner(System.in);
    private final Gameboard gameboard;
    private final int numPlayers;


    public Game () {

        System.out.println("""
                -----------------
                Welcome to Chess!
                -----------------
                """);
        System.out.print("One or Two Players (enter 1 or 2): ");
        this.numPlayers = Integer.parseInt(scanner.nextLine());
        System.out.print("Player 1 White or Black (enter W or B): ");
        this.gameboard = new Gameboard(scanner.nextLine().equals("W"));

    }

    public void run() {

        System.out.print("\n");
        gameboard.printGameboard();
    }

    private void undo () {

        Move move;
        if (!undoStack.isEmpty()) {
            move = undoStack.pop();
            setGameState(move);
            redoStack.push(move);
        }

    }

    // TODO redo must be cleared after every move and should only have anything on it if undo has been called
    private void redo () {

        Move move;
        if (!redoStack.isEmpty()) {
            move = redoStack.pop();
            setGameState(move);
            undoStack.push(move);
        }
    }

    private void setGameState (Move move) {

    }

}
