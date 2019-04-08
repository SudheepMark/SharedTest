package com.fdmgroup.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		/*
		Set<Integer> integers = new TreeSet<Integer>(Arrays.asList(2, 6, 100, 4, 3, 700, 2, 5, 2, 500));
		
		 while (integers.size() > 0) { System.out.println(integers.poll()); }
		  System.out.println(integers.size());
		 

		for (Integer integer : integers) {
			System.out.println(integer);
		}
*/
		
		// key = Book, value = Integer
		Map<Book,Integer> booksInStock = new TreeMap<Book,Integer>();
		Book book1 = new Book("Java for dummies", 500, 19.99);
		Book book2 = new Book("UNIX for dummies", 300, 9.99);
		Book book3 = new Book("SQL for dummies", 200, 29.99);
		
		booksInStock.put(book1, 75);
		booksInStock.put(book2, 100);
		booksInStock.put(book3, 300);
		booksInStock.put(book1, 200);
		
		for(Book book : booksInStock.keySet()){
			System.out.println(book.getTitle()+" : "+booksInStock.get(book));
		}
		
	}

}
