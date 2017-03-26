package com.greiner_co.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // private attributes
    private int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // My custom code
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score of Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 points to the score of Team A
     */
    public void addThreePointsToTeamA(View view) {
        displayForTeamA(3);
    }

    /**
     * Add 2 points to the score of Team A
     */
    public void addTwoPointsToTeamA(View view) {
        displayForTeamA(2);
    }

    /**
     * Add 1 point to the score of Team A
     */
    public void addFreeThrowPointToTeamA(View view) {
        displayForTeamA(1);
    }
}
