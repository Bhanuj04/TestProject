package com.simple.DOM;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class STAX {
	public void Parse() {
	
		
		boolean bfane = false;
		boolean lname = false;
		
		XMLInputFactory factory =XMLInputFactory.newInstance();
        try {
			XMLEventReader eventReader = factory.createXMLEventReader(new FileReader("file:///home/bhanujarya/eclipse-workspace/Project2/src/main/java/com/simple/DOM/Input.xml"));
			
			while(eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();
				
				switch(event.getEventType()) {
				
				case XMLStreamConstants.START_ELEMENT:
				StartElement startElement = event.asStartElement();
				String qName = startElement.getName().getLocalPart();
				
				if(qName.eq)
				}
				
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	STAX obj = new STAX();
	obj.Parse();

}
}
