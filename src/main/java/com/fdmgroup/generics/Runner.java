package com.fdmgroup.generics;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.interfaces.Car;
import com.fdmgroup.interfaces.Vehicle;

public class Runner {

	public static void main(String[] args) {
	GenericDemo<Integer, Vehicle> genericDemo = new GenericDemo<Integer, Vehicle>();
	genericDemo.setX(2);
	//genericDemo.setX(2.5);
	//genericDemo.setX("string");
	//genericDemo.setX(new Car());
	genericDemo.setY(new Car());

	//create Catalog objects 
	Catalog<Book<Integer>, Integer> catalogBook = new Catalog<Book<Integer>,Integer>();
	Catalog<Borrower<Long>,Long> catalogBorrower = new Catalog<Borrower<Long>,Long>();
	
	//create Book objects, set title & add to catalog 
	Book<Integer> book1 = new Book<Integer>(1);
	Book<Integer> book2 = new Book<Integer>(2);

	book1.setTitle("book1");
	book2.setTitle("book2");
	catalogBook.addItem(book1);
	catalogBook.addItem(book2);
	
	//display books in catalog
	for(Item<Integer> item: catalogBook.getItems()){
		Book<Integer> newbook = (Book<Integer>) item;
		System.out.println(item.getID()+" , "+newbook.getTitle());
	}
	
	//create Borrower objects & add to catalog 
	Borrower<Long> borrower1 = new Borrower<Long>(1001L, "Sudheep");
	Borrower<Long> borrower2 = new Borrower<Long>(2002L, "Jose");
	catalogBorrower.addItem(borrower1);
	catalogBorrower.addItem(borrower2);
	
	//display borrowers in catalog
	for(Item<Long> item: catalogBorrower.getItems()){
		Borrower<Long> newborrower = (Borrower<Long>) item;
		System.out.println(item.getID()+" , "+newborrower.getName());
	}
	
	}

}
