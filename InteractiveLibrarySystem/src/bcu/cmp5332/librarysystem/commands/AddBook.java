package bcu.cmp5332.librarysystem.commands;

import bcu.cmp5332.librarysystem.model.Book;
import bcu.cmp5332.librarysystem.model.Library;
import bcu.cmp5332.librarysystem.main.LibraryException;
import java.time.LocalDate;

public class AddBook implements  Command {

    private final String title;
    private final String author;
    private final String publicationYear;

    public AddBook(String title, String author, String publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    
    @Override
    public void execute(Library library, LocalDate currentDate) throws LibraryException {
        int lastIndex = library.getBooks().size() - 1;
        int maxId = library.getBooks().get(lastIndex).getId();
        Book book = new Book(++maxId, title, author, publicationYear);
        library.addBook(book);
        System.out.println("Book #" + book.getId() + " added.");
    }
}
