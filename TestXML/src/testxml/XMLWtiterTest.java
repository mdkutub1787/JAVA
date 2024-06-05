
package testxml;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class XMLWtiterTest {
    
    public static void main(String[] args) throws TransformerConfigurationException, TransformerException {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document document=builder.newDocument();
            Element rootElement=document.createElement("Rabiul");
            document.appendChild(rootElement);
            
             // First employee
            Element student1=document.createElement("student");
            rootElement.appendChild(student1);
            
            Element name1=document.createElement("name");
            name1.appendChild(document.createTextNode("Sanaullah"));
            student1.appendChild(name1);
            
            Element fname1=document.createElement("fname");
            fname1.appendChild(document.createTextNode("Janina"));
            student1.appendChild(fname1);
            
            Element home1=document.createElement("home");
            home1.appendChild(document.createTextNode("Chapay"));
            student1.appendChild(home1);
            
            
            TransformerFactory transformerFactory=TransformerFactory.newInstance();
            Transformer transformer=transformerFactory.newTransformer();
            DOMSource dOMSource=new DOMSource(document);
            StreamResult result=new StreamResult(new File("kutub.xml"));
            transformer.transform(dOMSource, result);
    
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XMLWtiterTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
