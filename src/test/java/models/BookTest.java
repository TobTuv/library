package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
        Book book1 = new Book(1, "Title 1", "Author 1", "Publisher 1", "ISBN 1", 1);
        Book book2 = book1;

        assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
        Book book1 = new Book(1, "Title 1", "Author 1", "Publisher 1", "ISBN 1", 1);
        Book book2 = new Book(2, "Title 2", "Author 2", "Publisher 2", "ISBN 2", 2);

        assertNotEquals(book1, book2);
	}

}
