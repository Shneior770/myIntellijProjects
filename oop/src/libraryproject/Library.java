package libraryproject;

import libraryproject.xml.LibraryItemsRepository;

import java.util.ArrayList;
import java.util.List;

public class Library  {

    private Librarian librarian;
    private List<LibraryItem> libraryItems;

    public Library(LibraryItemsRepository libraryItemsRepository) {
        this.librarian = new Librarian(libraryItemsRepository);
        libraryItems = libraryItemsRepository.getAllItems();
    }


    public List<LibraryItem> getAvailableItems() {
        List<LibraryItem> available = new ArrayList<>();

        for (LibraryItem itemT: libraryItems) {
            if (librarian.isItemAvailable(itemT)){
                available.add(itemT);
            }
        }

        return available;
    }

    public LibraryItem borrowItem(LibraryItem item) {
        for (LibraryItem itemT: libraryItems) {
            if (itemT.equals(item) && librarian.isItemAvailable(itemT)){
                librarian.borrowItem(itemT);

                return itemT;
            }
        }

        return null;
    }

    public void returnItem(LibraryItem item){
        for (LibraryItem itemT: libraryItems) {
              if ((!librarian.isItemAvailable(itemT)) && itemT.equals(item)){
                  librarian.returnItem(itemT);
                  break;
              }
        }
    }

    public List<LibraryItem> getLatenessList() {
        List<LibraryItem> latenessList = new ArrayList<>();

        for (LibraryItem itemT: libraryItems) {
            if (librarian.isTimeOver(itemT)) {
                latenessList.add(itemT);
            }
        }
        return latenessList;
    }
}