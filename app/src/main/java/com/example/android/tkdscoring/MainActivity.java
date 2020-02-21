package com.example.android.tkdscoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tkdscoring.R;

public class MainActivity extends AppCompatActivity {


    int redScore= 0;
    int blueScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForRed (int redScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(redScore));

    }


    public void add1Red (View v) {
        redScore=redScore+1;
        displayForRed(redScore);

    }

    public void add2Red (View v) {
        redScore=redScore+2;
        displayForRed(redScore);

    }

    public void add3Red (View v) {
        redScore=redScore+3;
        displayForRed(redScore);

    }

    public void add4Red (View v) {
        redScore=redScore+4;
        displayForRed(redScore);

    }

    public void add5Red (View v) {
        redScore=redScore+5;
        displayForRed(redScore);

    }

    public void displayForBlue(int blueScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(blueScore));
    }

    public void add1Blue (View v) {
        blueScore=blueScore+1;
        displayForBlue(blueScore);
    }
    public void add2Blue (View v) {
        blueScore=blueScore+2;
        displayForBlue(blueScore);
    }
    public void add3Blue (View v) {
            blueScore=blueScore+3;
            displayForBlue(blueScore);
    }

    public void add4Blue (View v) {
        blueScore=blueScore+4;
        displayForBlue(blueScore);
    }

    public void add5Blue (View v) {
        blueScore=blueScore+5;
        displayForBlue(blueScore);
    }

    public void reset(View v) {
        redScore=0;
        blueScore=0;
        displayForRed(redScore);
        displayForBlue(blueScore);
    }


    public void tkdBrowse (View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://blackangelstkd.com")));

    }

    public void wtBrowse (View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.worldtaekwondo.org/")));

    }

}
