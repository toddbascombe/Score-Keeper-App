package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int homeTeam = 0;
    int awayTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void touchDownForHome(View v) {
        homeTeam += 6;
        displayForHome(homeTeam);
    }

    public void touchDownAway(View v) {
        awayTeam += 6;
        displayForAway(awayTeam);
    }

    public void kickAwayPoint(View v) {
        awayTeam += 1;
        displayForAway(awayTeam);
    }

    public void kickHome(View v) {
        homeTeam += 1;
        displayForHome(homeTeam);
    }

    public void twoPointConversion(View v) {
        homeTeam += 2;
        displayForHome(homeTeam);
    }

    public void twoPointConversionAway(View v) {
        awayTeam += 2;
        displayForAway(awayTeam);
    }


    public void FieldGoalAway(View v) {
        awayTeam += 3;
        displayForAway(awayTeam);
    }

    public void FieldGoalHome(View v) {
        homeTeam += 3;
        displayForHome(homeTeam);
    }

    public void SafetyHome(View v) {
        homeTeam += 2;
        displayForHome(homeTeam);
    }

    public void SafetyAway(View v) {
        awayTeam += 2;
        displayForAway(awayTeam);
    }

    public void reset(View v) {
        homeTeam = 0;
        awayTeam = 0;
        displayForHome(homeTeam);
        displayForAway(awayTeam);
    }

    public void displayForHome(int score) {
        TextView text = (TextView) findViewById(R.id.home_score);
        text.setText(String.valueOf(score));
    }

    public void displayForAway(int score) {
        TextView text = (TextView) findViewById(R.id.away_score);
        text.setText(String.valueOf(score));
    }
}
