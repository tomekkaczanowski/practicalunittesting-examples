package com.practicalunittesting.fest;

import com.practicalunittesting.Book;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.MapAssert.entry;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class FestTest {

    private Set<String> setA, setB;
    private final static String S_1 = "s1";
    private final static String S_2 = "s2";

    @BeforeClass
    private void setUp() {
        setA = new LinkedHashSet<String>();
        setB = new LinkedHashSet<String>();

        setA.add(S_1);
        setA.add(S_2);

        setB.add(S_2);
        setB.add(S_1);
    }

    public void collectionsUtilityMethods() {
        assertThat(setA).isNotEmpty().hasSize(2).doesNotHaveDuplicates();
        assertThat(setA).containsOnly(S_1, S_2);
    }

    public void mapUtilityMethods() {
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("a", 2);
        map.put("b", 3);
        assertThat(map).isNotNull().isNotEmpty()
                .includes(entry("a", 2), entry("b", 3))
                .excludes(entry("c", 1));
    }
    
    public void lookingIntoProperties() {
        Collection<Book> books = new HashSet<Book>();
        books.add(new Book("Homer", "Odyssey"));
        books.add(new Book("J.R.R. Tolkien", "Hobbit"));
        assertThat(books).onProperty("title").contains("Hobbit");
        assertThat(books).onProperty("author").contains("J.R.R. Tolkien");
        assertThat(books).onProperty("author").contains("Clinton");
    }
}