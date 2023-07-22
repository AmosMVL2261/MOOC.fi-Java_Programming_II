package ticTacToe;

import javafx.scene.control.Label;

public class TurnLogic {

    private String turn;
    private int freeCell;
    private Label status;
    private GameGrid grid;
    private int counter;

    public TurnLogic(Label status, GameGrid grid) {
        this.turn = "X";
        this.freeCell = 8;
        this.status = status;
        this.grid = grid;
        this.counter = 0;
    }

    public void setFreeCell(int freeCell) {
        this.freeCell = freeCell;
    }

    public int getFreeCell() {
        return freeCell;
    }

    public String getTurn() {
        return turn;
    }

    public void nextTurn() {
        if (this.turn.equals("X")) {
            if (this.grid.checkWin()) {
                status.setText("The end!");
            } else {
                turn = "O";
                status.setText("Turn: " + turn);
            }
        } else {
            if (this.grid.checkWin()) {
                status.setText("The end!");
            } else {
                turn = "X";
                status.setText("Turn: " + turn);
            }
        }
    }

}