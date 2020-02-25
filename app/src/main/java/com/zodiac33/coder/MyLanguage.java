package com.zodiac33.coder;

import com.zodiac33.coder.ast.Statement;

import java.util.List;
import java.util.Scanner;

public class MyLanguage {
    public static void main(String[] args)  {
        final String input =
                "print AUTHOR + \" \" + AVENUE\n" +
                        "print \"\\n\"\n" +
                        "if \"1\" = \"2\" print \"True\"\n" +
                        "else print \"False\"";
        final List<Token> tokens = new Lexer(input).tokenize();
//        for (Token token :
//                tokens) {
//            System.out.println(token.toString());
//        }
        final List<Statement> statements = new Parser(tokens).parse();
        for (Statement statement:statements) {
            statement.execute();
        }
        System.out.println (AvenueSystem.conclusion);
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
