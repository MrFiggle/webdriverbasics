package com.seleniumsimplified.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by peterpor on 1/21/16.
 */
public class JUnitExerciseTest {

    static boolean ILikeCows;

    @Before
    public void setILikeCows(){
        ILikeCows = true;
    }

    @Test
    public void usingAssertTrue(){
        assertTrue("I am True", ILikeCows);
        assertTrue("3 + 3 = 6", (3 + 3) == 6);

    }

    @Test
    public void usingAssertFalse(){
        assertFalse("I am False", ILikeCows);
        assertFalse("3 + 3 = 6", 3 + 3 == 7);
    }

    @Test
    public void usingAssertEquals(){
        assertEquals("I am Equal", true, ILikeCows);
        assertEquals("I am Equal", 3,  3);

    }

    @Test
    public void usingAssertThat(){
        assertThat("hazelnuts", 3, is(4));
    }

}
