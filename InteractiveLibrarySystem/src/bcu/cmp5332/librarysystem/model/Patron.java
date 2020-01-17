package bcu.cmp5332.librarysystem.model;

import bcu.cmp5332.librarysystem.main.LibraryException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patron {
    
    private int id;
    private String name;
    private String phone;
    private final List<Book> books = new ArrayList<>();
    /**
     * Parameterised Constructor.
     * @param name
     * @param phone
     */
    public Patron(int id,String name, String phone) {
    	this.id= id;
    	this.name = name;
    	this.phone = phone;
    }
    public Patron(String name, String phone) {
    	this.name = name;
    	this.phone = phone;
    }
    public void borrowBook(Book book, LocalDate dueDate) throws LibraryException {
        Loan L = new Loan(this,book,dueDate,dueDate);
        books.add(book);
    }

    public void renewBook(Book book, LocalDate dueDate) throws LibraryException {
        book.setDueDate(dueDate);
    }

    public void returnBook(Book book) throws LibraryException {
        books.remove(book);
    }
    
    public void addBook(Book book) {
        books.add(book);
    }

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}
    
}
