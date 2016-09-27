package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public class StorageStub implements Storage {
    
    public StorageStub(String filepath) {
        
    }
    
    public void save(AddressBook addressBook) throws StorageOperationException {
        
    }
    
    public AddressBook load() throws StorageOperationException {
        return null;
    }
    
    public String getPath() {
        return null;
    }

}
