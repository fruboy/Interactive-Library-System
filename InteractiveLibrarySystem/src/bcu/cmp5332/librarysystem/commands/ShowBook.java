package bcu.cmp5332.librarysystem.commands;

import java.time.LocalDate;

import bcu.cmp5332.librarysystem.main.LibraryException;
import bcu.cmp5332.librarysystem.model.Library;

public class ShowBook implements Command {
	/**
	 * Instance member
	 */
	private int bookId;
	/**
	 * 
	 * @param bookId
	 */
	public ShowBook(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public void execute(Library library, LocalDate currentDate) throws LibraryException {
		System.out.println(library.getBookByID(bookId).toString());
	}

}
