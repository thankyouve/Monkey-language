package com.strobertchs.monkeylanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Direction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction);

        TextView displayRules = (TextView)findViewById(R.id.rules);
        displayRules.setText("A monkey language word is a special type of word called an A-word, which may be optionally followed by the letter N and a monkey language word.\n" +
                "An A-word is either only the single letter A, or the letter B followed by a monkey language word followed by the letter S.");
    }
}

