package bcu.cmp5332.librarysystem.commands;

import bcu.cmp5332.librarysystem.gui.MainWindow;
import bcu.cmp5332.librarysystem.model.Library;
import bcu.cmp5332.librarysystem.main.LibraryException;
import java.time.LocalDate;

public class LoadGUI implements Command {
	
	public LoadGUI() {
		
	}
    @Override
    public void execute(Library library, LocalDate currentDate) throws LibraryException {
        new MainWindow(library);
    }
    
}
