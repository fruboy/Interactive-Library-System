package bcu.cmp5332.librarysystem.commands;

import java.time.LocalDate;

import bcu.cmp5332.librarysystem.main.LibraryException;
import bcu.cmp5332.librarysystem.model.Book;
import bcu.cmp5332.librarysystem.model.Library;
import bcu.cmp5332.librarysystem.model.Patron;

public class BorrowBook implements Command {
	/**
	 * Instance members.
	 */
	private int patronId; 
	private int bookId;
	/**
	 * 
	 * @param patronId
	 * @param bookId
	 */
	public BorrowBook(int patronId, int bookId) {
		this.bookId=bookId;
		this.patronId=patronId;
	}
	@Override
	public void execute(Library library, LocalDate currentDate) throws LibraryException {
		Book B;Patron P;
		P= library.getPatronByID(patronId);
		B= library.getBookByID(bookId);
		P.borrowBook(B, B.getLoan().getDueDate());
		System.out.println("The due date of the loan is "+B.getLoan().getDueDate());
	}

}
