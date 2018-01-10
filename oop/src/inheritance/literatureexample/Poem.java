package inheritance.literatureexample;

public class Poem extends Literature {

   private String style;

    public Poem(String title,String author, String style){
        super(title,author);
        this.style = style;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Style: "+ style);
    }

}
