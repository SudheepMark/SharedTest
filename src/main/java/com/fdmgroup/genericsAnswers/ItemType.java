package com.fdmgroup.genericsAnswers;

public abstract class ItemType<T extends Number> {

	private T id;
	
	private String name;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
