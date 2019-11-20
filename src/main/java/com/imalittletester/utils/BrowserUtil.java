package com.imalittletester.utils;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.System.setProperty;

public class BrowserUtil {

    public WebDriver getChromeDriver() {
        if (SystemUtils.IS_OS_MAC) {
            setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver_Mac");
        }
        if (SystemUtils.IS_OS_LINUX) {
            setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver_Linux");
        }
        if (SystemUtils.IS_OS_WINDOWS) {
            setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver.exe");
        }
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver getFirefoxDriver() {
        if (SystemUtils.IS_OS_MAC) {
            setProperty("webdriver.gecko.driver", "src/test/resources/browserBinaries/geckodriver_Mac");
        }
        if (SystemUtils.IS_OS_LINUX) {
            setProperty("webdriver.gecko.driver", "src/test/resources/browserBinaries/geckodriver_Linux");
        }
        if (SystemUtils.IS_OS_WINDOWS) {
            setProperty("webdriver.gecko.driver", "src/test/resources/browserBinaries/geckodriver.exe");
        }
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver getDriver() {
        switch (System.getProperty("browser").toLowerCase()) {
            case "firefox" : return getFirefoxDriver();
            case "chrome" : return getChromeDriver();
            default:
                System.out.println("DID NOT RECOGNIZE BROWSER. STARTING CHROME INSTEAD!");
                return getChromeDriver();
        }
    }

}
