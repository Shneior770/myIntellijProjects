package bookExamples.xmlexample;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;


public class WritingXml {

    public static void main(String [] arg){
        File xmlFile = new File("/home/shneior/myIntellijProjects/oop/cars.xml");
        Document dom = loadXmlDocument(xmlFile);
        File destination =  new File("/home/shneior/myIntellijProjects/secondXml");
        NodeList owners = dom.getElementsByTagName("owner");
        for (int i = 0; i <owners.getLength() ; i++) {
            Element owner = (Element) owners.item(i);
            owner.setAttribute("name","Billy");
        }
        writeXmlDocument(dom,destination);


    }


    private static void writeXmlDocument(Document dom,File destination){

        TransformerFactory tf = TransformerFactory.newInstance();
        try {
            Transformer transformer = tf.newTransformer();
            StreamResult result = new StreamResult(destination);
            DOMSource source = new DOMSource(dom);
            transformer.transform(source,result);

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }


    }
    private static Document loadXmlDocument(File source){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document dom = null;
        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            dom = builder.parse(source);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

     return dom;
    }
}
