package bcu.cmp5332.librarysystem.commands;

import bcu.cmp5332.librarysystem.main.LibraryException;
import bcu.cmp5332.librarysystem.model.Library;

import java.time.LocalDate;

public interface Command {

    public static final String HELP_MESSAGE = "Commands:\n"
            + "\tlistbooks                       print all books\n"
            + "\tlistpatrons                     print all patrons\n"
            + "\taddbook                         add a new book\n"
            + "\taddpatron                       add a new patron\n"
            + "\tshowbook [book id]              show book details\n"
            + "\tshowpatron [patron id]          show patron details\n"
            + "\tborrow [patron id] [book id]    borrow a book\n"
            + "\trenew [patron id] [book id]     renew a book\n"
            + "\treturn [patron id] [book id]    return a book\n"
            + "\tloadgui                         loads the GUI version of the app\n"
            + "\thelp                            prints this help message\n"
            + "\texit                            exits the program";

    
    public void execute(Library library, LocalDate currentDate) throws LibraryException;
    
}
