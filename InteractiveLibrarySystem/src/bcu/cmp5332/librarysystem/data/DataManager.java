package bcu.cmp5332.librarysystem.data;

import bcu.cmp5332.librarysystem.model.Library;
import bcu.cmp5332.librarysystem.main.LibraryException;
import java.io.IOException;

public interface DataManager {
    
    public static final String SEPARATOR = "::";
    
    public void loadData(Library library) throws IOException, LibraryException;
    public void storeData(Library library) throws IOException;
}
