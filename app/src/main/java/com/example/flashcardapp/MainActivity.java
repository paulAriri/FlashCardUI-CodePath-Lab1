package com.example.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    findViewById(R.id.flashCard_question).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            findViewById(R.id.flashCard_question).setVisibility(v.INVISIBLE);
            findViewById(R.id.flashCard_answer).setVisibility(v.VISIBLE);
        }
    });

    findViewById(R.id.option1).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            findViewById(R.id.option1).setBackgroundColor(Color.RED);
            findViewById(R.id.option3).setBackgroundColor(Color.GREEN);
        }
    });

    findViewById(R.id.option2).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            findViewById(R.id.option2).setBackgroundColor(Color.RED);
            findViewById(R.id.option3).setBackgroundColor(Color.GREEN);
        }
    });

    findViewById(R.id.option3).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            findViewById(R.id.option3).setBackgroundColor(Color.GREEN);
        }
    });

    findViewById(R.id.hideButton).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            findViewById(R.id.option1).setVisibility(v.INVISIBLE);
            findViewById(R.id.option2).setVisibility(v.INVISIBLE);
            findViewById(R.id.option3).setVisibility(v.INVISIBLE);
            findViewById(R.id.hideButton).setVisibility(v.INVISIBLE);
            findViewById(R.id.hideButton2).setVisibility(v.VISIBLE);
        }
    });
    }
}
