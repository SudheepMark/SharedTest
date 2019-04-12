package tddAnswers;

import java.util.ArrayList;

public class Checkout {

	public Double calculatePrice(Basket basket) {
		Double total = 0.0;
		Double price = 0.0;
		
		ArrayList<Book> bookList = basket.getBooksInBasket();
		
		int discount = bookList.size()/3;
		
		for (Book book : bookList){
			price = book.getPrice();
			total += price;	
		}
		
		if (bookList.size() >= 10){
			discount = discount + 10;
		} 
		
		
		total = total * (100 - discount)/100;
				
		return total;
	}

}
