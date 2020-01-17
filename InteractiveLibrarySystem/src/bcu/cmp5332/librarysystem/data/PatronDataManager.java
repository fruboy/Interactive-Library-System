package bcu.cmp5332.librarysystem.data;

import bcu.cmp5332.librarysystem.model.Library;
import bcu.cmp5332.librarysystem.main.LibraryException;
import java.io.IOException;

public class PatronDataManager implements DataManager {

    private final String RESOURCE = "./resources/data/patrons.txt";
    
    @Override
    public void loadData(Library library) throws IOException, LibraryException {
        // TODO: implementation here
    }

    @Override
    public void storeData(Library library) throws IOException {
        // TODO: implementation here
    }
}
