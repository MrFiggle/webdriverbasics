package com.seleniumsimplified.junit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by peterpor on 1/20/16.
 */
public class FirstTest {

    @Test
    public void driverIsTheKing(){
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://fundydesigner.com");

        assertTrue(driver.getTitle().startsWith("Fundy Designer"));
    }

    @Test
    public void firefoxIsSupportedByWebDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://fundydesigner.com");

        assertTrue(driver.getTitle().startsWith("Fundy Designer"));

        driver.close();
    }
}
