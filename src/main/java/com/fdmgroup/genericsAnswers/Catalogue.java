package com.fdmgroup.genericsAnswers;

import java.util.ArrayList;

public class Catalogue <T extends Item<V>, V extends Number> {

	ArrayList<T> items = new ArrayList<T>();
	
	public void addItem(T Item){
		items.add(Item);
	}
	
	public T findItem(V id){
		for (T item : items){
			V itemId = item.getId();
			if (itemId.equals(id)){
				return item;
			}
		}
		return null;
	}
	
}
