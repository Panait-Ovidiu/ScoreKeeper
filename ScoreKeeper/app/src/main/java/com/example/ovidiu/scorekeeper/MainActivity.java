package com.example.ovidiu.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int foulTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamB = 0;
    int yellowTeamA = 0;
    int redTeamA = 0;
    int yellowTeamB = 0;
    int redTeamB = 0;

    private Integer images[] = {R.drawable.goalleft, R.drawable.goalright, R.drawable.goalempty};
    private int currImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds 3 Points to the score for Team A.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addFoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulTeamA(foulTeamA);
    }

    /**
     * Adds 2 Points to the score for Team A.
     */
    public void addYellowCardTeamA(View v) {
        yellowTeamA = yellowTeamA + 1;
        displayYellowTeamA(yellowTeamA);
    }

    /**
     * Adds 1 Points to the score for Team A.
     */
    public void addRedCardTeamA(View v) {
        redTeamA = redTeamA + 1;
        displayRedTeamA(redTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        currImage = 2;
        setCurrentImageRight();
        currImage = 0;
        setCurrentImageLeft();
    }

    public void displayFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_nr_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redTeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 Points to the score for Team B.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addFoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulTeamB(foulTeamB);
    }

    /**
     * Adds 2 Points to the score for Team B.
     */
    public void addYellowCardTeamB(View v) {
        yellowTeamB = yellowTeamB + 1;
        displayYellowTeamB(yellowTeamB);
    }

    /**
     * Adds 1 Points to the score for Team A.
     */
    public void addRedCardTeamB(View v) {
        redTeamB = redTeamB + 1;
        displayRedTeamB(redTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        currImage = 2;
        setCurrentImageLeft();
        currImage = 1;
        setCurrentImageRight();
    }

    public void displayFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_nr_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redTeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets score for Team A and Team B.
     */
    public void resetScore(View v) {

        scoreTeamA = 0;
        foulTeamA = 0;
        yellowTeamA = 0;
        redTeamA = 0;

        displayForTeamA(scoreTeamA);
        displayYellowTeamA(yellowTeamA);
        displayRedTeamA(redTeamA);
        displayFoulTeamA(foulTeamA);


        scoreTeamB = 0;
        foulTeamB = 0;
        yellowTeamB = 0;
        redTeamB = 0;

        displayForTeamB(scoreTeamB);
        displayYellowTeamB(yellowTeamB);
        displayRedTeamB(redTeamB);
        displayFoulTeamB(foulTeamB);

        currImage = 2;
        setCurrentImageLeft();
        setCurrentImageRight();
    }

    private void setCurrentImageLeft() {

        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay1);
        imageView.setImageResource(images[currImage]);
    }

    private void setCurrentImageRight() {

        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay2);
        imageView.setImageResource(images[currImage]);
    }
}
