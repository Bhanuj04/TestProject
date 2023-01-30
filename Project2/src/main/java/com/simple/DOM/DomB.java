package com.simple.DOM;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class DomB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			//root element
			Element rootElement =doc.createElement("car");
			doc.appendChild(rootElement);
			//supercar element
			Element supercar =doc.createElement("supercars");
			doc.appendChild(supercar);
			//creating attributes 
			Attr attr = doc.createAttribute("company");
			attr.setValue("Ferari");
			supercar.setAttributeNode(attr);
			
			Element carname=doc.createElement("carname");
			Attr attrtype=doc.createAttribute("type");
			attrtype.setValue("Formula one");
			carname.setAttributeNode(attrtype);
			carname.appendChild(doc.createTextNode("Ferari 100"));
			supercar.appendChild(carname);
			
			
			//writing contents in xml
			TransformerFactory transformer =TransformerFactory.newInstance();
			TransformerFactory Transformer = TransformerFactory.newTransformer();
			
			
			
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
