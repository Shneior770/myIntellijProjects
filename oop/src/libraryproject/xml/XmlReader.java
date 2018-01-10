package libraryproject.xml;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class XmlReader {

    public LocalDateTime getBorrowTime(Element element){
        NodeList list = element.getElementsByTagName("borrowTime");
        String time = list.item(0).getTextContent();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        if (!time.equals("")){
            LocalDateTime dateTime = LocalDateTime.parse(time,formatter);
            return dateTime;
        }

        return null;
    }

}
