package libraryproject;

public class Article extends LibraryItem {

   final private int month;

    public Article(String name,String author,int publicationYear,int month){
        super(name,author,publicationYear);
        this.month = month;
    }

    public int getMonth(){
        return this.month;
    }

    @Override
    public boolean equals(Object object){
       if (super.equals(object)&&this.month == ((Article)object).getMonth()&&object instanceof Article){
           return true;
        }
        return false;
    }

}
