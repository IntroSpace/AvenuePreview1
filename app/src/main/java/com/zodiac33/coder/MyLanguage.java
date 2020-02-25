package com.zodiac33.coder;

import android.os.Build;
import android.os.Environment;

import androidx.annotation.RequiresApi;

import com.zodiac33.coder.ast.Expression;
import com.zodiac33.coder.ast.Statement;

import java.util.List;
import java.util.Scanner;

public class MyLanguage {
    public static void main(String[] args)  {
//        final String input =
//                "print AUTHOR + \" \" + AVENUE\n" +
//                        "print \"\\n\"\n" +
//                        "if \"1\" = \"2\" print 1\n" +
//                        "else print \"OKDA\"";
//        final List<Token> tokens = new Lexer(input).tokenize();
////        for (Token token :
////                tokens) {
////            System.out.println(token.toString());
////        }
//        final List<Statement> statements = new Parser(tokens).parse();
//        for (Statement statement:statements) {
//            statement.execute();
//        }
        AvenueSystem.out.print("Hi\n");
        AvenueSystem.out.print(AvenueSystem.in.read());
    }

    public static String askInput() {
        Scanner scan = new Scanner(System.in);
        final String ask = scan.next();
        return ask;
    }

    public static void PrintForSystem (String conclusion) {
        System.out.print(conclusion);
    }
}
