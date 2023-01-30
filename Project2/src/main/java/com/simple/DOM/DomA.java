package com.simple.DOM;


import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomA {

	public static void main(String[] args) {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("/home/bhanujarya/eclipse-workspace/Project2/src/main/java/com/simple/DOM/people.xml");
			
			//read root element                       locate root element   get its name
			System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			NodeList personList= doc.getElementsByTagName("person");
			for(int i=0;i<personList.getLength();i++) {    //loop 2 times as we have 2 person tags
				Node p = personList.item(i);
				if(p.getNodeType()==Node.ELEMENT_NODE) {
					Element person = (Element) p;   //Downcast
					String id = person.getAttribute("id");
					
					NodeList nameList = person.getChildNodes();
					for(int j=0;j<nameList.getLength();j++) {
						Node n = nameList.item(j);
						if(n.getNodeType()==Node.ELEMENT_NODE) {
							Element name = (Element) n;     //Downcasting
							System.out.println("Person" + id + ":" + name.getTagName()+ "="+name.getTextContent());
							
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
