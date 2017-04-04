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
            lblSimilations.setText(checkMonkeyResultStr(checkMonkeyResult(monkeyWordsList)));
        }
    }

    private ArrayList<String> checkMonkeyResult(String MonkeyWordsList[]){
        ArrayList<String> similations = new ArrayList<String>();

        for (int i = 0; i < monkeyWordsList.length; i++){
            String firstCharacter = Character.toString(monkeyWordsList[i].charAt(0));
            String lastCharacter = Character.toString(monkeyWordsList[i].charAt(monkeyWordsList[i].length() - 1));
            String twoCharacter = monkeyWordsList[i].substring(0,1);
            if (firstCharacter.equals("A")){
                if (lastCharacter.equals("A")){
                    for (int m = 0;m < monkeyWordsList[i].length(); i += 2){
                        if (twoCharacter.equals("AN")){

                        }
                    }
                }
            }
        }
    }

    private String checkMonkeyResultStr(ArrayList<String> getWords){

    }
}
