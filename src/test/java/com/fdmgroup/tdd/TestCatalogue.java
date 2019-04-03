package com.fdmgroup.tdd;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestCatalogue {

	Catalogue catalogue;
	Book book1;
	Book book2;
	
	@Before
	public void setUp() throws Exception {
		//Arrange
		catalogue = new Catalogue();
		book1 = new Book();
		book2 = new Book();
		book1.setIsbn(123);
		book2.setIsbn(456);
	}

	@Test
	public void test_getAllBooksReturnsEmptyArrayListWhenNoBooksAdded() {
		ArrayList<Book> books = catalogue.getAllBooks(); //Act
		int numberOfBooks = books.size();
		assertEquals(0,numberOfBooks);
	}
	
	@Test
	public void test_getAllBooksReturnsArrayListSizeOneWhenOneBookAdded() {
		catalogue.addBook(book1); //Act
		ArrayList<Book> books = catalogue.getAllBooks(); //Act
		int numberOfBooks = books.size();
		assertEquals(1,numberOfBooks);
	}

	@Test
	public void test_getAllBooksReturnsSameBookThatWasAdded() {
		catalogue.addBook(book1); //Act
		ArrayList<Book> books = catalogue.getAllBooks(); //Act
		assertEquals(book1,books.get(0));
	}
	
	@Test
	public void test_getAllBooksReturnsArrayListSizeTwoWhenTwoBooksAdded() {
		catalogue.addBook(book1); //Act
		catalogue.addBook(book2); //Act
		ArrayList<Book> books = catalogue.getAllBooks(); //Act
		int numberOfBooks = books.size();
		assertEquals(2,numberOfBooks);
	}
	
	@Test
	public void test_getAllBooksReturnsEmptyArrayListWhenOneBookAddedAndOneBookRemoved() {
		catalogue.addBook(book1); //Act
		catalogue.removeBook(123); //Act
		ArrayList<Book> books = catalogue.getAllBooks(); //Act
		int numberOfBooks = books.size();
		assertEquals(0,numberOfBooks);
	}
	
	@Test
	public void test_getAllBooksReturnsOtherBookAfterOneBookRemoved() {
		catalogue.addBook(book1); //Act
		catalogue.addBook(book2); //Act
		catalogue.removeBook(456); //Act
		ArrayList<Book> books = catalogue.getAllBooks(); //Act
		assertEquals(book1,books.get(0));
	}
}
