package com.fdmgroup.collections;

import java.util.Comparator;

public class BookPagesComparator implements Comparator<Book>{

	public int compare(Book book1, Book book2) {
		
		return book1.getNumberOfPages().compareTo(book2.getNumberOfPages());
	}

}
