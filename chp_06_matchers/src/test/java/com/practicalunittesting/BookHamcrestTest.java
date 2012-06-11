package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class BookHamcrestTest {

    private static final String TITLE = "My book";

    private Book book;

    public void constructorShouldSetTitle() {
        book = new Book(TITLE);
        assertThat(book.getTitle(), notNullValue());
        // empty?
        assertThat(book.getTitle(), equalTo(TITLE));
    }

    public void constructorShouldSetTitle_hasProperty() {
        book = new Book(TITLE);
        assertThat(book, hasProperty("title", equalTo(TITLE)));
    }


    public void booksWithSameTitlesShouldBeEqual() {
        book = new Book(TITLE);
        Book otherBook = new Book(TITLE);
        assertThat(book, equalTo(otherBook));
    }
}
