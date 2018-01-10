package libraryproject.xml;

import libraryproject.Book;
import libraryproject.LibraryItem;
import org.w3c.dom.Element;

public class BookExtractor extends XmlBase {
    final private short edition;
    public BookExtractor(Element element){
        super(element);
        edition = Short.valueOf(element.getElementsByTagName("edition").item(0).getTextContent());
    }

    @Override
    public LibraryItem extractItem(){
        GenericItem genItem = getGenericItem();
        return new Book(genItem.getName(),genItem.getAuthor(),genItem.getYear(),edition);
    }


}
