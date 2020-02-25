package com.zodiac33.coder.lib;

import java.util.HashMap;
import java.util.Map;

public final class Variables {

    private static final Map<String, Value> variables;

    static {
        variables = new HashMap<>();
        variables.put("PI", new NumberValue(Math.PI));
        variables.put("E", new NumberValue(Math.E));
        variables.put("AVENUE", new NumberValue(14.01));
        variables.put("AUTHOR", new StringValue("zodiac33"));
    }

    public static boolean isExists (String name) {
        return variables.containsKey(name);
    }

    public static Value get (String name) {
        if (!isExists(name)) return new NumberValue(0);
        return variables.get(name);
    }

    public static void set(String variable, Value result) {
        variables.put(variable, result);
    }
}
