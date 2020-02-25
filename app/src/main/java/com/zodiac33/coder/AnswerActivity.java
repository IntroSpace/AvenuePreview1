package com.zodiac33.coder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_answer);
        ((TextView) findViewById (R.id.textView)).setText (AvenueSystem.conclusion);
        AvenueSystem.conclusion = "";
    }
}
