package com.zodiac33.coder.ast;

import com.zodiac33.coder.lib.NumberValue;
import com.zodiac33.coder.lib.StringValue;
import com.zodiac33.coder.lib.Value;

public final class ValueExpression implements Expression {

    private final Value value;

    public ValueExpression(double value) {
        this.value = new NumberValue(value);
    }

    public ValueExpression(String value) {
        this.value = new StringValue(value);
    }

    @Override
    public Value eval() {
        return value;
    }

    @Override
    public String toString() {
        return value.asString();
    }
}
