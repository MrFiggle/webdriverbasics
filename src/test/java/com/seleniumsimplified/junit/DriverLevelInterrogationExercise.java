package com.seleniumsimplified.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by ppor143 on 1/22/16.
 */
public class DriverLevelInterrogationExercise {
    static WebDriver driver;
    final private static String PROTOCOL = "http";
    final private static String DOMAIN = "compendiumdev.co.uk";
    final private static String ROOT_URL = PROTOCOL + "://" + DOMAIN;

    @BeforeClass
    public static void createDriver() {
        driver = new FirefoxDriver();
        driver.get(ROOT_URL + "/selenium/basic_web_page.html");
    }

    @Test
    public void checkTitleEqualsBasicWebpageTitle(){
        //driver.get(ROOT_URL + "/selenium/basic_web_page.html");
        //assertTrue(driver.getTitle().contentEquals("Basic Web Page Title"));
        assertThat(driver.getTitle(), is("Basic Web Page Title"));
        //System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void assertCurrentURL(){
        //driver.get(ROOT_URL + "/selenium/basic_web_page.html");
        //System.out.println(driver.getCurrentUrl());
        //assertEquals(driver.getCurrentUrl(), ROOT_URL + "/selenium/basic_web_page.html");
        assertThat(driver.getCurrentUrl(), is(ROOT_URL + "/selenium/basic_web_page.html"));
        //assertEquals("hello", "hello");
    }

    @Test
    public void checkPageSource(){
        //driver.get(ROOT_URL + "/selenium/basic_web_page.html");
        //assertTrue(driver.getPageSource().contains("A paragraph of text"));
        assertThat(driver.getPageSource(), containsString("A paragraph of text"));
        //String pageSource = driver.getPageSource();
        //assertTrue(pageSource.contains("A paragraph of text"));*/
    }

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }
}
