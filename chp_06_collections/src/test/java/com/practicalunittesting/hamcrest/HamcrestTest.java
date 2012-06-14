package com.practicalunittesting.hamcrest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionContaining.hasItem;
import static org.hamcrest.collection.IsCollectionContaining.hasItems;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.collection.IsMapContaining.hasKey;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class HamcrestTest {

    private Set<String> setA, setB;
    private final static String S_1 = "s1";
    private final static String S_2 = "s2";

    private Map<String, Object> map;

    @BeforeClass
    private void setUp() {
        setA = new LinkedHashSet<String>();
        setB = new LinkedHashSet<String>();

        setA.add(S_1);
        setA.add(S_2);

        setB.add(S_2);
        setB.add(S_1);

        map = new LinkedHashMap<String, Object>();
        map.put(S_1, 2);
        map.put("a", 2);
    }

    public void collectionsUtilityMethods() {
        assertThat(setA, hasItem(S_1));
        assertThat(setA, hasItem(S_2));
        assertThat(setA, hasItem("xyz"));
        assertThat(setA, hasItems(S_1, S_2, "xyz"));
     }


    public void mapsUtilityMethods() {
        assertThat(map, hasEntry("a", (Object) 2));
        assertThat(map, hasKey("b"));
    }


}