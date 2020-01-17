package bcu.cmp5332.librarysystem.commands;

import java.time.LocalDate;

import bcu.cmp5332.librarysystem.main.LibraryException;
import bcu.cmp5332.librarysystem.model.Library;

public class ShowPatron implements Command{
	/**
	 * Instance Member
	 */
	private int patronId;
	/**
	 * 
	 * @param patronId
	 */
	public ShowPatron(int patronId){
		this.patronId= patronId;
	}
	@Override
	public void execute(Library library, LocalDate currentDate) throws LibraryException {
		System.out.println(library.getPatronByID(patronId).toString());
	}
}
