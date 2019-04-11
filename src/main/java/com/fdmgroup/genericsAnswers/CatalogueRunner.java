package com.fdmgroup.genericsAnswers;

public class CatalogueRunner {

	public static void main(String[] args) {
		Book<Integer> book = new Book<Integer>();
		Borrower<Integer> borrower = new Borrower<Integer>();
		LibraryStaff<Double> libraryStaff = new LibraryStaff<Double>();
		Loan<Double> loan = new Loan<Double>();
		
		Catalogue<Book<Integer>,Integer> books = new Catalogue<Book<Integer>,Integer>();
		Catalogue<Borrower<Integer>,Integer> borrowers = new Catalogue<Borrower<Integer>,Integer>();
		Catalogue<LibraryStaff<Double>,Double> staff = new Catalogue<LibraryStaff<Double>,Double>();
		Catalogue<Loan<Double>,Double> loans = new Catalogue<Loan<Double>,Double>();
		
		book.setId(1);
		book.setName("test book");
		books.addItems(book);
		
		loan.setId(1.5);
		loan.setName("test loan");
		loans.addItems(loan);
		
		borrower.setId(2);
		borrower.setName("test borrower");
		borrowers.addItems(borrower);
		
		libraryStaff.setId(2.6);
		libraryStaff.setName("test staff");
		staff.addItems(libraryStaff);
		
		System.out.println(books.getAllItems().get(0).getName());
		System.out.println(loans.getAllItems().get(0).getName());
		System.out.println(borrowers.getAllItems().get(0).getName());
		System.out.println(staff.getAllItems().get(0).getName());
		
	}

}
