package com.zodiac33.coder.ast;

import com.zodiac33.coder.lib.Value;
import com.zodiac33.coder.lib.Variables;

public final class AssignmentStatement implements Statement {

    private final String variable;
    private final Expression expression;

    public AssignmentStatement(String variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public void execute() {
        final Value result = expression.eval();
        Variables.set(this.variable, result);
    }

    @Override
    public String toString() {
        return String.format("%s = %s", variable, expression);
    }
}
