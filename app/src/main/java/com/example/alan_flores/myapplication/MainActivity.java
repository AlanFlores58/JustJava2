package com.example.alan_flores.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamACounter=0;
    int teamBCounter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamACounter);
        displayForTeamB(teamBCounter);
    }

    private void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.Counter_Text_View);
        scoreView.setText(String.valueOf(score));
    }

    public void clickThree(View view){
        teamACounter = teamACounter + 3;
        displayForTeamA(teamACounter);
    }

    public void clickTwo(View view){
        teamACounter = teamACounter + 2;
        displayForTeamA(teamACounter);
    }

    public void clickOne(View view){
        teamACounter = teamACounter + 1;
        displayForTeamA(teamACounter);
    }
    private void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.CounterB_Text_View);
        scoreView.setText(String.valueOf(score));
    }

    public void clickThreeB(View view){
        teamBCounter = teamBCounter + 3;
        displayForTeamB(teamBCounter);
    }

    public void clickTwoB(View view){
        teamBCounter = teamBCounter + 2;
        displayForTeamB(teamBCounter);
    }

    public void clickOneB(View view){
        teamBCounter = teamBCounter + 1;
        displayForTeamB(teamBCounter);
    }

    public void clickReset(View view){
        teamACounter=0;
        teamBCounter=0;
        displayForTeamA(teamBCounter);
        displayForTeamB(teamBCounter);
    }
}
