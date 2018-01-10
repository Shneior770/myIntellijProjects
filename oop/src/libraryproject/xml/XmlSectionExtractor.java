package libraryproject.xml;

import libraryproject.LibraryItem;
import org.w3c.dom.Element;

public class XmlSectionExtractor {

    public LibraryItem extractItem(Element element){
       String elementName = element.getTagName().toLowerCase();
        switch (elementName){
            case "book":
                return new BookExtractor(element).extractItem();
            case "magazine":
              return new MagazineExtractor(element).extractItem();
            case "article":
             return new ArticleExtractor(element).extractItem();
        }

        throw new IllegalArgumentException();
    }
}
