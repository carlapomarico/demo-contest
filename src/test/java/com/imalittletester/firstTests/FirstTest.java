package com.imalittletester.firstTests;

import com.imalittletester.utils.BaseClass;
import org.junit.jupiter.api.Test;

public class FirstTest extends BaseClass {

    @Test
    void starChrome() {
        driver = browserUtil.getChromeDriver();
        driver.get("https://contestnyc2019.sched.com/");
        driver.quit();
    }

    @Test
    void startFirefox() {
        driver = browserUtil.getFirefoxDriver();
        driver.get("https://contestnyc2019.sched.com/");
        driver.quit();
    }

    @Test
    void startBrowser() {
        driver = browserUtil.getDriver();
        driver.get("https://contestnyc2019.sched.com/");
        driver.quit();
    }
}
