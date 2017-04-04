package com.strobertchs.monkeylanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MonkeyLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monkey_language);
    }

    public void getWords (View v) {
        EditText txtMonkeyWords = (EditText)findViewById(R.id.mtxtMonkeyWords);

        TextView outputResult = (TextView)findViewById(R.id.results);

        String strMonkeyWords = txtMonkeyWords.getText().toString();

        String monkeyWordsList[] = strMonkeyWords.split("\\n");

        outputResult.setText(checkMonkeyResultStr(checkMonkeyResult(monkeyWordsList)));
    }

    private ArrayList<String> checkMonkeyResult(String monkeyWordsList[]){
        ArrayList<String> results = new ArrayList<>();

        for (int i = 0; i < monkeyWordsList.length; i++) {
            String firstCharacter = Character.toString(monkeyWordsList[i].charAt(0));
            String lastCharacter = Character.toString(monkeyWordsList[i].charAt(monkeyWordsList[i].length() - 1));
            String secondLastChar = Character.toString(monkeyWordsList[i].charAt(monkeyWordsList[i].length() - 2));

            if ((monkeyWordsList[i].length() == 1 && monkeyWordsList[i].equals("A") )||(monkeyWordsList[i].length() == 3 && monkeyWordsList[i].equals("BAS"))) {
                results.add("YES");
            }
            else if (monkeyWordsList[i].length() % 2 == 1) {
                if (firstCharacter.equals("A")) {
                    if (lastCharacter.equals("A")) {
                        for (int m = 0; m < monkeyWordsList[i].length() - 1; m += 2) {
                            String twoCharacter = monkeyWordsList[i].substring(m, m + 1);

                            if (twoCharacter.equals("AN")) {
                                if (m == monkeyWordsList[i].length() - 2) {
                                    results.add("YES");
                                }
                            }
                            else {
                                results.add("NO");
                            }
                        }
                    }
                    else {
                        results.add("NO");
                    }
                }
                else if (firstCharacter.equals("B")) {
                    if (lastCharacter.equals("S")) {
                        if (secondLastChar.equals("A")){
                            for (int m = 1; m < monkeyWordsList[i].length() - 2; m += 2) {
                                String twoCharacter = monkeyWordsList[i].substring(m, m + 1);

                                if (twoCharacter.equals("AN")) {
                                    if (m == monkeyWordsList[i].length() - 4) {
                                        results.add("YES");
                                    }
                                }
                                else {
                                    results.add("NO");
                                }
                            }
                        }
                    }
                    else {
                        results.add("NO");
                    }
                }
                else{
                    results.add("NO");
                }
            }
            else {
                results.add("NO");
            }
        }

        return results;
    }

    private String checkMonkeyResultStr(ArrayList<String> resultsList){
        String result = "";

        for (String sentence: resultsList){
            result = result + sentence + "\n";
        }

        return result;
    }
}
