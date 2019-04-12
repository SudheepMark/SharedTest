package tddAnswers;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BasketTest {

	private Basket basket;
	private Book book;
	private Book book2;
	
	//Arrange
	@Before
	public void setUp(){
		basket = new Basket();
		book = new Book();
		book2 = new Book();
	}
		
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
		//Act
		ArrayList<Book> bookList = basket.getBooksInBasket();
		//Assert
		assertEquals(0,bookList.size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		//Act
		basket.addBook(book);
		ArrayList<Book> bookList = basket.getBooksInBasket();
		//Assert
		assertEquals(1,bookList.size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledTwice(){
		//Act
		basket.addBook(book);
		basket.addBook(book2);
		ArrayList<Book> bookList = basket.getBooksInBasket();
		//Assert
		assertEquals(2,bookList.size());
	}

}
