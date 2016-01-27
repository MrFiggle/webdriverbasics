package com.seleniumsimplified.junit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

/**
 * Created by ppor143 on 1/22/16.
 */
public class FirstFindByExercise {
    static WebDriver driver;
    final private static String PROTOCOL = "http";
    final private static String DOMAIN = "compendiumdev.co.uk";
    final private static String ROOT_URL = PROTOCOL + "://" + DOMAIN;

    @BeforeClass
    public static void createDriver() {
        driver = new FirefoxDriver();
        driver.get(ROOT_URL + "/selenium/find_by_playground.php");
    }

    @Test
    public void byID() {
        WebElement id = driver.findElement(By.id("p2"));
        //assertThat(driver.findElement(), is("p2"));
        assertEquals("pName2", id.getAttribute("Name"));
    }

    @Test
    public void byLinkText(){
        WebElement linkText = driver.findElement(By.linkText("jump to para 4"));
        assertEquals("a30", linkText.getAttribute("id"));
    }

    @Test
    public void byName(){
        WebElement name = driver.findElement(By.name("pName14"));
        assertEquals("p14", name.getAttribute("id"));
    }

    @Test
    public void byPartialLinkText(){
        WebElement partialLinkText = driver.findElement(By.partialLinkText("para 10"));
        assertEquals("aName36", partialLinkText.getAttribute("name"));
    }

    @Test
    public void byClassName(){
        WebElement className = driver.findElement(By.className("specialDiv"));
        assertEquals("div1", className.getAttribute("id"));
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}
