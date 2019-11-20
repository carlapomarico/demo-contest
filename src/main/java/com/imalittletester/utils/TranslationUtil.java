package com.imalittletester.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TranslationUtil {

    public String getTranslation(String propertyKey, String language) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/test/resources/languages/" + language +
                ".properties"));
        return properties.getProperty(propertyKey);
    }
}
