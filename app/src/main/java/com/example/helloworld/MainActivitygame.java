package com.example.helloworld;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivitygame extends AppCompatActivity {

    private int teamAScore;
    private int teamBScore;
    private TextView teamATextViewScore;
    private TextView teamBTextViewScore;

    protected void onCreate(Bundle savedInstanceState){
        setContentView(R.layout.game);
        super.onCreate(savedInstanceState);
        teamATextViewScore = findViewById(R.id.team_a_score);
        teamBTextViewScore=findViewById(R.id.team_b_score);
    }
    public void updateForTeamAPoint3(View view){
        teamAScore = teamAScore + 3;
        displayScoreTeamA(teamAScore);
    }
    public void updateForTeamAPoint2(View view){
        teamAScore = teamAScore + 2;
        displayScoreTeamA(teamAScore);
    }
    public void updateForTeamAPoint1(View view){
        teamAScore = teamAScore + 1;
        displayScoreTeamA(teamAScore);
    }

    public void updateForTeamBPoint3(View view){
        teamBScore = teamBScore + 3;
        displayScoreTeamB(teamBScore);
    }
    public void updateForTeamBPoint2(View view){
        teamBScore = teamBScore + 2;
        displayScoreTeamB(teamBScore);
    }
    public void updateForTeamBPoint1(View view){
        teamBScore = teamBScore + 1;
        displayScoreTeamB(teamBScore);
    }
    private void displayScoreTeamA(int score) {
        teamATextViewScore.setText(String.valueOf(score));
    }
    private void displayScoreTeamB(int score) {
        teamBTextViewScore.setText(String.valueOf(score));
    }
    public void reset(View v){
        teamAScore=0;
        teamBScore=0;
        displayScoreTeamB(0);
        displayScoreTeamA(0);

    }

}
