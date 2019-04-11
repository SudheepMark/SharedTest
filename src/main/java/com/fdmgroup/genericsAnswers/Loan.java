package com.fdmgroup.genericsAnswers;

public class Loan<T extends Number> extends Item<T>{

	public Loan(T id, String name) {
		super(id, name);
	}

}
