package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
        Book[] books = bc.getBookArray();
        assertEquals(books[0], book1);
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
        Book find = bc.findBook(book1.getTitle());
        assertEquals(book1, find);
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
        Book find = bc.findBook(book1.getTitle().toUpperCase());
        assertEquals(book1, find);

	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
        Book find = bc.findBook( " "+ book1.getTitle() + " ");
        assertEquals(book1, find);
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

}
