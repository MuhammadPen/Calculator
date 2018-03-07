package com.example.muhammadpen.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Initializing the Views

    GridLayout gridLayout;
    LinearLayout linearLayout;
    TextView resultTextView;
    Button zeroButton;
    Button oneButton;
    Button twoButton;
    Button threeButton;
    Button fourButton;
    Button fiveButton;
    Button sixButton;
    Button sevenButton;
    Button eightButton;
    Button nineButton;

    //Initializing Operation Variables
    Double a;
    Double b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting up the Views

        gridLayout = (GridLayout) findViewById(R.id.gridLayout);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        zeroButton = (Button) findViewById(R.id.zeroButton);
        oneButton = (Button) findViewById(R.id.oneButton);
        twoButton = (Button) findViewById(R.id.twoButton);
        threeButton = (Button) findViewById(R.id.threeButton);
        fourButton = (Button) findViewById(R.id.fourButton);
        fiveButton = (Button) findViewById(R.id.fiveButton);
        sixButton = (Button) findViewById(R.id.sixButton);
        sevenButton = (Button) findViewById(R.id.sevenButton);
        eightButton = (Button) findViewById(R.id.eightButton);
        nineButton = (Button) findViewById(R.id.nineButton);

        //Setting up Operation Variables
        a = 0.00;
        b = 0.00;


        //Setting up OnClickListeners
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a += 0;
                resultTextView.setText(String.valueOf(a));
            }
        });

        oneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a += 1;
                resultTextView.setText(String.valueOf(a));

            }
        });

        twoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a += 2;
                resultTextView.setText(String.valueOf(a));

            }
        });


        threeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a += 3;
                resultTextView.setText(String.valueOf(a));

            }
        });


        fourButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a += 4;
                resultTextView.setText(String.valueOf(a));

            }
        });


        fiveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a += 5;
                resultTextView.setText(String.valueOf(a));

            }
        });


        sixButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a += 6;
                resultTextView.setText(String.valueOf(a));

            }
        });


        sevenButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a += 7;
                resultTextView.setText(String.valueOf(a));

            }
        });


        eightButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a += 8;
                resultTextView.setText(String.valueOf(a));

            }
        });


        nineButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a += 9;
                resultTextView.setText(String.valueOf(a));

            }
        });


    }
}
