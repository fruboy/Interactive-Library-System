package bcu.cmp5332.librarysystem.commands;

import java.time.LocalDate;

import bcu.cmp5332.librarysystem.main.LibraryException;
import bcu.cmp5332.librarysystem.model.Library;

public class ListPatrons implements Command{
	/**
	 * Default Constructor.
	 */
	public ListPatrons() {
		
	}

	@Override
	public void execute(Library library, LocalDate currentDate) throws LibraryException {
		for (int i=0; i<library.getPatrons().size();i++ ) {
			System.out.println(library.getPatrons().get(i));
		}
	}
}
