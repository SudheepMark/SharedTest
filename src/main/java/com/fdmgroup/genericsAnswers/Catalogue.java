package com.fdmgroup.genericsAnswers;

import java.util.ArrayList;

public class Catalogue <T extends ItemType<V>, V extends Number> {

	ArrayList<T> items = new ArrayList<T>();
	
	public ArrayList<T> getAllItems(){
		return items;		
	}
	
	public void addItems(T Item){
		items.add(Item);
	}
	
	public void findItems(V id){
		for (int count=0; count< items.size(); count++){
			if (items.get(count).getId() == id){
			System.out.println(items.get(count));
			}
		}
		
	}
	
}
