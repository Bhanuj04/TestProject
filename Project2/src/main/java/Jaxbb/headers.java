package Jaxbb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class headers {

	@XmlElement(name="header")
	private String header;
	
	
	

	

	public headers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	@Override
	public String toString() {
		return "headers [header=" + header + "]";
	}
	
	
	
	
}
