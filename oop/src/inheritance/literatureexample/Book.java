package inheritance.literatureexample;

public class Book extends Literature {

    private String publisher;
    private String genre;

    public Book(String title, String author, String publisher, String genre){
        super(title,author);
        this.publisher = publisher;
        this.genre = genre;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Publisher: "+ publisher+" Genre: "+genre);
    }
}
