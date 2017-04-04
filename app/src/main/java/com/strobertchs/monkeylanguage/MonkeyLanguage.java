package com.strobertchs.monkeylanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MonkeyLanguage extends AppCompatActivity {

    String monkeyWordsList[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monkey_language);
    }

    public void getWords (View v) {
        EditText txtMonkeyWords = (EditText)findViewById(R.id.mtxtMonkeyWords);

        TextView lblSimilations = (TextView)findViewById(R.id.similations);

        String strMonkeyWords = txtMonkeyWords.getText().toString();

        if (strMonkeyWords.equals("X")== false) {
            monkeyWordsList = strMonkeyWords.split("\\n");
        }
        else {
            lblSimilations.setText(checkMonkeyResult(monkeyWordsList);
        }
    }

    private ArrayList<String> checkMonkeyResult (String MonkeyWordsList)
}
