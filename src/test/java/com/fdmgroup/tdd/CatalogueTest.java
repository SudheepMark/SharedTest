package com.fdmgroup.tdd;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CatalogueTest {
	Catalogue catalogue;
	
	@Mock
	Book book;

	@Mock
	ReadItemCommand mockReadItemCommand;
	
	@Mock
	WriteItemCommand mockWriteItemCommand;

	@Mock
	ArrayList<Book> mockListOfBooks;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		catalogue = new Catalogue(mockReadItemCommand, mockWriteItemCommand); // dependency injection

		when(mockReadItemCommand.readAll()).thenReturn(mockListOfBooks);
	}

	@Test //1
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue() {
		ArrayList<Book> books = catalogue.getAllBooks(); // Act
		int numberOfBooks = books.size();
		assertEquals(0, numberOfBooks);
	}

	@Test //2
	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled() {
		catalogue.getAllBooks();
		verify(mockReadItemCommand).readAll();

	}

	@Test //3
	public void test_GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled() {

		assertEquals(mockListOfBooks, catalogue.getAllBooks()); // Assert

	}
	
	@Test //4
	public void test_AddBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled(){
		catalogue.addBook(book);
		verify(mockWriteItemCommand).insertItem(book);
	}


}
