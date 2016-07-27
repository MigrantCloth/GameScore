package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.gamescore.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the +3 button is clicked for Team A.
     */
    public void teamAPlus3(View view) {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * This method is called when the +2 button is clicked for Team A.
     */
    public void teamAPlus2 (View view) {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * This method is called when the Free Throw button is clicked for Team A.
     */
    public void teamAPlus1 (View view) {
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * This method is called when the +3 button is clicked for Team B.
     */
    public void teamBPlus3(View view) {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * This method is called when the +2 button is clicked for Team B.
     */
    public void teamBPlus2 (View view) {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * This method is called when the Free Throw button is clicked for Team B.
     */
    public void teamBPlus1 (View view) {
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * This method is called when the reset button is clicked.
     */
    public void reset (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
