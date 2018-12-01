package com.example.yasmine.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreAView = (TextView) findViewById(R.id.scoreA);
        scoreAView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team A by 1 point.
     */

    public void displayForTeamB(int score) {
        TextView scoreBView = (TextView) findViewById(R.id.scoreB);
        scoreBView.setText(String.valueOf(score));
    }

    int scoreA=0;

    public void addOneForTeamA(View v) {
        scoreA = scoreA +1;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreA = scoreA +2;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreA = scoreA +3;
        displayForTeamA(scoreA);
    }

    int scoreB=0;

    public void addOneForTeamB(View v) {
        scoreB = scoreB +1;
        displayForTeamB(scoreB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreB = scoreB +2;
        displayForTeamB(scoreB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreB = scoreB +3;
        displayForTeamB(scoreB);
    }

    public void reset(View v){



        displayForTeamA(0);
        displayForTeamB(0);
    }
}