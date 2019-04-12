package tddAnswers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {

	Basket basket;
	Checkout checkout;
	Double price;
	Book book;
	
	@Before
	public void setUp(){
		//Arrange
		basket = new Basket();
		checkout = new Checkout();
		//Act
		book = new Book();
		book.setPrice(25.99);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		price = checkout.calculatePrice(basket);
		assertEquals(0.0,price,0.009);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		//Act
		basket.addBook(book);
		price = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(25.99,price,0.009);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasket_WhenPassedBasketWithTwoBooks() {
		//Act
		basket.addBook(book);
		basket.addBook(book);
		price = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(51.98,price,0.009);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBooks() {
		//Act
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		price = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(77.19,price,0.009);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBooks() {
		//Act
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		price = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(178.29,price,0.009);
	}
	
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBooks() {
		//Act
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		price = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(226.11,price,0.009);
	}
	


}
