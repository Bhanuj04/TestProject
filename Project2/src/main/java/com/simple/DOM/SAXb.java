package com.simple.DOM;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXb {  
	public void parse() {
	try {
		//Defines a factory API that enables applications to configure and obtain a SAX based parser to parse XML documents.
		SAXParserFactory fact = SAXParserFactory.newInstance();
		//Obtain a new instance of a SAXParserFactory.
		SAXParser saxParser =fact.newSAXParser();
		// provides method to parse XML document using event handlers
		SAXb obj = new SAXb();
		//to handle events we use dafault handler class
		DefaultHandler handle = new DefaultHandler() {
			boolean bfname = false, lname = false;
			String rollno;
			//uniform resource identifier qualified name 
			//to read elements
			public void startElement(String uri,String localName,String qName, 
					Attributes attributes ) throws SAXException {
			
				if(qName.equalsIgnoreCase("student")) {
					 rollno = attributes.getValue("rollno");
				
				
				if(("393").equals(rollno) && qName.equalsIgnoreCase("student")) {
					System.out.println("Roll no " + qName);
				}}
				
				if(qName.equals("firstname")) bfname= true;
				if(qName.equals("lastname")) bfname= true;
			}
			
			public void endElement(String uri, String localName, String qName) {
				
				if(qName.equalsIgnoreCase("student")) {
					if(("393").equals(rollno) && qName.equalsIgnoreCase("student")) {
						System.out.println("End element" + qName);
					}
				}
			}
			
			public void characters(char ch[],int start,int length) throws SAXException
			{
				if(bfname && ("393").equals(rollno)) {
					System.out.println("First name " + new String(ch,start,length));
					bfname = false;
				}
				else if(lname && ("393").equals(rollno)) {
					System.out.println("Last name  " + new String(ch,start,length));
					lname = false;
				}
			}
			
		};
		saxParser.parse("file:///home/bhanujarya/eclipse-workspace/Project2/src/main/java/com/simple/DOM/Input.xml", handle);
		//Parse the content of the file specified as XML using the specified DefaultHandler.
	}
	catch(Exception e) {
		
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SAXb obj = new SAXb();
		obj.parse();;

	}

}
