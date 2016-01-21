package com.seleniumsimplified.junit;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by peterpor on 1/20/16.
 */
public class JUnitExampleTest {

    @Test
    public void twoPlusTwoEqualsFour() {
        assertEquals("2+2=4", 4, 2+2);
    }
}
