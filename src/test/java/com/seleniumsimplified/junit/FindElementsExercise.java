package com.seleniumsimplified.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ppor143 on 1/23/16.
 */
public class FindElementsExercise {
    static WebDriver driver;
    final private static String PROTOCOL = "http";
    final private static String DOMAIN = "compendiumdev.co.uk";
    final private static String ROOT_URL = PROTOCOL + "://" + DOMAIN;

    @BeforeClass
    public static void createDriver(){
        driver = new FirefoxDriver();
        driver.get(ROOT_URL + "/selenium/find_by_playground.php");
    }

    @Test
    public void numberOfDivElements(){
        List<WebElement> elements;
        //elements = driver.findElements(By.id("div1"));
        elements = driver.findElements(By.tagName("div"));
        //System.out.printf("List: %s\n", elements);
        assertEquals(19, elements.size());
        //System.out.printf("The element size is %d", elements.size());
    }

    @Test
    public void numberOfAnchors(){
        List<WebElement> elements;
        elements = driver.findElements(By.partialLinkText("jump to para"));
        assertEquals(25, elements.size());

    }

    @Test
    public void bonusPoints(){
        List<WebElement> elements;
        elements = driver.findElements(By.className("nestedDiv"));
        assertEquals(16, elements.size());
    }

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }
}
