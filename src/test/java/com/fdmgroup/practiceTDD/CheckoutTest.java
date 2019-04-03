package com.fdmgroup.practiceTDD;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;



public class CheckoutTest {
	Basket basket;
	Checkout checkout;
	Book book1;
	Book book2;
	Book book3;
	

	@Before
	public void setUp() throws Exception {
		basket = new Basket();
		checkout = new Checkout();
		book1 = new Book();
		book2 = new Book();
		book3 = new Book();
		book1.setPrice(25.99);
		book2.setPrice(25.99);
		book3.setPrice(25.99);
	}

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket(){
		double price = checkout.calculatePrice(basket); //Act
		assertEquals(0.0,price,0.01); //Assert
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook(){
		basket.addBook(book1); //Act
		double price = checkout.calculatePrice(basket); //Act
		assertEquals(25.99,price,0.01); //Assert
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBook(){
		basket.addBook(book1); //Act
		basket.addBook(book2); //Act
		double price = checkout.calculatePrice(basket); //Act
		assertEquals(51.98,price,0.01); //Assert
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBook(){
		basket.addBook(book1); //Act
		basket.addBook(book2); //Act
		basket.addBook(book3); //Act
		double price = checkout.calculatePrice(basket); //Act
		assertEquals(77.19,price,0.01); //Assert
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBook(){
		basket.addBook(book1); //Act
		basket.addBook(book2); //Act
		basket.addBook(book3); //Act
		basket.addBook(book1); //Act
		basket.addBook(book2); //Act
		basket.addBook(book3); //Act
		basket.addBook(book1); //Act
		double price = checkout.calculatePrice(basket); //Act
		assertEquals(178.29,price,0.01); //Assert
	}
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBook(){
		basket.addBook(book1); //Act
		basket.addBook(book2); //Act
		basket.addBook(book3); //Act
		basket.addBook(book1); //Act
		basket.addBook(book2); //Act
		basket.addBook(book3); //Act
		basket.addBook(book1); //Act
		basket.addBook(book2); //Act
		basket.addBook(book3); //Act
		basket.addBook(book1); //Act
		double price = checkout.calculatePrice(basket); //Act
		assertEquals(226.11,price,0.01); //Assert
	}
}
