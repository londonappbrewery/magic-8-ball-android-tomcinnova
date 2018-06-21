package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ballDisplay;
    private int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ballDisplay = (ImageView)findViewById(R.id.image_eightball);
        ballDisplay.setImageResource(R.drawable.ball1);
        myButton = (Button)findViewById(R.id.askButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ballDisplay.setImageResource(ballArray[getRandomInt(4)]);
            }

            public int getRandomInt(int upperBound) {
                if (upperBound < 0) {
                    upperBound = 0;
                }

                return new Random().nextInt(upperBound);
            }
        });

    }
}
