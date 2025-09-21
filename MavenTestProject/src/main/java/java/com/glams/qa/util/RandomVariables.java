package com.glams.qa.util;

import java.util.Random;

public class RandomVariables {

    public static String GlobalVar;
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHI_abcdefghi";

    public static String getRandomVariable() {
        StringBuilder sb = new StringBuilder();
        int min = 3;
        int max = 7;
        Random r = new Random();
        int randomValue = r.nextInt((max - min) + 1) + min;
        while (randomValue-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            sb.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        
        GlobalVar = "GLAMS_" + sb.toString();
        return GlobalVar;
    }
}
