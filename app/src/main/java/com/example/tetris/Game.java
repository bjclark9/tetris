package com.example.tetris;

public class Game {
    private int[][] board;

    public Game(final int[][] array) {
        board = array;
    }

    private class Block {
        int type;
        public Block(final int set) {
            type = set;
        }
    }

    private class Tetrimino {

    }
}
