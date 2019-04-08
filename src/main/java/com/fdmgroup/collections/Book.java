package com.fdmgroup.collections;

public class Book implements Comparable<Book> {

	private String title;
	private Integer numberOfPages;
	private double price;

	public Book(String title, Integer numberOfPages, double price) {
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int compareTo(Book anotherBook) {

		return title.compareTo(anotherBook.getTitle());
	}

}
