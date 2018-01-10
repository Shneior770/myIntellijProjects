package libraryproject;

import libraryproject.xml.XmlHandler;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String [] arg) throws InterruptedException {

        List<LibraryItem> libraryItems = new ArrayList<>();

        XmlHandler handler = new XmlHandler("/home/shneior/myIntellijProjects/oop/src/libraryproject/xml/libraryItems.xml");
        LibraryItem book1 = new Book("Harry Potter","J K rolling",1995,2);
        LibraryItem magazine = new Magazine("Yediot","Ron Yaron",2010);
        Library library = new Library(handler);

         library.borrowItem(book1);
        // library.returnItem(book1);
         libraryItems = library.getLatenessList();
        for (LibraryItem item: libraryItems) {
            System.out.println(item.getItemName());
        }

    }

}

