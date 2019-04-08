package com.fdmgroup.collections;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book>{

	public int compare(Book book1, Book book2) {
		// TODO Auto-generated method stub
		return ((Double)book1.getPrice()).compareTo(book2.getPrice());
	}

}
