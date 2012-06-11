package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class BookTest {

    private static final String TITLE = "My book";

    private Book book;

    public void testConstructor() {
        book = new Book(TITLE);
        assertNotNull(book.getTitle());
        assertTrue(book.getTitle() != "");
        assertEquals(book.getTitle(), TITLE);
    }
    
    public void booksWithSameTitlesShouldBeEqual() {
        book = new Book(TITLE);
        Book otherBook = new Book(TITLE);
        assertEquals(book, otherBook);
    }
}
