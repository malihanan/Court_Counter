package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3ForTeamA(View view) {
        scoreForTeamA += 3;
        displayForTeamA();
    }

    public void add2ForTeamA(View view) {
        scoreForTeamA += 2;
        displayForTeamA();
    }

    public void add1ForTeamA(View view) {
        scoreForTeamA += 1;
        displayForTeamA();
    }

    public void add3ForTeamB(View view) {
        scoreForTeamB += 3;
        displayForTeamB();
    }

    public void add2ForTeamB(View view) {
        scoreForTeamB += 2;
        displayForTeamB();
    }

    public void add1ForTeamB(View view) {
        scoreForTeamB += 1;
        displayForTeamB();
    }

    private void displayForTeamA() {
        TextView textViewForA = (TextView) findViewById(R.id.score_for_team_a);
        textViewForA.setText("" + scoreForTeamA);
    }

    private void displayForTeamB() {
        TextView textViewForB = (TextView) findViewById(R.id.score_for_team_b);
        textViewForB.setText("" + scoreForTeamB);
    }

    public void reset(View view) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
