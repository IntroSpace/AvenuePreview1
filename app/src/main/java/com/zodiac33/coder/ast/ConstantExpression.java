package com.zodiac33.coder.ast;

import com.zodiac33.coder.lib.Value;
import com.zodiac33.coder.lib.Variables;

public class ConstantExpression implements Expression {

    private final String name;

    public ConstantExpression (String name) {
        this.name = name;
    }

    @Override
    public Value eval() {
        return Variables.get(name);
    }

    @Override
    public String toString () {
        //return Double.toString(this.eval());
        return this.name;
    }
}