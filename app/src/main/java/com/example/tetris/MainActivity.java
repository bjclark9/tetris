package com.example.tetris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.tetris.Game;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.RightButton).setVisibility(View.INVISIBLE);
        findViewById(R.id.LeftButton).setVisibility(View.INVISIBLE);
        findViewById(R.id.DownButton).setVisibility(View.INVISIBLE);
        findViewById(R.id.RotateLButton).setVisibility(View.INVISIBLE);
        findViewById(R.id.RotateRButton).setVisibility(View.INVISIBLE);
        findViewById(R.id.Score).setVisibility(View.INVISIBLE);
        findViewById(R.id.ScoreText).setVisibility(View.INVISIBLE);
        findViewById(R.id.NewGameButton).setVisibility(View.VISIBLE);
        Button newGame = findViewById(R.id.NewGameButton);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
            }
        });
        Button right = findViewById(R.id.RightButton);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightButton();
            }
        });
        Button left = findViewById(R.id.LeftButton);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftButton();
            }
        });
        Button down = findViewById(R.id.DownButton);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downButton();
            }
        });
        Button rotateR = findViewById(R.id.RotateRButton);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateRightButton();
            }
        });
        Button rotateL = findViewById(R.id.RotateLButton);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateLeftButton();
            }
        });
    }

    private void newGame() {
        findViewById(R.id.RightButton).setVisibility(View.VISIBLE);
        findViewById(R.id.LeftButton).setVisibility(View.VISIBLE);
        findViewById(R.id.DownButton).setVisibility(View.VISIBLE);
        findViewById(R.id.RotateLButton).setVisibility(View.VISIBLE);
        findViewById(R.id.RotateRButton).setVisibility(View.VISIBLE);
        findViewById(R.id.Score).setVisibility(View.VISIBLE);
        findViewById(R.id.ScoreText).setVisibility(View.VISIBLE);
        findViewById(R.id.NewGameButton).setVisibility(View.INVISIBLE);
        runGame();
    }

    private void runGame() {
        Game game = new Game(new int[20][10]);
    }

    private void rightButton() {

    }

    private void leftButton() {

    }

    private void downButton() {

    }

    private void rotateRightButton() {

    }

    private void rotateLeftButton() {

    }
}
