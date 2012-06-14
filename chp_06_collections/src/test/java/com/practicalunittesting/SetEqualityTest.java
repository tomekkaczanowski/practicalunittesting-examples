package com.practicalunittesting;

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
public class SetEqualityTest {

    @Test
    public void twoSetsAreEqualsIfTheyHaveSameContent() {
        Set<String> setA = new LinkedHashSet<String>();
        Set<String> setB = new LinkedHashSet<String>();

        String s1 = "s1";
        String s2 = "s2";

        setA.add(s1);
        setA.add(s2);

        setB.add(s2);
        setB.add(s1);

        assertEquals(setA, setB);
    }
}