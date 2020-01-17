package bcu.cmp5332.librarysystem.commands;

import java.time.LocalDate;

import bcu.cmp5332.librarysystem.main.LibraryException;
import bcu.cmp5332.librarysystem.model.Book;
import bcu.cmp5332.librarysystem.model.Library;
import bcu.cmp5332.librarysystem.model.Patron;

public class RenewBook implements Command {
	/**
	 * Instance members of the class
	 */
	private int patronId;
	private int bookId;
	/**
	 * Parameterised Constructor for the class. 
	 * @param patronId:
	 * @param bookId
	 */
	public RenewBook(int patronId,int bookId) {
		this.bookId = bookId;
		this.patronId=patronId;
	}
	
	@Override
	public void execute(Library library, LocalDate currentDate) throws LibraryException {
		Book B;Patron P;
		LocalDate duedate;
		P= library.getPatronByID(patronId);
		B= library.getBookByID(bookId);
		P.addBook(B);
		duedate = B.getDueDate();
		duedate.plusDays(library.getLoanPeriod());
		B.setDueDate(duedate);
		System.out.println("The new Due Date is "+duedate.toString());
	}

}
