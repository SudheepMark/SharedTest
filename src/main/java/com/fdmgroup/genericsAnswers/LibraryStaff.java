package com.fdmgroup.genericsAnswers;

public class LibraryStaff <T extends Number>extends Item<T>{

	public LibraryStaff(T id, String name) {
		super(id, name);
	}

	
}
