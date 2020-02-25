package com.zodiac33.coder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zodiac33.coder.ast.Statement;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById (R.id.button)).setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                text = findViewById(R.id.lol);
                final String input = text.getText ().toString ();
                final List<Token> tokens = new Lexer(input).tokenize();
                final List<Statement> statements = new Parser(tokens).parse();
                for (Statement statement:statements) {
                    statement.execute();
                }
                Intent i = new Intent(MainActivity.this, AnswerActivity.class);
                startActivity (i);
            }
        });
    }
}
