package com.fdmgroup.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		Book book1 = new Book("Java for dummies",500,19.99);
		Book book2 = new Book("UNIX for dummies",300,9.99);
		Book book3 = new Book("SQL for dummies",200,29.99);

		List<Book> books = new ArrayList<Book>(Arrays.asList(book1,book2,book3));
		Collections.sort(books, new BookPriceComparator());
		for(Book book: books){
			System.out.println(book.getTitle()+" , "+book.getNumberOfPages()+" , "+book.getPrice());
		}
		
	}

}
