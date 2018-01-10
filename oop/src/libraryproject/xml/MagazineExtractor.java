package libraryproject.xml;

import libraryproject.LibraryItem;
import libraryproject.Magazine;
import org.w3c.dom.Element;

public class MagazineExtractor extends XmlBase {

    public MagazineExtractor(Element element) {
        super(element);
    }

    @Override
    public LibraryItem extractItem() {
        GenericItem item = getGenericItem();
        return new Magazine(item.getName(),item.getAuthor(),item.getYear());
    }
}
