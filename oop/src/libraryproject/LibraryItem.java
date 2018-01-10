package libraryproject;

public class LibraryItem {

    final private String itemName;
    final private String author;
    final private int publicationYear;


    protected LibraryItem(String libraryItemsNames, String author, int publicationYear) {
        this.itemName = libraryItemsNames;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getItemName() {
        return itemName;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof LibraryItem)) {
            return false;
        }

        LibraryItem item = (LibraryItem) object;

        if (this.itemName.equals(item.getItemName()) &&
                this.author.equals(item.getAuthor()) &&
                this.publicationYear == item.getPublicationYear()) {

            return true;
        }

        return false;
    }
}