package com.fdmgroup.generics;

import java.util.ArrayList;

public class Catalog <T extends Item<V>,V extends Number>{
private ArrayList<T> items = new ArrayList<T>();

public void addItem(T item) {
	items.add(item);
}

public void removeItem(T item) {
	items.remove(item); 
}


public ArrayList<T> getItems() {
	return items;
}


}
