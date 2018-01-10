package bookExamples.xmlexample;


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
import java.io.StringWriter;
import org.w3c.dom.*;

public class LoadingAnXmlFile {

    public static void main(String[] args) {

            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document dom = documentBuilder.parse("/home/shneior/myIntellijProjects/oop/cars.xml");
            Element carsElement = dom.getDocumentElement();
            NodeList ownerList = carsElement.getElementsByTagName("owner");


            for (int i = 0; i <ownerList.getLength() ; i++) {
                Element owner = (Element) ownerList.item(i);
                if (owner.getAttribute("name").equals("Jane")){
                    NodeList carList = owner.getElementsByTagName("car");
                    printCarList(carList);
                }
            }


        }
        catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        }
        catch (SAXException se) {
            System.out.println(se.getMessage());
        }
        catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }


    private static void printCarList(NodeList carList){
            String vin,make,model,year,color;

        for (int i = 0; i <carList.getLength() ; i++) {
            Element carElement = (Element)carList.item(i);
         vin = carElement.getAttribute("vin");
         make = carElement.getElementsByTagName("make").item(0).getTextContent();
         model = carElement.getElementsByTagName("model").item(0).getTextContent();
         year = carElement.getElementsByTagName("year").item(0).getTextContent();
         color  = carElement.getElementsByTagName("color").item(0).getTextContent();
         Car car = new Car(vin,make,model,Integer.parseInt(year),color);
         System.out.println(car.toString());

        }
    }

    public static void printXmlDocument(Document xml) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(xml);
            transformer.transform(source, result);
            System.out.println(result.getWriter().toString());
        } catch (TransformerConfigurationException e) {
            System.err.println("XML Printing Failed");
        } catch (TransformerException e) {
            System.err.println("XML Printing Failed");
        }
    }

}

