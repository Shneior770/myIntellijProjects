package inheritance.literatureexample;

public class LiteratureTest {

    public static void main(String [] arg){

        Literature[] list  = new Literature[5];// points of LibraryItem object ------>
        Book b = new Book("dfg","Coban","Tzomet","Classic");
        Poem p = new Poem("abc","Bob","Pop");

       // LibraryItem l = new Poem("Trand","Marley","jazz");// Poem object of LibraryItem type
        // l.print();


        list[0] = b;
        list[1] = p;
        list[2] = b;
        list[3] = p;
        list[4] = b;

        for (int i = 0; i <list.length ; i++) {
            list[i].print();
        }

    }
}
