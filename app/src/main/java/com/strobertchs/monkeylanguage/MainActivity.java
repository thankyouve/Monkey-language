package com.strobertchs.monkeylanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonStart = (Button)findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(this);
        final Button direction = (Button)findViewById(R.id.direction);
        direction.setOnClickListener(this);
    }

    public void directions(View view) {
        Intent m;
        m = new Intent(this, Direction.class);
        startActivity(m);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, MonkeyLanguage.class);
        startActivity(i);
    }
}
