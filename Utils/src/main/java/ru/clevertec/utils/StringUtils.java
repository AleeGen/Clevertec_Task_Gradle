package ru.clevertec.utils;

public class StringUtils {
    private StringUtils() {
    }

    public static boolean isPositiveNumber(String str) {
        return Float.parseFloat(org.apache.commons.lang3.StringUtils.trim(str)) > 0;
    }

}
