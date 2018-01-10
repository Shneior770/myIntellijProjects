package libraryproject.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class XmlWriter {
    private Document document;
    private File file;

    public XmlWriter(Document document, File file) {
        this.document = document;
        this.file = file;
    }

    public void setBorrowTime(Element element, LocalDateTime dateTime) {
        NodeList list = element.getElementsByTagName("borrowTime");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        list.item(0).setTextContent(formattedDateTime);
        modifyXml();
    }

    public void removeBorrowTime(Element element) {
        NodeList list = element.getElementsByTagName("borrowTime");
        list.item(0).setTextContent("");
        modifyXml();
    }

    private void modifyXml() {
        TransformerFactory factory = TransformerFactory.newInstance();

        try {
            Transformer transformer = factory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }

}
