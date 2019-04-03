package com.fdmgroup.tdd;

import java.util.ArrayList;

public class Catalogue {

	private ArrayList<Book> books = new ArrayList<Book>();

	public ArrayList<Book> getAllBooks() {
		return books;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(int isbn) {
		for (int index = 0; index < books.size(); index++) {
			Book book = books.get(index);
			if (book.getIsbn() == isbn) {
				books.remove(index);
			}
		}

	}

}
