package libraryproject;

public class Book extends LibraryItem {

    private int edition;

    public Book(String name, String author, int publicationYear, int edition) {
        super(name, author, publicationYear);
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)&&object instanceof Book ) {
            if (this.edition == ((Book) object).getEdition()) {
                return true;
            }
        }

        return false;
    }
}