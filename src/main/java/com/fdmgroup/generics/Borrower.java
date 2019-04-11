package com.fdmgroup.generics;

public class Borrower<T extends Number> extends Item<T> {
	private String name;

	public Borrower(T id, String name) {
		super(id);
		this.name = name; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
