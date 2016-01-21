package com.seleniumsimplified.junit;

import org.junit.*;

/**
 * Created by peterpor on 1/21/16.
 */
public class JUnitBeforeAndAfterTest {



    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @Before
    public void BeforeTest(){
        System.out.println("Before Test");
    }

    @Test
    public void this1Test(){
        System.out.println("This is 1 test");
    }

    @Test
    public void this2Test(){
        System.out.println("This is 2 test");
    }

    @Test
    public void this3Test(){
        System.out.println("This is 3 test");
    }

    @After
    public void AfterTest(){
        System.out.println("After Test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

}
