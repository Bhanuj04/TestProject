package com.simple.DOM;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAX {
	int rollno;
	String firstname;
	SAX(int rollno,String firstname) {
		this.rollno=rollno;
		this.firstname=firstname;
	}
	
public void parseSax(int id,String name) {
	try {
		//Defines a factory API that enables applications to configure and obtain a SAX based parser to parse XML documents.
		SAXParserFactory fact = SAXParserFactory.newInstance();
		//Obtain a new instance of a SAXParserFactory.
		SAXParser saxParser =fact.newSAXParser();
		// provides method to parse XML document using event handlers
		
		//to handle events we use dafault handler class
		DefaultHandler handle = new DefaultHandler() {
			boolean bfname = false, lname = false; 
			//uniform resource identifier qualified name 
			//to read elements
			public void startElement(String uri,String localName,String qName, 
					Attributes attributes ) throws SAXException {
				System.out.println("Start Element:" + qName+" ,attributes- "+attributes.getLength()+" ,localName-"+localName + ",uri- "+uri);
				if(qName.equalsIgnoreCase("student")) {
					String rollno = attributes.getValue("rollno");
					 System.out.println("Roll No : " + rollno);
				}
				if(qName.equals("firstname")) bfname= true;
				if(qName.equals("lastname")) bfname= true;
			}
			
			public void endElement(String uri, String localName, String qName) {
				System.out.println("End element" + qName);
			}
			
			public void characters(char ch[],int start,int length) throws SAXException
			{
				if(bfname) {
					System.out.println("First name " + new String(ch,start,length)+" "+start +" "+length);
					bfname = false;
				}
				if(lname) {
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
		
		SAX obj = new SAX(25,"indore");
		
		obj.parseSax(23,"BHANUJ");

	}

}
