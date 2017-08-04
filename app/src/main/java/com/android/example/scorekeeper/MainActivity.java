package com.android.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score1=0,score2=0,foul1=0,foul2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView scoreText1=(TextView) findViewById(R.id.Score_1);
        final TextView scoreText2=(TextView) findViewById(R.id.Score_2);
        final TextView foulText1=(TextView) findViewById(R.id.foul_1);
        final TextView foulText2=(TextView) findViewById(R.id.foul_2);
        Button scoreButton1=(Button) findViewById(R.id.button_1);
        Button scoreButton2=(Button) findViewById(R.id.button_2);
        Button foulButton1=(Button) findViewById(R.id.foulbutton_1);
        Button foulButton2=(Button) findViewById(R.id.foulbutton_2);
        Button resetButton=(Button) findViewById(R.id.reset);

        scoreButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1=score1+1;
                scoreText1.setText(""+score1);
            }
        });

        scoreButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score2=score2+1;
                scoreText2.setText(""+score2);
            }
        });

        foulButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foul1=foul1+1;
                foulText1.setText(""+foul1);
            }
        });

        foulButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foul2=foul2+1;
                foulText2.setText(""+foul2);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1=0;
                score2=0;
                foul1=0;
                foul2=0;
                scoreText1.setText(""+score1);
                scoreText2.setText(""+score2);
                foulText1.setText(""+foul1);
                foulText2.setText(""+foul2);
            }
        });

    }
}
