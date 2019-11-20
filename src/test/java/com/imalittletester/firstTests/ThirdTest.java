package com.imalittletester.firstTests;

import com.imalittletester.utils.TranslationUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdTest {
    public final TranslationUtil translationUtil = new TranslationUtil();

    @ParameterizedTest
    @CsvSource(value = {"tomato,pomodoro,it", "cucumber,cetriolo,it", "cabbage,cavolo,it", "tomato,tomate,es"})
    void checkTranslation(String key, String expectedValue, String language) throws IOException {
        assertEquals(expectedValue, translationUtil.getTranslation(key, language));
    }
}
