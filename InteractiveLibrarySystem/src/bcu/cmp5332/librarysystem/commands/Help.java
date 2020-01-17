package bcu.cmp5332.librarysystem.commands;

import bcu.cmp5332.librarysystem.model.Library;

import java.time.LocalDate;

public class Help implements Command {
	/**
	 * Default Constructor
	 */
	public Help() {
		
	}
    @Override
    public void execute(Library library, LocalDate currentDate) {
        System.out.println(Command.HELP_MESSAGE);
    }
}
