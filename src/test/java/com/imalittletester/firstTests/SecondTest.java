package com.imalittletester.firstTests;

import com.imalittletester.utils.BaseClass;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class SecondTest extends BaseClass {

    @Test
    void envTest() throws IOException {
        System.out.println(environmentUtil.getEnvProperty("homepageurl"));
    }
}
