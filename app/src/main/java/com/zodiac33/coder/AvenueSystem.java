package com.zodiac33.coder;

public final class AvenueSystem {

    public static class out {
        public static void print (Object text) {
            MyLanguage.PrintForSystem(((String) text));
        }
    }

    public static class in {
        public static String read () {
            return MyLanguage.askInput();
        }
    }
}
