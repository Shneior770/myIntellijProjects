package libraryproject.xml;

public class GenericItem {
    final private String name;
    final private String author;
    final private short year;



    public GenericItem(String name, String author, short year) {
        this.name = name;
        this.author = author;
        this.year = year;


    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public short getYear() {
        return year;
    }

}
