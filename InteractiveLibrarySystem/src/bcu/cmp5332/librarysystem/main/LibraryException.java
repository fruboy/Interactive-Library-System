package bcu.cmp5332.librarysystem.main;

/**
 * LibraryException extends {@link Exception} class and is a custom exception
 * that is used to notify the user about errors or invalid commands.
 * 
 */
public class LibraryException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LibraryException(String message) {
        super(message);
    }
}
