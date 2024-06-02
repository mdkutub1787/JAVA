package testxml;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestXMLReader {

    public static void main(String[] args) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("student.xml");
            document.getDocumentElement().normalize();
            Element element = document.getDocumentElement();
            System.out.println("Root Element : " + element.getNodeName());

            NodeList nodeList = document.getElementsByTagName("student");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) node;

                    String id = e.getElementsByTagName("id").item(0).getTextContent();
                    String name = e.getElementsByTagName("name").item(0).getTextContent();
                    String position = e.getElementsByTagName("position").item(0).getTextContent();
                    String salary = e.getElementsByTagName("salary").item(0).getTextContent();

                    System.out.println("Student ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Position: " + position);
                    System.out.println("Salary: " + salary);
                    System.out.println("_____________________");

                }
            }

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(TestXMLReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(TestXMLReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestXMLReader.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
