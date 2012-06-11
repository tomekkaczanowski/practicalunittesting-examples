package com.practicalunittesting.fest;

import com.practicalunittesting.Book;
import org.fest.assertions.Assertions;
import org.fest.assertions.GenericAssert;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BookAssert extends GenericAssert<BookAssert, Book> {

    public BookAssert(Book actual) {
        super(BookAssert.class, actual);
    }

    public static BookAssert assertThat(Book actual) {
        return new BookAssert(actual);
    }

    public BookAssert hasTitle(String title) {
        isNotNull();
        String errorMessage = String.format("Expected book's title to be <%s> but was <%s>",title, actual.getTitle());
        Assertions.assertThat(actual.getTitle()).overridingErrorMessage(errorMessage).isEqualTo(title);
        Assertions.assertThat(actual.getTitle().equals(title)).overridingErrorMessage(errorMessage).isTrue();
        return this;
    }

    public BookAssert isWrittenIn(String language) {
        isNotNull();
        String errorMessage = String.format("Expected that book was written in <%s> but was <%s>",language, actual.getLanguage());
        Assertions.assertThat(actual.getLanguage()).overridingErrorMessage(errorMessage).isEqualTo(language);
        Assertions.assertThat(actual.getLanguage().equals(language)).overridingErrorMessage(errorMessage).isTrue();
        return this;
    }
}