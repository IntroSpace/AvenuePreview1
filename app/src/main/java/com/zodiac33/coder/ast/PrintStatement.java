package com.zodiac33.coder.ast;

import com.zodiac33.coder.AvenueSystem;

public class PrintStatement implements Statement {
    private final Expression expression;

    public PrintStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void execute() {
        AvenueSystem.out.print(expression.eval()) ;
    }

    @Override
    public String toString() {
        return "print " + expression;
    }
}
