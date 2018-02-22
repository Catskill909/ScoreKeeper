package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0;
    int goalTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addGoalTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayGoalTeamA(goalTeamA);
    }

    public void addGoalTeamB(View view) {
        goalTeamB = goalTeamB + 1;
        displayGoalTeamB(goalTeamB);
    }

    public void addFoulTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulTeamA(foulTeamA);
    }

    public void addFoulTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulTeamB(foulTeamB);
    }


    public void displayGoalTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalTeamB(int score2) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score2));
    }

    public void displayFoulTeamA(int score3) {
        TextView scoreView = findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score3));
    }

    public void displayFoulTeamB(int score4) {
        TextView scoreView = findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score4));
    }

    public void resetAll(View view) {
        goalTeamA = 0;
        goalTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayGoalTeamA(goalTeamA);
        displayGoalTeamB(goalTeamB);
        displayFoulTeamA(foulTeamA);
        displayFoulTeamB(foulTeamB);
    }

}
