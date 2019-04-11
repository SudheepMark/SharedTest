package com.fdmgroup.generics;

public class Book<T extends Number> extends Item<T> {
	public Book(T iD) {
		super(iD); 
	}

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

}
