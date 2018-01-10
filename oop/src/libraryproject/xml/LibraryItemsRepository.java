package libraryproject.xml;


import libraryproject.LibraryItem;

import java.time.LocalDateTime;
import java.util.List;

public interface LibraryItemsRepository {

    public List<LibraryItem> getAllItems();
    public void borrowItem(LibraryItem item, LocalDateTime borrowTime);
    public LocalDateTime getBorrowTime(LibraryItem item);
    public void returnItem(LibraryItem item);
}
