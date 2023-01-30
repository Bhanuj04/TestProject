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

public class DomC {

	public static void main(String[] args) {
		DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc =builder.parse("/home/bhanujarya/eclipse-workspace/Project2/src/main/java/com/simple/DOM/protocol.xml");
			System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			
			
			NodeList channelList= doc.getElementsByTagName("channel");
			for(int i=0;i<channelList.getLength();i++) {
				Node c=channelList.item(i);
				if(c.getNodeType()==Node.ELEMENT_NODE) {
					
				
				Element channel = (Element) c;
				
			//	String version = channels.getAttribute("version");
				NodeList chanList =channel.getChildNodes();
			//	System.out.println(channel.getAttribute("channelId"));
				for(int j=0;j<chanList.getLength();j++) {
					Node n = chanList.item(j);
					if(n.getNodeType()== Node.ELEMENT_NODE) {
						Element typee = (Element) n;
						Node s = chanList.item(5);
						Element sequence =(Element) s;
						
						System.out.println("Protocols are " + typee.getTagName() +" "+typee.getTextContent());
						System.out.println(sequence.getTextContent());
					}
					
					
				}
				Node s = chanList.item(5);
				Element sequence =(Element) s;
				System.out.println(sequence.getTextContent());
				Node g = chanList.item(9);
				Element seq = (Element) g;
				System.out.println(seq.getTextContent()+seq.getNodeName());
				
				
				System.out.println("***");
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
