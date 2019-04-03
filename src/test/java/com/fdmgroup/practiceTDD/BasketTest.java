package com.fdmgroup.practiceTDD;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class BasketTest {

	Basket basket;
	Book book1;
	Book book2;
	
	@Before
	public void setUp() throws Exception {
		basket = new Basket();
		book1 = new Book();
		book2 = new Book();
	}

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		ArrayList<Book> books = basket.getBooksInBasket(); //Act
		int numberOfBooks = books.size();
		assertEquals(0,numberOfBooks);
	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		basket.addBook(book1); //Act
		ArrayList<Book> books = basket.getBooksInBasket(); //Act
		int numberOfBooks = books.size();
		assertEquals(1,numberOfBooks);
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBooks(){
		basket.addBook(book1); //Act
		basket.addBook(book2); //Act
		ArrayList<Book> books = basket.getBooksInBasket(); //Act
		int numberOfBooks = books.size();
		assertEquals(2,numberOfBooks);
	}
	
}
