package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        if (i == str.length()) {
            return false;
        }
        for (int j = i; j < str.length(); j++) {
            if (!Character.isDigit(str.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
