package libraryproject.xml;

import libraryproject.LibraryItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class XmlHandler implements LibraryItemsRepository {

    final private List<LibraryItem> itemsList;
    private NodeList libraryElements;
    private Document document;
    private File file;
    private XmlSectionExtractor extractor;

    public XmlHandler(String filePath) {
        this.extractor = new XmlSectionExtractor();
        this.itemsList = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            file = new File(filePath);
            document = builder.parse(file);
            Element rootElement = document.getDocumentElement();
            libraryElements = rootElement.getChildNodes();

            for (int i = 0; i < libraryElements.getLength(); i++) {
                if (!libraryElements.item(i).getNodeName().equals("#text"))
                    itemsList.add(extractor.extractItem((Element) libraryElements.item(i)));
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void borrowItem(LibraryItem item, LocalDateTime borrowTime) {
        Element element = findElement(item);
        XmlWriter writer = new XmlWriter(document, file);
        writer.setBorrowTime(element, borrowTime);
    }

    @Override
    public LocalDateTime getBorrowTime(LibraryItem item) {
        Element element = findElement(item);
        XmlReader reader = new XmlReader();
        return reader.getBorrowTime(element);
    }

    @Override
    public List<LibraryItem> getAllItems() {
        return itemsList;
    }

    @Override
    public void returnItem(LibraryItem item) {
        Element element = findElement(item);
        XmlWriter writer = new XmlWriter(document, file);
        writer.removeBorrowTime(element);

    }

    private Element findElement(LibraryItem item) {
        for (int i = 0; i < libraryElements.getLength(); i++) {
            if (!libraryElements.item(i).getNodeName().equals("#text")) {
                LibraryItem item2 = extractor.extractItem((Element) libraryElements.item(i));
                if (item.equals(item2)) {
                    return (Element) libraryElements.item(i);
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
