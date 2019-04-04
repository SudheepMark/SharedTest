package com.fdmgroup.tdd;

import java.util.ArrayList;

public class Catalogue {

	private ArrayList<Book> books = new ArrayList<Book>();
	private ReadItemCommand readItemCommand;
	private WriteItemCommand writeItemCommand;

	public Catalogue(ReadItemCommand readItemCommand, WriteItemCommand writeItemCommand) {
		this.readItemCommand = readItemCommand;
		this.writeItemCommand = writeItemCommand;
	}

	public ArrayList<Book> getAllBooks() {
		return readItemCommand.readAll();

	}

	public void addBook(Book book) {
		writeItemCommand.insertItem(book);
		//books.add(book);
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
