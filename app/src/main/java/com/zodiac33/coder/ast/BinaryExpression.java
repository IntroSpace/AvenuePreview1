package com.zodiac33.coder.ast;

import com.zodiac33.coder.lib.NumberValue;
import com.zodiac33.coder.lib.StringValue;
import com.zodiac33.coder.lib.Value;

public final class BinaryExpression implements Expression {

    private final Expression expr1, expr2;
    private final char operation;

    public BinaryExpression(char operation, Expression expr1, Expression expr2) {
        this.operation = operation;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public Value eval() {
        final Value value1 = expr1.eval();
        final Value value2 = expr2.eval();

        if (value1 instanceof StringValue || value2 instanceof StringValue) {
            final String text1 = value1.asString();
            switch (operation) {
                case '*': if (value1 instanceof StringValue) {
                    final int iterations = (int) value2.asNumber();
                    final StringBuilder buffer = new StringBuilder();
                    for (int i = 0; i < iterations; i++)
                        buffer.append(text1);
                    return new StringValue(buffer.toString());
                }
                case '-': case '/': throw new RuntimeException("ERROR STRING OPERATOR");
                case '+':
                default:
                    return new StringValue(text1 + value2.asString());
            }
        }

        final double number1 = value1.asNumber();
        final double number2 = value2.asNumber();
        switch (operation) {
            case '-': return new NumberValue(number1 - number2);
            case '*': return new NumberValue(number1 * number2);
            case '/': return new NumberValue(number1 / number2);
            case '+':
            default:
                return new NumberValue(number1 + number2);
        }
    }

    @Override
    public String toString() {
        return String.format("(%s %c %s)", expr1, operation, expr2);
    }
}
