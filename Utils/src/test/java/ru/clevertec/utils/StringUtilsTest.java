package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("5"));
        assertTrue(StringUtils.isPositiveNumber("3.15"));
        assertFalse(StringUtils.isPositiveNumber("-5"));
        assertFalse(StringUtils.isPositiveNumber("-3.15"));
        assertFalse(StringUtils.isPositiveNumber("0"));
    }
}