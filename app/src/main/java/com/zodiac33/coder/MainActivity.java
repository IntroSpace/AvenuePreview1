package com.zodiac33.coder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.zodiac33.coder.ast.Expression;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView text;
    String its = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.hah);
        final String input2 = "2 + 2 * #f";
        final List<Token> tokens = new Lexer(input2).tokenize();
//        final List<Expression> expressions = new Parser(tokens).parse();
//        for (Expression expr : expressions) {
//            its += (expr + " = " + (int) expr.eval()) + "\n";
//        }
//        text.setText(its);
    }
}
