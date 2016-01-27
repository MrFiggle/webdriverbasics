package com.seleniumsimplified.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by ppor143 on 1/22/16.
 */
public class NavigationExerciseTest {
    static WebDriver driver;
    final private String PROTOCOL = "http";
    final private String DOMAIN = "compendiumdev.co.uk";
    final private String ROOT_URL = PROTOCOL + "://" + DOMAIN;

    @BeforeClass
    public static void createDriver() {
        driver = new FirefoxDriver();
    }

    @Test
    public void navigationTest(){
        driver.get(ROOT_URL + "/selenium/");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));

        driver.get(ROOT_URL + "/selenium/search.php");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified Search Engine"));

        driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
        assertTrue(driver.getTitle().startsWith("HTML Form Elements"));

        driver.navigate().back();
        assertTrue(driver.getTitle().startsWith("Selenium Simplified Search Engine"));

        driver.navigate().forward();
        assertTrue(driver.getTitle().startsWith("HTML Form Elements"));

        /*
        driver.get("http://compendiumdev.co.uk/selenium/basic_web_page.html");
        assertTrue(driver.getTitle().startsWith("Basic Web Page Title"));

        driver.get("http://compendiumdev.co.uk/selenium/refresh.php");
        assertTrue(driver.getTitle().startsWith("Refreshed Page on"));
        */

        driver.navigate().refresh();

    }

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }
}
