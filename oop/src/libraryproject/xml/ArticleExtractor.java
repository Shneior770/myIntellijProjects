package libraryproject.xml;

import libraryproject.Article;
import libraryproject.LibraryItem;
import org.w3c.dom.Element;

public class ArticleExtractor extends XmlBase {
    private short month;

    public ArticleExtractor(Element element) {
        super(element);
        month = Short.valueOf(element.getElementsByTagName("publicationMonth").item(0).getTextContent()) ;
    }

    @Override
    public LibraryItem extractItem() {
        GenericItem genItem = getGenericItem();
        return new Article(genItem.getName(),genItem.getAuthor(),genItem.getYear(),month);
    }
}