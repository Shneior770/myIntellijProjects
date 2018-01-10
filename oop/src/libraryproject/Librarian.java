package libraryproject;

import libraryproject.xml.LibraryItemsRepository;

import java.time.LocalDateTime;

public class Librarian {

    final private LibraryItemsRepository libraryItemsRepository;

    public Librarian(LibraryItemsRepository libraryItemsRepository) {
        this.libraryItemsRepository = libraryItemsRepository;
    }

    public boolean isItemAvailable(LibraryItem item) {
        if (libraryItemsRepository.getBorrowTime(item) == null)
            return true;

        return false;
    }

    public void borrowItem(LibraryItem item) {
        libraryItemsRepository.borrowItem(item, LocalDateTime.now());
    }

    public boolean isTimeOver(LibraryItem item) {
        LocalDateTime borrowTime = libraryItemsRepository.getBorrowTime(item);
        if (borrowTime == null) {
            return false;
        }
        LocalDateTime timeToReturnItem = borrowTime.plusSeconds(2);

        if (LocalDateTime.now().isAfter(timeToReturnItem)) {
            return true;
        }
        return false;
    }

    public void returnItem(LibraryItem item) {
        libraryItemsRepository.returnItem(item);
    }
}
