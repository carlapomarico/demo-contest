package com.imalittletester.utils;

import org.openqa.selenium.WebDriver;

public class BaseClass {
    protected EnvironmentUtil environmentUtil = new EnvironmentUtil();
    protected BrowserUtil browserUtil = new BrowserUtil();
    protected WebDriver driver;
}
