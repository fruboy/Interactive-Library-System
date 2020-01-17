package bcu.cmp5332.librarysystem.model;

import java.time.LocalDate;

public class Loan {
    
    private Patron patron;
    private Book book;
    private LocalDate startDate;
    private LocalDate dueDate;
    /**
     * Parameterised Constructor for Loan.
     * @param patron
     * @param book
     * @param startDate
     * @param dueDate
     */
    public Loan(Patron patron, Book book, LocalDate startDate, LocalDate dueDate) {
        this.patron = patron;
        this.book= book;
        this.dueDate=dueDate;
        this.startDate =startDate;
    }

	/**
	 * @return the patron
	 */
	public Patron getPatron() {
		return patron;
	}

	/**
	 * @param patron the patron to set
	 */
	public void setPatron(Patron patron) {
		this.patron = patron;
	}

	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the dueDate
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
}
