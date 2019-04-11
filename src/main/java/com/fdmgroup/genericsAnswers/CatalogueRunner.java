package com.fdmgroup.genericsAnswers;

public class CatalogueRunner {

	public static void main(String[] args) {
		Book<Integer> book1 = new Book<Integer>(1, "book 1");
		Book<Integer> book2 = new Book<Integer>(2, "book 2");
		Borrower<Integer> borrower1 = new Borrower<Integer>(1, "borrower 1");
		Borrower<Integer> borrower2 = new Borrower<Integer>(2, "borrower 2");
		LibraryStaff<Double> libraryStaff1 = new LibraryStaff<Double>(1.1, "staff 1");
		LibraryStaff<Double> libraryStaff2 = new LibraryStaff<Double>(2.2, "staff 2");
		Loan<Double> loan1 = new Loan<Double>(1.1, "loan 1");
		Loan<Double> loan2 = new Loan<Double>(1.2, "loan 2");

		Catalogue<Book<Integer>, Integer> books = new Catalogue<Book<Integer>, Integer>();
		Catalogue<Borrower<Integer>, Integer> borrowers = new Catalogue<Borrower<Integer>, Integer>();
		Catalogue<LibraryStaff<Double>, Double> staff = new Catalogue<LibraryStaff<Double>, Double>();
		Catalogue<Loan<Double>, Double> loans = new Catalogue<Loan<Double>, Double>();

		books.addItem(book1);
		books.addItem(book2);
		loans.addItem(loan1);
		loans.addItem(loan2);
		borrowers.addItem(borrower1);
		borrowers.addItem(borrower2);
		staff.addItem(libraryStaff1);
		staff.addItem(libraryStaff2);

		Book<Integer> book = books.findItem(2);
		System.out.println(book.getName());

		Borrower<Integer> borrower = borrowers.findItem(1);
		System.out.println(borrower.getName());

		LibraryStaff<Double> libraryStaff = staff.findItem(2.2);
		System.out.println(libraryStaff.getName());

		Loan<Double> loan = loans.findItem(1.1);
		System.out.println(loan.getName());

	}

}
