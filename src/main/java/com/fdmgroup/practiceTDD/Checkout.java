package com.fdmgroup.practiceTDD;

import java.util.ArrayList;

public class Checkout {

	private ArrayList<Book> books = new ArrayList<Book>();
	Basket basket = new Basket();
	Book book = new Book();
	int numberOfBooks = 0;
	double price = 0.0;

	public double calculatePrice(Basket basket) {
		books = basket.getBooksInBasket();
		numberOfBooks = books.size();
		if (numberOfBooks == 0){
		return price;
		}else 
		{
			for (int index = 0; index < books.size(); index++) {
				Book book = books.get(index);
				price+=book.getPrice();
			}
			if (numberOfBooks == 3){
			return price*0.99;
			}else if (numberOfBooks == 7){
				return price*0.98;
				}else if (numberOfBooks >= 10){
					return price*0.87;
					}
				return price;
		}

	}

}
