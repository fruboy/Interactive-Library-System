package bcu.cmp5332.librarysystem.commands;

import java.time.LocalDate;

import bcu.cmp5332.librarysystem.main.LibraryException;
import bcu.cmp5332.librarysystem.model.Book;
import bcu.cmp5332.librarysystem.model.Library;
import bcu.cmp5332.librarysystem.model.Patron;

public class ReturnBook implements Command {
	/**
	 * Instance members of the class
	 */
	private int patronId; 
	private int bookId;
	/**
	 * 
	 * @param patronId
	 * @param bookId
	 */
	public ReturnBook(int patronId, int bookId) {
		this.bookId=bookId;
		this.patronId=patronId;
	}

	@Override
	public void execute(Library library, LocalDate currentDate) throws LibraryException {
		Book B;Patron P;
		LocalDate duedate;
		P= library.getPatronByID(patronId);
		B= library.getBookByID(bookId);
		P.returnBook(B);
		System.out.println("Book Returned to Library.");
		duedate= B.getDueDate();
		if (duedate.isAfter(currentDate)) 
			System.out.println("You returned the book "+(duedate.getDayOfYear()-currentDate.getDayOfYear())+" days defore due date");
		else if(duedate.isBefore(currentDate))
			System.out.println("You returned the book "+(currentDate.getDayOfYear()-duedate.getDayOfYear())+" days after due date");
	}
}
