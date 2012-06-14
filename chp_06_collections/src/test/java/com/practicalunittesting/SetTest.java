package com.practicalunittesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class SetTest {

    private Set<String> setA, setB;

    @BeforeMethod
    public void setUp() {
        setA = new LinkedHashSet<String>();
        setB = new LinkedHashSet<String>();
    }

    public void sameSets() {
        String s1 = "s1";
        String s2 = "s2";

        setA.add(s1);
        setA.add(s2);

        setB.add(s2);
        setB.add(s1);

        assertEquals(setA, setB);
    }
    
}
