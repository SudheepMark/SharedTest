package com.fdmgroup.genericsAnswers;

public class Borrower<T extends Number> extends Item<T> {

	public Borrower(T id, String name) {
		super(id, name);
	}

}
