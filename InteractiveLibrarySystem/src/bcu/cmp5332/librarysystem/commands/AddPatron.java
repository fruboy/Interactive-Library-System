package bcu.cmp5332.librarysystem.commands;

import bcu.cmp5332.librarysystem.main.LibraryException;
import bcu.cmp5332.librarysystem.model.Library;
import bcu.cmp5332.librarysystem.model.Patron;

import java.time.LocalDate;

public class AddPatron implements Command {

    private String name;
    private String phone;

    public AddPatron(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public void execute(Library library, LocalDate currentDate) throws LibraryException {
        library.addPatron(new Patron(name,phone));
    }
}
