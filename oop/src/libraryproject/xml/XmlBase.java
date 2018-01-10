package libraryproject.xml;

import libraryproject.LibraryItem;
import org.w3c.dom.Element;

public abstract class XmlBase {

    final private Element element;

    protected XmlBase(Element element) {
        this.element = element;
    }

    public abstract LibraryItem extractItem();

    protected GenericItem getGenericItem() {
        String name = element.getAttribute("name");
        String author = element.getAttribute("author");
        short year = Short.valueOf(element.getAttribute("publicationYear"));
        return new GenericItem(name, author, year);
    }

}
