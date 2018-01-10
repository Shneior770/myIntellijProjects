package inheritance.literatureexample;

public abstract class Literature {

   private String title;
   private String author;


    public Literature(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void print(){
        System.out.println("Title: "+ title +"\nAuthor: "+author);
    }
}
