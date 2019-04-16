package com.example.tetris;

import android.widget.GridLayout;
import android.widget.ImageView;

public class Board {
    private GridLayout board;

    private ImageView[][] blocks = new ImageView[20][10];

    @Override
    protected void onCreate(final Bundle savedInstanceState){
        board.setColumnCount(10);
        board.setRowCount(20);
    }
}
