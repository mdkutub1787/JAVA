package testxml;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XMLReader {

    public static void main(String[] args) throws IOException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document d = builder.parse("student");
            d.getDocumentElement().normalize();
            Element root = d.getDocumentElement();
            System.out.println("Root Element : " + root.getNodeName());

            NodeList nodeList = d.getElementsByTagName("student");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String id = element.getElementsByTagName("id").item(0).getTextContent();
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    String position = element.getElementsByTagName("position").item(0).getTextContent();
                    String salary = element.getElementsByTagName("salary").item(0).getTextContent();

                    System.out.println("Employee ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Position: " + position);
                    System.out.println("Salary: " + salary);
                    System.out.println("---------------------------");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
