package com.zodiac33.coder;

public final class AvenueSystem {

    public static String conclusion = "";

    public static class out {
        public static void print (Object text) {
            conclusion += text;
        }
    }

    public static class in {
        public static String read () {
            return MyLanguage.askInput();
        }
    }
}
